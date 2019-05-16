package com.bzh.floodserver.controller;

import com.bzh.floodserver.model.Stcd;
import com.bzh.floodserver.model.mapper.*;
import com.bzh.floodserver.service.RiverService;
import com.bzh.floodserver.service.StcdService;
import com.bzh.floodserver.utils.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//地图控制器
@Controller
@RequestMapping("mapController")
public class MapController {

    private final RiverService riverService;

    private final StcdService stcdService;

    @Autowired
    public MapController(RiverService riverService, StcdService stcdService) {
        this.riverService = riverService;
        this.stcdService = stcdService;

    }


    /*
     *获取河道的站点信息
     * 获取河道（时）信息
     *
     * @param tmstart 开始时间
     * @param tmend   结束时间
     * @param stcd    站号
     * @return
     */
    @ResponseBody
    @RequestMapping("riverStationInformation")
    public ResultMap Riverselect(String tmstart, String tmend, String stcd) {
        List<Rivertime> rivertimeList = riverService.selectRivertime(stcd, tmstart, tmend);
        River river = riverService.riverSelect(tmstart, tmend, stcd);
        rivertimeList = timeHandler(rivertimeList, "getYmdhm", "setSubscripttime");
        Rivercourseall rivercourseall = new Rivercourseall(river, rivertimeList);
        return new ResultMap().success().message(null).data(rivercourseall);
    }

    /***
     *  获取河库（时）信息
     *  * 获取水库水位站点信息
     * @param stcd 站号
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    @ResponseBody
    @RequestMapping("reservoirWaterLevelStationInformation")
    public ResultMap Reservoirselect(String stcd, String tmstart, String tmend) {
        Reservoir reservoir = riverService.reservoirService(stcd, tmstart, tmend);
        List<Reservoirtime> reservoirtimeList = riverService.selectReservoirtime(stcd, tmstart, tmend);
        reservoirtimeList = timeHandler(reservoirtimeList, "getTm", "setSubscripttime");
        Reservoirall reservoirall = new Reservoirall(reservoir, reservoirtimeList);
        return new ResultMap().success().message(null).data(reservoirall);
    }

    /**
     * 降雨量表格
     *
     * @param tmstart 开始时间
     * @param tmend   结束时间
     * @return
     */
    @ResponseBody
    @RequestMapping("rainfallTable")
    public ResultMap RflowSelect(String tmstart, String tmend) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date timestart = null;
        Date timeend = null;
        try {
            timestart = sdf.parse(tmstart);
            timeend = sdf.parse(tmend);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new ResultMap().success().message(null).data(riverService.rflowSelect(timestart, timeend));
    }

    /***
     * 水库表格
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    @ResponseBody
    @RequestMapping("reservoirForm")
    public ResultMap rlibrarySelect(String tmstart, String tmend) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date timestart = null;
        Date timeend = null;
        try {
            timestart = sdf.parse(tmstart);
            timeend = sdf.parse(tmend);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new ResultMap().success().message(null).data(riverService.rlibrarySelect(timestart, timeend));
    }

    /***
     * 河道表格
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    @ResponseBody
    @RequestMapping("theRiverForms")
    public ResultMap ravenueSelect(String tmstart, String tmend) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date timestart = null;
        Date timeend = null;
        try {
            timestart = sdf.parse(tmstart);
            timeend = sdf.parse(tmend);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new ResultMap().success().message(null).data(riverService.ravenueSelect(timestart, timeend));
    }

    /**
     * 获取降雨量（时）信息
     *
     * @param stcd    站号
     * @param tmstart 开始时间
     * @param tmend   结束时间
     * @return
     */
    @ResponseBody
    @RequestMapping("rainfallInformation")
    public ResultMap rainfallselect(String stcd, String tmstart, String tmend) throws ParseException {
        List<Rainfall> list = riverService.rainfallselect(stcd, tmstart, tmend);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd/HH");
        for (Rainfall rainfall : list) {
            rainfall.setTmaa(dateFormat.format(rainfall.getTm()));
        }
        list = timeHandler(list, "getTm", "setSubscripttime");
        return new ResultMap().success().message(null).data(list);
    }

    /**
     * 获取站点信息
     *
     * @return
     */
    @GetMapping("/getStcd")
    @ResponseBody
    public ResultMap getStcd() {
        List<Stcd> stcdList = stcdService.getStcd();
        return new ResultMap().success().message("success").data(stcdList);
    }

    <T> List<T> timeHandler(List<T> list, String getTm, String setSubscripttime) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd/HH");
            for (int i = 0; i < list.size(); i++) {
                T tObject = list.get(i);
                T tNextObject = null;
                if(i + 1 < list.size()){
                    tNextObject = list.get(i+1);
                }
                Class<?> tClass = tObject.getClass();
                Method getTM = tClass.getMethod(getTm);
                Method setST = tClass.getMethod(setSubscripttime,String.class);
                Date timeA = (Date) getTM.invoke(tObject);
                Date timeB = null;
                if (i + 1 < list.size()) {
                    timeB = (Date) getTM.invoke(tNextObject);
                }
                if (i == 0 || list.size() - 1 == i) {
                    setST.invoke(tObject, sdf.format(timeA));
                } else {
                    if (timeB != null) {
                        if (timeA.getYear() == timeB.getYear()) {
                            if (timeA.getMonth() == timeB.getMonth()) {
                                if (timeA.getDate() == timeB.getDate()) {
                                    if (timeA.getHours() != 0) {
                                        setST.invoke(tObject, timeA.getHours() + "");
                                    }
                                } else {
                                    setST.invoke(tObject, timeA.getHours() + "");
                                    setST.invoke(tNextObject, timeB.getDate() + "/" + timeB.getHours());
                                }
                            } else {
                                setST.invoke(tObject, timeA.getHours() + "");
                                setST.invoke(tNextObject, (timeB.getMonth() + 1) + "-" + timeB.getDate() + "/" + timeB.getHours());
                            }
                        } else {
                            setST.invoke(tObject, timeA.getHours() + "");
                            setST.invoke(tNextObject, sdf.format(timeB));
                        }
                    }
                }

            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return list;
    }

}

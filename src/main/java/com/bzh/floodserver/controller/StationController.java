package com.bzh.floodserver.controller;

import com.bzh.floodserver.model.user.Station;
import com.bzh.floodserver.model.user.TStation;
import com.bzh.floodserver.service.StcdService;
import com.bzh.floodserver.utils.ResultMap;
import com.bzh.floodserver.utils.Statuscode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author: libai
 * @Date: 2019/5/23 14:10
 * @Version 1.0
 * @Description: 关于用户关注站的contoller
 */

@RestController
@RequestMapping("server/stationController")
public class StationController {
    @Autowired
    private StcdService stcdService;

    /**
     * @param
     * @return 站号，站名，县域 供于用户选择
     */
    @RequestMapping(value = "/selectSSA")
    public ResultMap selectSSA(int id) {
        List<String> stringList = stcdService.selectById(id);
        List<TStation> list= stcdService.selectSSA();
        for (int i=0;i<list.size();i++){
            List<TStation.CStation> stationList = list.get(i).getStationList();
            for (int j=0;j<stationList.size();j++){
                if (stringList!=null && stringList.contains(stationList.get(j).getSTCD())){
                    stationList.get(j).setWhether(true);
                }else{
                    stationList.get(j).setWhether(false);
                }
            }

        }
        return new ResultMap().success().data(list);
    }


    /**
     * 用户添加自己关注的站号
     *
     * @param id   用户的id
     * @param list 站号的集合
     * @return ResultMap中success或者fail是代码号，data是数据
     */
    @RequestMapping(value = "/addUserStcd")
    public ResultMap addUserStcd(@RequestParam("id") int id, @RequestParam("list") List<String> list) {
        int no = stcdService.addUserStcd(id, list);
        if (no != 0) {
            return new ResultMap().success().data("添加成功");
        }
        return new ResultMap().fail(Statuscode.permissionError).data("添加失败");
    }

    /**
     * 用户查询自己关注的站号
     *
     * @param id 用户id
     * @return ResultMap中success或者fail是代码号，data是数据
     */
    @RequestMapping(value = "/selectById")
    public ResultMap selectById(int id) {
        List<String> userStcd = stcdService.selectById(id);
        return new ResultMap().success().data(userStcd);
    }
}

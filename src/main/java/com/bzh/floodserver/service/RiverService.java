package com.bzh.floodserver.service;

import com.bzh.floodserver.model.mapper.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface RiverService {
    /**
     * 获取河道的站点信息
     * @param ymdhmA 开始时间
     * @param ymdhmB 结束时间
     * @param stcd 站号
     * @return
     */
    River riverSelect(String ymdhmA, String ymdhmB, String stcd);

    /***
     * 获取水库水位站点信息
     * @param stcd 站号
     * @param ymdhmA 开始时间
     * @param ymdhmB 结束时间
     * @return
     */
    Reservoir reservoirService(String stcd, String ymdhmA, String ymdhmB);
    /**
     * 降雨量表格
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    List<Rflow>  rflowSelect(Date tmstart, Date tmend);
    /***
     * 水库表格
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    List<Rlibrary> rlibrarySelect(Date tmstart, Date tmend);

    /***
     * 河道表格
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    List<Ravenue> ravenueSelect(Date tmstart, Date tmend);
    /**
     * 获取降雨量（时）信息
     * @param stcd 站号
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    List<Rainfall> rainfallselect(String stcd, String tmstart, String tmend) throws ParseException;

    /**
     * 获取河道（时）信息
     * @param stcd  站号
     * @param ymdhmstart 开始时间
     * @param ymdhmend 结束时间
     * @return
     */
    List<Rivertime> selectRivertime(String stcd, String ymdhmstart, String ymdhmend);

    /**
     * 获取水库（时）信息
     * @param stcd 站号
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    List<Reservoirtime> selectReservoirtime(String stcd, String tmstart, String tmend);
}

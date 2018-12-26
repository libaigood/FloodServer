package com.bzh.floodserver.mapper;

import com.bzh.floodserver.model.mapper.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 *
 */
@Repository
public interface RiverMapper {
    /**
     * 获取河道的站点信息
     * @param ymdhmA 开始时间
     * @param ymdhmB 结束时间
     * @param stcd 站号
     * @return
     */
    River riverselect(@Param("ymdhmA") Date ymdhmA, @Param("ymdhmB") Date ymdhmB ,@Param("stcd") String stcd);

    /***
     * 获取水库水位站点信息
     * @param stcd 站号
     * @param ymdhmA 开始时间
     * @param ymdhmB 结束时间
     * @return
     */
    Reservoir reservoirservice(@Param("stcd") String stcd , @Param("ymdhmA") Date ymdhmA, @Param("ymdhmB") Date ymdhmB );

    /**
     * 降雨量表格
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    List<Rflow>  rflowselect(@Param("tmstart")Date tmstart,@Param("tmend")Date tmend);


    /***
     * 水库表格
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    List<Rlibrary> rlibraryselect(@Param("tmstart")Date tmstart, @Param("tmend")Date tmend);

    /***
     * 河道表格
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    List<Ravenue> ravenueselect(@Param("tmstart")Date tmstart, @Param("tmend")Date tmend);

    /**
     * 获取降雨量（时）信息
     * @param stcd 站号
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    List<Rainfall> rainfallselect(@Param("stcd") String stcd,@Param("tmstart")String tmstart,@Param("tmend")String tmend);


    /**
     * 根据id获取警戒水位
     */
    St_rvfcch_b selectSt_rvfcch_bWrz(@Param("stcd")String stcd);

    /**
     * 获取河道（时）信息
     * @param stcd  站号
     * @param ymdhmstart 开始时间
     * @param ymdhmend 结束时间
     * @return
     */
    List<Rivertime> selectRivertime(@Param("stcd")String stcd,@Param("ymdhmstart")Date ymdhmstart,@Param("ymdhmend")Date ymdhmend);

    /**
     * 获取水库（时）信息
     * @param stcd 站号
     * @param tmstart 开始时间
     * @param tmend 结束时间
     * @return
     */
    List<Reservoirtime> selectReservoirtime(@Param("stcd") String stcd,@Param("tmstart")Date tmstart,@Param("tmend")Date tmend);


}

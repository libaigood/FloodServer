package com.bzh.floodserver.mapper;


import com.bzh.floodserver.model.sjappfu.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * 雨情信息
 * */
@Repository
public interface RainInfoDao {
	public List<Rainfalls_all> select(@Param("addvcd") List<String> addvcd);
	//雨量信息
	public List<Rainfalls_all> rainfalls_all(@Param("stm") String stm, @Param("etm") String etm, @Param("addvcd") List<String> addvcd);
	public List<Rainfalls_one> rainfalls_one(@Param("stcd") String stcd, @Param("stm") String stm, @Param("etm") String etm);
	//雨强信息
	public List<RainIntensity_all> rainIntensity_all(@Param("stm") String stm,  @Param("addvcd") List<String> addvcd);
	public List<RainIntensity_one> rainIntensity_one(@Param("stcd") String stcd, @Param("stm") String stm, @Param("etm") String etm);
	//区域降雨统计
	public List<RegionalRainfall> regionalRainfall(@Param("stm") String stm, @Param("etm") String etm);
	public List<RegionalRainfall> findadcd();
	
	public Rainfalls_one rain_detailed(@Param("stcd") String stcd);
}

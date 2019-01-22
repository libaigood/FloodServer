package com.bzh.floodserver.mapper;

import com.bzh.floodserver.model.sjappfu.WaterInfo_reservoir_all;
import com.bzh.floodserver.model.sjappfu.WaterInfo_reservoir_one;
import com.bzh.floodserver.model.sjappfu.WaterInfo_river_all;
import com.bzh.floodserver.model.sjappfu.WaterInfo_river_one;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 水情信息
 */
@Repository
public interface WaterInfoDao {

	//河道信息
	public List<WaterInfo_river_all> river_all(@Param("stm") String stm, @Param("etm") String etm, @Param("addvcd") List<String> addvcd);

	public List<WaterInfo_river_one> river_one(@Param("stcd") String stcd, @Param("stm") String stm, @Param("etm") String etm);

	public WaterInfo_river_one river_detailed(@Param("stcd") String stcd, @Param("stm") String stm);

	//水库信息
	public List<WaterInfo_reservoir_all> reservoir_all(@Param("stm") String stm, @Param("etm") String etm, @Param("addvcd") List<String> addvcd);

	public List<WaterInfo_reservoir_one> reservoir_one(@Param("stcd") String stcd, @Param("stm") String stm, @Param("etm") String etm);

	public List<WaterInfo_reservoir_one> reservoir_detailed(@Param("stcd") String stcd, @Param("stm") String stm);
}

package com.bzh.floodserver.service.serviceImpl;

import com.bzh.floodserver.mapper.WaterInfoDao;
import com.bzh.floodserver.model.sjappfu.*;
import com.bzh.floodserver.service.NoDataException;
import com.bzh.floodserver.service.WaterInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 水情信息
 * */
@Service
public class WaterInfoServiceImpl implements WaterInfoService {

	@Resource
	private WaterInfoDao waterInfoDao;
	

	//河道信息
	public List<WaterInfo_river_all> river_all(String stm, String etm, String addvcd) throws NoDataException{
		return waterInfoDao.river_all(stm, etm, addvcd);
	}
	public List<WaterInfo_river_one> river_one(String stcd, String stm, String etm)throws NoDataException{
		List<WaterInfo_river_one> list = waterInfoDao.river_one(stcd, stm, etm);
		if(list.size() == 0) {
			throw new NoDataException("没有数据!");
		}
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm" );
		double nowz = list.get(0).getZ();
		String nowtm = sdf.format(list.get(0).getTm());
		double minz = 0;
		String mintm = "";
		double maxz = 0;
		String maxtm = "";
		for(int i = 0; i < list.size(); i++) {
			WaterInfo_river_one wro= list.get(i);
			Date tm = wro.getTm();
			String sdftm = sdf.format(tm);
			wro.setTtt(sdftm.substring(5));
			double z = wro.getZ();
			if(z<=minz) {
				minz=z;
				mintm = sdf.format(tm);
			}
			if(z>=maxz) {
				maxz=z;
				maxtm = sdf.format(tm);
			}
		}
		for(int i = 0; i < list.size(); i++) {
			list.get(i).setNowz("当前水位: "+nowz+"mm "+nowtm);
			list.get(i).setMinz("最低水位: "+minz+"mm "+mintm);
			list.get(i).setMaxz("最高水位: "+maxz+"mm "+maxtm);
			System.out.println(sdf.format(list.get(i).getTm()));
			System.out.println(list.get(i).getTtt());
		}
		return list;
	}
	
	public WaterInfo_river_one river_detailed(String stcd) throws NoDataException{
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );
		String stm = sdf.format(new Date())+" 08:00:00";
		WaterInfo_river_one wir = waterInfoDao.river_detailed(stcd, stm);
		if(wir == null) {
			throw new NoDataException("没有数据！");
		}
		return wir;
	}

	//水库信息
	public List<WaterInfo_reservoir_all> reservoir_all( String stm, String etm, String addvcd) throws NoDataException{
		return waterInfoDao.reservoir_all(stm, etm, addvcd);
	}
	public List<WaterInfo_reservoir_one> reservoir_one( String stcd, String stm, String etm)throws NoDataException{
		List<WaterInfo_reservoir_one> list = waterInfoDao.reservoir_one(stcd, stm, etm);
		if(list.size() == 0) {
			throw new NoDataException("没有数据!");
		}
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm" );
		double nowrz = list.get(0).getRz();
		String nowtm = sdf.format(list.get(0).getTm());
		double minrz = 0;
		String mintm = "";
		double maxrz = 0;
		String maxtm = "";
		for(int i = 0; i < list.size(); i++) {
			WaterInfo_reservoir_one wro= list.get(i);
			Date tm = wro.getTm();
			String sdftm = sdf.format(tm);
			wro.setTtt(sdftm.substring(5));
			double rz = wro.getRz();
			if(rz<=minrz) {
				minrz=rz;
				mintm = sdf.format(tm);
			}  
			if(rz>=maxrz) {
				maxrz=rz;
				maxtm = sdf.format(tm);
			}
		}
		for(int i = 0; i < list.size(); i++) {
			list.get(i).setNowrz("当前水位: "+nowrz+"m "+nowtm);
			list.get(i).setMinrz("最低水位: "+minrz+"m "+mintm);
			list.get(i).setMaxrz("最高水位: "+maxrz+"m "+maxtm);
		}
		return list;
	}
	
	public WaterInfo_reservoir_one reservoir_detailed(String stcd) throws NoDataException{
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );
		String stm = sdf.format(new Date())+" 08:00:00";
		WaterInfo_reservoir_one wir = waterInfoDao.reservoir_detailed(stcd, stm);
		if(wir == null) {
			throw new NoDataException("没有数据！");
		}
		return wir;
	}
}

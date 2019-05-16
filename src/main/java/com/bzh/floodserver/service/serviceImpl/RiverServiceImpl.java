package com.bzh.floodserver.service.serviceImpl;

import com.bzh.floodserver.mapper.RiverMapper;
import com.bzh.floodserver.model.mapper.*;
import com.bzh.floodserver.service.RiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class RiverServiceImpl implements RiverService {
	@Autowired
	private RiverMapper riverMapper;

	@Override
	public River riverSelect(String ymdhmA, String ymdhmB, String stcd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date timestart = null;
		Date timeend = null;
		try {
			timestart = sdf.parse(ymdhmA);
			timeend = sdf.parse(ymdhmB);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		St_rvfcch_b jingJieShuiWei = riverMapper.selectSt_rvfcch_bWrz(stcd);
		River rivers = riverMapper.riverselect(timestart, timeend, stcd);
		double chaochu = 0;
		if (rivers != null && jingJieShuiWei != null) {

			if (jingJieShuiWei.getWrz() < rivers.getZ()) {
				chaochu = rivers.getZ() - jingJieShuiWei.getWrz();
				rivers.setChaochu(chaochu);
			}
		}
		return rivers;
	}

	@Override
	public Reservoir reservoirService(String stcd, String ymdhmA, String ymdhmB) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date timeA = null;
		Date timeB = null;
		try {
			timeA = sdf.parse(ymdhmA);
			timeB = sdf.parse(ymdhmB);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return riverMapper.reservoirservice(stcd, timeA, timeB);
	}

	@Override
	public List<Rflow> rflowSelect(Date tmstart, Date tmend) {
		return riverMapper.rflowselect(tmstart, tmend);
	}

	@Override
	public List<Rlibrary> rlibrarySelect(Date tmstart, Date tmend) {
		return riverMapper.rlibraryselect(tmstart, tmend);
	}

	@Override
	public List<Ravenue> ravenueSelect(Date tmstart, Date tmend) {
		return riverMapper.ravenueselect(tmstart, tmend);
	}

	@Override
	public List<Rainfall> rainfallselect(String stcd, String tmstart, String tmend) throws ParseException {
		//创建一个雨量表的集合
		List<Rainfall> list = riverMapper.rainfallselect(stcd, tmstart, tmend);
		//创建一个遍历时间的对象
		Calendar now = Calendar.getInstance();
		//创建时间格式
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

		Calendar calendar = Calendar.getInstance();

		calendar.setTime(dateFormat.parse(tmstart));

		now.setTime(dateFormat.parse(tmend));
		//获取时间
		Date endTime = now.getTime();
		//获取时
		int endHour = now.get(Calendar.HOUR_OF_DAY);
		//获取日
		int endDate = now.get(Calendar.DATE);
		now.add(Calendar.DATE, 1);
		now.set(Calendar.HOUR_OF_DAY, 7);

		Rainfall mRainfall = null;
		List<Rainfall> rainfalls = new ArrayList<>();
		calendar.setTime(dateFormat.parse(tmstart));
		calendar.add(Calendar.HOUR_OF_DAY, -1);
		calendar.set(Calendar.MINUTE, 0);
		int cha = daysBetween(dateFormat.parse(tmstart), now.getTime()) + 1;
		for (int i = 0; i < cha; i++) {
			calendar.add(Calendar.HOUR_OF_DAY, 1);
			mRainfall = new Rainfall(calendar.getTime(), "0.0");
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).getTm().getTime() == calendar.getTime().getTime()) {
					if (list.get(j).getDrp() == null) {
						mRainfall = new Rainfall(calendar.getTime(), "0.0");
					} else {
						mRainfall = list.get(j);
					}
					list.remove(j);
					continue;
				}
			}
			if (calendar.getTime().getTime() > endTime.getTime()) {
				mRainfall = new Rainfall(calendar.getTime(), "--");
			}
			rainfalls.add(mRainfall);
		}

		return rainfalls;
	}

	/**
	 * 计算两个日期之间相差的小时差
	 *
	 * @param smdate 较小的时间
	 * @param bdate  较大的时间
	 * @return 相差天数
	 * @throws ParseException calendar 对日期进行时间操作
	 *                        getTimeInMillis() 获取日期的毫秒显示形式
	 */
	public int daysBetween(Date smdate, Date bdate) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600);
		return Integer.parseInt(String.valueOf(between_days));
	}

	@Override
	public List<Rivertime> selectRivertime(String stcd, String ymdhmstart, String ymdhmend) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date timestart = null;
		Date timeend = null;
		try {
			timestart = sdf.parse(ymdhmstart);
			timeend = sdf.parse(ymdhmend);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<Rivertime> list = riverMapper.selectRivertime(stcd, timestart, timeend);
		List<Rivertime> newlist = new ArrayList<>();
		Rivertime rivertime;
		Rivertime newRivertime = null;
		for (int i = 0; i < list.size(); i++) {
			if (newRivertime != null) {
				rivertime = newRivertime;
			} else {
				rivertime = list.get(i);
			}
			if (i != list.size() - 1) {
				if (rivertime.getYmdhm().getTime() != list.get(i + 1).getYmdhm().getTime()) {
					newlist.add(rivertime);
					newRivertime = null;
				} else if (rivertime.getZr() != 0.0) {
					newRivertime = rivertime;
					continue;
				} else {
					newRivertime = null;
					continue;
				}
			} else {
				if (i != 0) {
					newlist.add(list.get(i));
				}
			}
		}
		for (Rivertime r : newlist) {
			System.out.println(r);
		}
		return newlist;
	}

	@Override
	public List<Reservoirtime> selectReservoirtime(String stcd, String tmstart, String tmend) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date timestart = null;
		Date timeend = null;
		try {
			timestart = sdf.parse(tmstart);
			timeend = sdf.parse(tmend);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return riverMapper.selectReservoirtime(stcd, timestart, timeend);
	}
}

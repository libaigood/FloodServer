package com.bzh.floodserver.service;

import java.util.Calendar;
import java.util.Date;

public class SomeForRain {
	//单个站点信息显示时所需的时段计算
	public static int getshiduan(Date date,int timelength) {
		Calendar calender = Calendar.getInstance();
		calender.setTime(date);
		int hour=calender.get(Calendar.HOUR_OF_DAY);
		int min=calender.get(Calendar.MINUTE);
		
		if(timelength==12) {
			if(hour == 8 && min > 0 ||hour==9 || hour==10 || hour==11 || hour==12 || hour==13 || hour == 14  ||hour==15 || hour==16 || hour==17 || hour==18 || hour==19 || hour==20 && min==0) {
				return 8;
			}else{
				return 20;
			}
		}
		if(timelength==6) {
			if(hour == 8 && min > 0 ||hour==9 || hour==10 || hour==11 || hour==12 || hour==13 || hour==14 && min==0) {
				return 8;
			}else if(hour == 14 && min > 0 ||hour==15 || hour==16 || hour==17 || hour==18 || hour==19 || hour==20 && min==0) {
				return 14;
			}else if(hour == 20 && min > 21 ||hour==22 || hour==23 || hour==24 || hour==1 || hour==2 && min==0) {
				return 20;
			}else{
				return 2;
			}
		}
		if(timelength==3) {
			if(hour == 8 && min > 0 ||hour==9 || hour==10 || hour==11 && min==0) {
				return 8;
			}else if(hour == 11 && min > 0 ||hour==12 || hour==13 || hour==14 && min==0) {
				return 11;
			}else if(hour == 14 && min > 0 ||hour==15 || hour==16 || hour==17 && min==0) {
				return 14;
			}else if(hour == 17 && min > 0 ||hour==8 || hour==19 || hour==20 && min==0) {
				return 17;
			}else if(hour == 20 && min > 0 ||hour==21 || hour==22 || hour==23 && min==0) {
				return 20;
			}else if(hour == 23 && min > 0 ||hour==0 || hour==1 || hour==2 && min==0) {
				return 23;
			}else if(hour == 2 && min > 0 ||hour==3 || hour==4 || hour==5 && min==0) {
				return 2;
			}else{
				return 5;
			}
		}
		if(timelength==1) {
			if(hour==0 && min>0 || hour==1 && min==0) {
				return 0;
			}else if(hour==1 && min>0 || hour==2 && min==0) {
				return 1;
			}else if(hour==2 && min>0 || hour==3 && min==0) {
				return 2;
			}else if(hour==3 && min>0 || hour==4 && min==0) {
				return 3;
			}else if(hour==4 && min>0 || hour==5 && min==0) {
				return 4;
			}else if(hour==5 && min>0 || hour==6 && min==0) {
				return 5;
			}else if(hour==6 && min>0 || hour==7 && min==0) {
				return 6;
			}else if(hour==7 && min>0 || hour==8 && min==0) {
				return 7;
			}else if(hour==8 && min>0 || hour==9 && min==0) {
				return 8;
			}else if(hour==9 && min>0 || hour==10 && min==0) {
				return 9;
			}else if(hour==10 && min>0 || hour==11 && min==0) {
				return 10;
			}else if(hour==11 && min>0 || hour==12 && min==0) {
				return 11;
			}else if(hour==12 && min>0 || hour==13 && min==0) {
				return 12;
			}else if(hour==13 && min>0 || hour==14 && min==0) {
				return 13;
			}else if(hour==14 && min>0 || hour==15 && min==0) {
				return 14;
			}else if(hour==15 && min>0 || hour==16 && min==0) {
				return 15;
			}else if(hour==16 && min>0 || hour==17 && min==0) {
				return 16;
			}else if(hour==17 && min>0 || hour==18 && min==0) {
				return 17;
			}else if(hour==18 && min>0 || hour==19 && min==0) {
				return 18;
			}else if(hour==19 && min>0 || hour==20 && min==0) {
				return 19;
			}else if(hour==20 && min>0 || hour==21 && min==0) {
				return 20;
			}else if(hour==21 && min>0 || hour==22 && min==0) {
				return 21;
			}else if(hour==22 && min>0 || hour==23 && min==0) {
				return 22;
			}{
				return 23;
			}
		}
		
		return 8;
	}

	//点击单个站点时显示的时间字符串
	@SuppressWarnings("deprecation")
	public static String tmstr(Date date,int sd, int timelength) {
		Calendar calender = Calendar.getInstance();
		calender.setTime(date);
		
		calender.set(date.getYear(), date.getMonth()+1, date.getDate(), sd, 0);
		int mon=calender.get(Calendar.MONTH);
		int dat=calender.get(Calendar.DATE);
		int h=calender.get(Calendar.HOUR_OF_DAY);
		String str1=(mon<10?"0"+mon:""+mon)+(dat<10?"-0"+dat:"-"+dat)+(h<10?" 0"+h:" "+h)+":00";
		
		calender.set(date.getYear(), date.getMonth()+1, date.getDate(), sd+timelength, 0);
		mon=calender.get(Calendar.MONTH);
		dat=calender.get(Calendar.DATE);
		h=calender.get(Calendar.HOUR_OF_DAY);
		String str2=(mon<10?"0"+mon:""+mon)+(dat<10?"-0"+dat:"-"+dat)+(h<10?" 0"+h:" "+h)+":00";
		
		String tmstr=str1+" ~ "+str2;
		
		return tmstr;
	}
	
	//雨强信息中的时间字符串
	@SuppressWarnings("deprecation")
	public static String tmstr_yq(Date date,int sd, int timelength) {
		Calendar calender = Calendar.getInstance();
		calender.setTime(date);
		
		calender.set(date.getYear(), date.getMonth()+1, date.getDate(), sd, 0);
		int mon=calender.get(Calendar.MONTH);
		int dat=calender.get(Calendar.DATE);
		int h=calender.get(Calendar.HOUR_OF_DAY);
		String str1=(mon<10?"0"+mon:""+mon)+(dat<10?"-0"+dat:"-"+dat)+(h<10?" 0"+h:" "+h)+":00";
		
		calender.set(date.getYear(), date.getMonth()+1, date.getDate(), sd+timelength, 0);
		mon=calender.get(Calendar.MONTH);
		dat=calender.get(Calendar.DATE);
		h=calender.get(Calendar.HOUR_OF_DAY);
		String str2=(mon<10?"0"+mon:""+mon)+(dat<10?"-0"+dat:"-"+dat)+(h<10?" 0"+h:" "+h)+":00";
		
		String tmstr=str1+" ~ "+str2;
		
		return tmstr;
	}
}

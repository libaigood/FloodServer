package com.bzh.floodserver.model.sjappfu;

import java.io.Serializable;
import java.util.Date;


/**
 * 局部降雨信息
 * */
public class RegionalRainfall  implements Serializable{

	private static final long serialVersionUID = -8559836901873183343L;
	
	private String stcd;
	private Date tm;
	private double drp;
	private String adcd;
	private String adnm;
	
	private String ttt;
	private double sumdrp;
	private double avgdrp;
	private double maxdpr;
	private int over50;
	private int num;
	public RegionalRainfall() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegionalRainfall(String stcd, Date tm, double drp, String adcd, String adnm, String ttt, double sumdrp,
			double avgdrp, double maxdpr, int over50, int num) {
		super();
		this.stcd = stcd;
		this.tm = tm;
		this.drp = drp;
		this.adcd = adcd;
		this.adnm = adnm;
		this.ttt = ttt;
		this.sumdrp = sumdrp;
		this.avgdrp = avgdrp;
		this.maxdpr = maxdpr;
		this.over50 = over50;
		this.num = num;
	}
	@Override
	public String toString() {
		return "RegionalRainfall [stcd=" + stcd + ", tm=" + tm + ", drp=" + drp + ", adcd=" + adcd + ", adnm=" + adnm
				+ ", ttt=" + ttt + ", sumdrp=" + sumdrp + ", avgdrp=" + avgdrp + ", maxdpr=" + maxdpr + ", over50="
				+ over50 + ", num=" + num + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adcd == null) ? 0 : adcd.hashCode());
		result = prime * result + ((adnm == null) ? 0 : adnm.hashCode());
		long temp;
		temp = Double.doubleToLongBits(avgdrp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(drp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(maxdpr);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + num;
		result = prime * result + over50;
		result = prime * result + ((stcd == null) ? 0 : stcd.hashCode());
		temp = Double.doubleToLongBits(sumdrp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tm == null) ? 0 : tm.hashCode());
		result = prime * result + ((ttt == null) ? 0 : ttt.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegionalRainfall other = (RegionalRainfall) obj;
		if (adcd == null) {
			if (other.adcd != null)
				return false;
		} else if (!adcd.equals(other.adcd))
			return false;
		if (adnm == null) {
			if (other.adnm != null)
				return false;
		} else if (!adnm.equals(other.adnm))
			return false;
		if (Double.doubleToLongBits(avgdrp) != Double.doubleToLongBits(other.avgdrp))
			return false;
		if (Double.doubleToLongBits(drp) != Double.doubleToLongBits(other.drp))
			return false;
		if (Double.doubleToLongBits(maxdpr) != Double.doubleToLongBits(other.maxdpr))
			return false;
		if (num != other.num)
			return false;
		if (over50 != other.over50)
			return false;
		if (stcd == null) {
			if (other.stcd != null)
				return false;
		} else if (!stcd.equals(other.stcd))
			return false;
		if (Double.doubleToLongBits(sumdrp) != Double.doubleToLongBits(other.sumdrp))
			return false;
		if (tm == null) {
			if (other.tm != null)
				return false;
		} else if (!tm.equals(other.tm))
			return false;
		if (ttt == null) {
			if (other.ttt != null)
				return false;
		} else if (!ttt.equals(other.ttt))
			return false;
		return true;
	}
	public String getStcd() {
		return stcd;
	}
	public void setStcd(String stcd) {
		this.stcd = stcd;
	}
	public Date getTm() {
		return tm;
	}
	public void setTm(Date tm) {
		this.tm = tm;
	}
	public double getDrp() {
		return drp;
	}
	public void setDrp(double drp) {
		this.drp = drp;
	}
	public String getAdcd() {
		return adcd;
	}
	public void setAdcd(String adcd) {
		this.adcd = adcd;
	}
	public String getAdnm() {
		return adnm;
	}
	public void setAdnm(String adnm) {
		this.adnm = adnm;
	}
	public String getTtt() {
		return ttt;
	}
	public void setTtt(String ttt) {
		this.ttt = ttt;
	}
	public double getSumdrp() {
		return sumdrp;
	}
	public void setSumdrp(double sumdrp) {
		this.sumdrp = sumdrp;
	}
	public double getAvgdrp() {
		return avgdrp;
	}
	public void setAvgdrp(double avgdrp) {
		this.avgdrp = avgdrp;
	}
	public double getMaxdpr() {
		return maxdpr;
	}
	public void setMaxdpr(double maxdpr) {
		this.maxdpr = maxdpr;
	}
	public int getOver50() {
		return over50;
	}
	public void setOver50(int over50) {
		this.over50 = over50;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}

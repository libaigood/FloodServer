package com.bzh.floodserver.model.sjappfu;

import java.io.Serializable;
import java.util.Date;

/**
 * 水情信息_河道
 * */
public class WaterInfo_river_all implements Serializable{

	private static final long serialVersionUID = -2118289910241991188L;
	
	private String stcd;
	private String stnm;
	private String rvnm;
	private Date tm;
	private String ttt;
	private double z;
	private double q;
	private double wrz;
	private double cjjsw;//超警戒水位=q-wrz
	private String sts;

	public WaterInfo_river_all() {
		super();
	}
	public WaterInfo_river_all(String stcd, String stnm, String rvnm, Date tm, String ttt, double z, double q,
			double wrz, double cjjsw, String sts) {
		super();
		this.stcd = stcd;
		this.stnm = stnm;
		this.rvnm = rvnm;
		this.tm = tm;
		this.ttt = ttt;
		this.z = z;
		this.q = q;
		this.wrz = wrz;
		this.cjjsw = cjjsw;
		this.sts = sts;
	}
	@Override
	public String toString() {
		return "WaterInfo_river_all [stcd=" + stcd + ", stnm=" + stnm + ", rvnm=" + rvnm + ", tm=" + tm + ", ttt=" + ttt
				+ ", z=" + z + ", q=" + q + ", wrz=" + wrz + ", cjjsw=" + cjjsw + ", sts=" + sts + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cjjsw);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(q);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((rvnm == null) ? 0 : rvnm.hashCode());
		result = prime * result + ((stcd == null) ? 0 : stcd.hashCode());
		result = prime * result + ((stnm == null) ? 0 : stnm.hashCode());
		result = prime * result + ((sts == null) ? 0 : sts.hashCode());
		result = prime * result + ((tm == null) ? 0 : tm.hashCode());
		result = prime * result + ((ttt == null) ? 0 : ttt.hashCode());
		temp = Double.doubleToLongBits(wrz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		WaterInfo_river_all other = (WaterInfo_river_all) obj;
		if (Double.doubleToLongBits(cjjsw) != Double.doubleToLongBits(other.cjjsw))
			return false;
		if (Double.doubleToLongBits(q) != Double.doubleToLongBits(other.q))
			return false;
		if (rvnm == null) {
			if (other.rvnm != null)
				return false;
		} else if (!rvnm.equals(other.rvnm))
			return false;
		if (stcd == null) {
			if (other.stcd != null)
				return false;
		} else if (!stcd.equals(other.stcd))
			return false;
		if (stnm == null) {
			if (other.stnm != null)
				return false;
		} else if (!stnm.equals(other.stnm))
			return false;
		if (sts == null) {
			if (other.sts != null)
				return false;
		} else if (!sts.equals(other.sts))
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
		if (Double.doubleToLongBits(wrz) != Double.doubleToLongBits(other.wrz))
			return false;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		return true;
	}
	public String getStcd() {
		return stcd;
	}
	public void setStcd(String stcd) {
		this.stcd = stcd;
	}
	public String getStnm() {
		return stnm;
	}
	public void setStnm(String stnm) {
		this.stnm = stnm;
	}
	public String getRvnm() {
		return rvnm;
	}
	public void setRvnm(String rvnm) {
		this.rvnm = rvnm;
	}
	public Date getTm() {
		return tm;
	}
	public void setTm(Date tm) {
		this.tm = tm;
	}
	public String getTtt() {
		return ttt;
	}
	public void setTtt(String ttt) {
		this.ttt = ttt;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getQ() {
		return q;
	}
	public void setQ(double q) {
		this.q = q;
	}
	public double getWrz() {
		return wrz;
	}
	public void setWrz(double wrz) {
		this.wrz = wrz;
	}
	public double getCjjsw() {
		return cjjsw;
	}
	public void setCjjsw(double cjjsw) {
		this.cjjsw = cjjsw;
	}
	public String getSts() {
		return sts;
	}
	public void setSts(String sts) {
		this.sts = sts;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

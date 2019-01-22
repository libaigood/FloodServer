package com.bzh.floodserver.model.sjappfu;

import java.io.Serializable;
import java.util.Date;

/**
 * 水情信息_水库
 * */
public class WaterInfo_reservoir_all implements Serializable{

	private static final long serialVersionUID = -2412307875745516497L;
	
	private String stcd;
	private String stnm;
	private String adcd;
	private String  adnm;
	private Date tm;
	private String ttt;
	private double rz;
	private double fsltdz;
	private double cxxsw;//超汛限水位 = rz - fsltdz
	private String sts;
	private String subscripttime;//统计图时间

	public String getSubscripttime() {
		return subscripttime;
	}

	public void setSubscripttime(String subscripttime) {
		this.subscripttime = subscripttime;
	}

	public WaterInfo_reservoir_all() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WaterInfo_reservoir_all(String stcd, String stnm, String adcd, String adnm, Date tm, String ttt, double rz,
			double fsltdz, double cxxsw, String sts) {
		super();
		this.stcd = stcd;
		this.stnm = stnm;
		this.adcd = adcd;
		this.adnm = adnm;
		this.tm = tm;
		this.ttt = ttt;
		this.rz = rz;
		this.fsltdz = fsltdz;
		this.cxxsw = cxxsw;
		this.sts = sts;
	}
	@Override
	public String toString() {
		return "WaterInfo_reservoir_all [stcd=" + stcd + ", stnm=" + stnm + ", adcd=" + adcd + ", adnm=" + adnm
				+ ", tm=" + tm + ", ttt=" + ttt + ", rz=" + rz + ", fsltdz=" + fsltdz + ", cxxsw=" + cxxsw + ", sts="
				+ sts + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adcd == null) ? 0 : adcd.hashCode());
		result = prime * result + ((adnm == null) ? 0 : adnm.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cxxsw);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fsltdz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((stcd == null) ? 0 : stcd.hashCode());
		result = prime * result + ((stnm == null) ? 0 : stnm.hashCode());
		result = prime * result + ((sts == null) ? 0 : sts.hashCode());
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
		WaterInfo_reservoir_all other = (WaterInfo_reservoir_all) obj;
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
		if (Double.doubleToLongBits(cxxsw) != Double.doubleToLongBits(other.cxxsw))
			return false;
		if (Double.doubleToLongBits(fsltdz) != Double.doubleToLongBits(other.fsltdz))
			return false;
		if (Double.doubleToLongBits(rz) != Double.doubleToLongBits(other.rz))
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
	public double getRz() {
		return rz;
	}
	public void setRz(double rz) {
		this.rz = rz;
	}
	public double getFsltdz() {
		return fsltdz;
	}
	public void setFsltdz(double fsltdz) {
		this.fsltdz = fsltdz;
	}
	public double getCxxsw() {
		return cxxsw;
	}
	public void setCxxsw(double cxxsw) {
		this.cxxsw = cxxsw;
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

package com.bzh.floodserver.model.sjappfu;

import java.io.Serializable;
import java.util.Date;

/**
 * 雨情信息_雨强
 * */
public class RainIntensity_all implements Serializable{

	private static final long serialVersionUID = -7006103610329562710L;
	private String stcd;
	private String stnm;
	private Date tm;
	public double drp;
	private String adcd;
	private String adnm;
	private String ttt;
	public RainIntensity_all() {
		super();
	}
	public RainIntensity_all(String stcd, String stnm, Date tm, double drp, String adcd, String adnm, String ttt) {
		super();
		this.stcd = stcd;
		this.stnm = stnm;
		this.tm = tm;
		this.drp = drp;
		this.adcd = adcd;
		this.adnm = adnm;
		this.ttt = ttt;
	}
	@Override
	public String toString() {
		return "RainIntensity_all [stcd=" + stcd + ", stnm=" + stnm + ", tm=" + tm + ", drp=" + drp + ", adcd=" + adcd
				+ ", adnm=" + adnm + ", ttt=" + ttt + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adcd == null) ? 0 : adcd.hashCode());
		result = prime * result + ((adnm == null) ? 0 : adnm.hashCode());
		long temp;
		temp = Double.doubleToLongBits(drp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((stcd == null) ? 0 : stcd.hashCode());
		result = prime * result + ((stnm == null) ? 0 : stnm.hashCode());
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
		RainIntensity_all other = (RainIntensity_all) obj;
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
		if (Double.doubleToLongBits(drp) != Double.doubleToLongBits(other.drp))
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

package com.bzh.floodserver.model.sjappfu;

import java.io.Serializable;

/**
 * 雨情信息_降雨
 * */
public class Rainfalls_all implements Serializable{

	private static final long serialVersionUID = -7177013753589674696L;

	private String stcd;
	private String stnm;
	private double drp;
	private String adcd;
	private String adnm;
	public Rainfalls_all() {
		super();
	}
	public Rainfalls_all(String stcd, String stnm, double drp, String adcd, String adnm) {
		super();
		this.stcd = stcd;
		this.stnm = stnm;
		this.drp = drp;
		this.adcd = adcd;
		this.adnm = adnm;
	}
	@Override
	public String toString() {
		return "Rainfalls_all [stcd=" + stcd + ", stnm=" + stnm + ", drp=" + drp + ", adcd=" + adcd + ", adnm=" + adnm
				+"]";
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
		Rainfalls_all other = (Rainfalls_all) obj;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

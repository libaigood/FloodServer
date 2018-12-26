package com.bzh.floodserver.model.sjappfu;

import java.io.Serializable;
import java.util.Date;

/**
 *  雨情信息_雨强
 * */
public class RainIntensity_one extends BasicInformation implements Serializable{

	private static final long serialVersionUID = 386149945746811041L;
	
	private String stcd;
	private String stnm;
	private Date tm;
	private double drp;
	private String ttt;
	private String adcd;
	private String adnm;
	public RainIntensity_one() {
		super();
	}
	public RainIntensity_one(String stcd, String stnm, String rvnm, String hnnm, String bsnm, double lgtd, double lttd,
			String stlc, String addvcd, String dtmnm, double dtmel, double dtpr, String sttp, String frgrd,
			String esstym, String bgfrym, String atcunit, String admauth, String locality, String stbk, double stazt,
			double dstrvm, double drna, String phcd, String usfl, String comments, Date moditime) {
		super(stcd, stnm, rvnm, hnnm, bsnm, lgtd, lttd, stlc, addvcd, dtmnm, dtmel, dtpr, sttp, frgrd, esstym, bgfrym, atcunit,
				admauth, locality, stbk, stazt, dstrvm, drna, phcd, usfl, comments, moditime);
	}
	public RainIntensity_one(String stcd, String stnm, Date tm, double drp, String ttt, String adcd, String adnm) {
		super();
		this.stcd = stcd;
		this.stnm = stnm;
		this.tm = tm;
		this.drp = drp;
		this.ttt = ttt;
		this.adcd = adcd;
		this.adnm = adnm;
	}
	@Override
	public String toString() {
		return "RainIntensity_one [stcd=" + stcd + ", stnm=" + stnm + ", tm=" + tm + ", drp=" + drp + ", ttt=" + ttt
				+ ", adcd=" + adcd + ", adnm=" + adnm + ", rvnm=" + rvnm + ", hnnm=" + hnnm + ", bsnm=" + bsnm
				+ ", lgtd=" + lgtd + ", lttd=" + lttd + ", stlc=" + stlc + ", addvcd=" + addvcd + ", dtmnm=" + dtmnm
				+ ", dtmel=" + dtmel + ", dtpr=" + dtpr + ", sttp=" + sttp + ", frgrd=" + frgrd + ", esstym=" + esstym
				+ ", bgfrym=" + bgfrym + ", atcunit=" + atcunit + ", admauth=" + admauth + ", locality=" + locality
				+ ", stbk=" + stbk + ", stazt=" + stazt + ", dstrvm=" + dstrvm + ", drna=" + drna + ", phcd=" + phcd
				+ ", usfl=" + usfl + ", comments=" + comments + ", moditime=" + moditime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
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
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		RainIntensity_one other = (RainIntensity_one) obj;
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
	public String getTtt() {
		return ttt;
	}
	public void setTtt(String ttt) {
		this.ttt = ttt;
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

package com.bzh.floodserver.model.sjappfu;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础信息表ST_STBPRP_B
 * */
public class BasicInformation implements Serializable{
	public static final long serialVersionUID = 6415610350460452985L;
	
	public String stcd;
	public String stnm;
	public String rvnm;
	public String hnnm;
	public String bsnm;
	public double lgtd;
	public double lttd;
	public String stlc;
	public String addvcd;
	public String dtmnm;
	public double dtmel;
	public double dtpr;
	public String sttp;
	public String frgrd;
	public String esstym;
	public String bgfrym;
	public String atcunit;
	public String admauth;
	public String locality;
	public String stbk;
	public double stazt;
	public double dstrvm;
	public double drna;
	public String phcd;
	public String usfl;
	public String comments;
	public String moditime;
	public BasicInformation() {
		super();
	}
	public BasicInformation(String stcd, String stnm, String rvnm, String hnnm, String bsnm, double lgtd, double lttd,
			String stlc, String addvcd, String dtmnm, double dtmel, double dtpr, String sttp, String frgrd,
			String esstym, String bgfrym, String atcunit, String admauth, String locality, String stbk, double stazt,
			double dstrvm, double drna, String phcd, String usfl, String comments, String moditime) {
		super();
		this.stcd = stcd;
		this.stnm = stnm;
		this.rvnm = rvnm;
		this.hnnm = hnnm;
		this.bsnm = bsnm;
		this.lgtd = lgtd;
		this.lttd = lttd;
		this.stlc = stlc;
		this.addvcd = addvcd;
		this.dtmnm = dtmnm;
		this.dtmel = dtmel;
		this.dtpr = dtpr;
		this.sttp = sttp;
		this.frgrd = frgrd;
		this.esstym = esstym;
		this.bgfrym = bgfrym;
		this.atcunit = atcunit;
		this.admauth = admauth;
		this.locality = locality;
		this.stbk = stbk;
		this.stazt = stazt;
		this.dstrvm = dstrvm;
		this.drna = drna;
		this.phcd = phcd;
		this.usfl = usfl;
		this.comments = comments;
		this.moditime = moditime;
	}
	@Override
	public String toString() {
		return "BasicInformation [stcd=" + stcd + ", stnm=" + stnm + ", rvnm=" + rvnm + ", hnnm=" + hnnm + ", bsnm="
				+ bsnm + ", lgtd=" + lgtd + ", lttd=" + lttd + ", stlc=" + stlc + ", addvcd=" + addvcd + ", dtmnm="
				+ dtmnm + ", dtmel=" + dtmel + ", dtpr=" + dtpr + ", sttp=" + sttp + ", frgrd=" + frgrd + ", esstym="
				+ esstym + ", bgfrym=" + bgfrym + ", atcunit=" + atcunit + ", admauth=" + admauth + ", locality="
				+ locality + ", stbk=" + stbk + ", stazt=" + stazt + ", dstrvm=" + dstrvm + ", drna=" + drna + ", phcd="
				+ phcd + ", usfl=" + usfl + ", comments=" + comments + ", moditime=" + moditime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addvcd == null) ? 0 : addvcd.hashCode());
		result = prime * result + ((admauth == null) ? 0 : admauth.hashCode());
		result = prime * result + ((atcunit == null) ? 0 : atcunit.hashCode());
		result = prime * result + ((bgfrym == null) ? 0 : bgfrym.hashCode());
		result = prime * result + ((bsnm == null) ? 0 : bsnm.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		long temp;
		temp = Double.doubleToLongBits(drna);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(dstrvm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(dtmel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dtmnm == null) ? 0 : dtmnm.hashCode());
		temp = Double.doubleToLongBits(dtpr);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((esstym == null) ? 0 : esstym.hashCode());
		result = prime * result + ((frgrd == null) ? 0 : frgrd.hashCode());
		result = prime * result + ((hnnm == null) ? 0 : hnnm.hashCode());
		temp = Double.doubleToLongBits(lgtd);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((locality == null) ? 0 : locality.hashCode());
		temp = Double.doubleToLongBits(lttd);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((moditime == null) ? 0 : moditime.hashCode());
		result = prime * result + ((phcd == null) ? 0 : phcd.hashCode());
		result = prime * result + ((rvnm == null) ? 0 : rvnm.hashCode());
		temp = Double.doubleToLongBits(stazt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((stbk == null) ? 0 : stbk.hashCode());
		result = prime * result + ((stcd == null) ? 0 : stcd.hashCode());
		result = prime * result + ((stlc == null) ? 0 : stlc.hashCode());
		result = prime * result + ((stnm == null) ? 0 : stnm.hashCode());
		result = prime * result + ((sttp == null) ? 0 : sttp.hashCode());
		result = prime * result + ((usfl == null) ? 0 : usfl.hashCode());
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
		BasicInformation other = (BasicInformation) obj;
		if (addvcd == null) {
			if (other.addvcd != null)
				return false;
		} else if (!addvcd.equals(other.addvcd))
			return false;
		if (admauth == null) {
			if (other.admauth != null)
				return false;
		} else if (!admauth.equals(other.admauth))
			return false;
		if (atcunit == null) {
			if (other.atcunit != null)
				return false;
		} else if (!atcunit.equals(other.atcunit))
			return false;
		if (bgfrym == null) {
			if (other.bgfrym != null)
				return false;
		} else if (!bgfrym.equals(other.bgfrym))
			return false;
		if (bsnm == null) {
			if (other.bsnm != null)
				return false;
		} else if (!bsnm.equals(other.bsnm))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (Double.doubleToLongBits(drna) != Double.doubleToLongBits(other.drna))
			return false;
		if (Double.doubleToLongBits(dstrvm) != Double.doubleToLongBits(other.dstrvm))
			return false;
		if (Double.doubleToLongBits(dtmel) != Double.doubleToLongBits(other.dtmel))
			return false;
		if (dtmnm == null) {
			if (other.dtmnm != null)
				return false;
		} else if (!dtmnm.equals(other.dtmnm))
			return false;
		if (Double.doubleToLongBits(dtpr) != Double.doubleToLongBits(other.dtpr))
			return false;
		if (esstym == null) {
			if (other.esstym != null)
				return false;
		} else if (!esstym.equals(other.esstym))
			return false;
		if (frgrd == null) {
			if (other.frgrd != null)
				return false;
		} else if (!frgrd.equals(other.frgrd))
			return false;
		if (hnnm == null) {
			if (other.hnnm != null)
				return false;
		} else if (!hnnm.equals(other.hnnm))
			return false;
		if (Double.doubleToLongBits(lgtd) != Double.doubleToLongBits(other.lgtd))
			return false;
		if (locality == null) {
			if (other.locality != null)
				return false;
		} else if (!locality.equals(other.locality))
			return false;
		if (Double.doubleToLongBits(lttd) != Double.doubleToLongBits(other.lttd))
			return false;
		if (moditime == null) {
			if (other.moditime != null)
				return false;
		} else if (!moditime.equals(other.moditime))
			return false;
		if (phcd == null) {
			if (other.phcd != null)
				return false;
		} else if (!phcd.equals(other.phcd))
			return false;
		if (rvnm == null) {
			if (other.rvnm != null)
				return false;
		} else if (!rvnm.equals(other.rvnm))
			return false;
		if (Double.doubleToLongBits(stazt) != Double.doubleToLongBits(other.stazt))
			return false;
		if (stbk == null) {
			if (other.stbk != null)
				return false;
		} else if (!stbk.equals(other.stbk))
			return false;
		if (stcd == null) {
			if (other.stcd != null)
				return false;
		} else if (!stcd.equals(other.stcd))
			return false;
		if (stlc == null) {
			if (other.stlc != null)
				return false;
		} else if (!stlc.equals(other.stlc))
			return false;
		if (stnm == null) {
			if (other.stnm != null)
				return false;
		} else if (!stnm.equals(other.stnm))
			return false;
		if (sttp == null) {
			if (other.sttp != null)
				return false;
		} else if (!sttp.equals(other.sttp))
			return false;
		if (usfl == null) {
			if (other.usfl != null)
				return false;
		} else if (!usfl.equals(other.usfl))
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
	public String getHnnm() {
		return hnnm;
	}
	public void setHnnm(String hnnm) {
		this.hnnm = hnnm;
	}
	public String getBsnm() {
		return bsnm;
	}
	public void setBsnm(String bsnm) {
		this.bsnm = bsnm;
	}
	public double getLgtd() {
		return lgtd;
	}
	public void setLgtd(double lgtd) {
		this.lgtd = lgtd;
	}
	public double getLttd() {
		return lttd;
	}
	public void setLttd(double lttd) {
		this.lttd = lttd;
	}
	public String getStlc() {
		return stlc;
	}
	public void setStlc(String stlc) {
		this.stlc = stlc;
	}
	public String getAddvcd() {
		return addvcd;
	}
	public void setAddvcd(String addvcd) {
		this.addvcd = addvcd;
	}
	public String getDtmnm() {
		return dtmnm;
	}
	public void setDtmnm(String dtmnm) {
		this.dtmnm = dtmnm;
	}
	public double getDtmel() {
		return dtmel;
	}
	public void setDtmel(double dtmel) {
		this.dtmel = dtmel;
	}
	public double getDtpr() {
		return dtpr;
	}
	public void setDtpr(double dtpr) {
		this.dtpr = dtpr;
	}
	public String getSttp() {
		return sttp;
	}
	public void setSttp(String sttp) {
		this.sttp = sttp;
	}
	public String getFrgrd() {
		return frgrd;
	}
	public void setFrgrd(String frgrd) {
		this.frgrd = frgrd;
	}
	public String getEsstym() {
		return esstym;
	}
	public void setEsstym(String esstym) {
		this.esstym = esstym;
	}
	public String getBgfrym() {
		return bgfrym;
	}
	public void setBgfrym(String bgfrym) {
		this.bgfrym = bgfrym;
	}
	public String getAtcunit() {
		return atcunit;
	}
	public void setAtcunit(String atcunit) {
		this.atcunit = atcunit;
	}
	public String getAdmauth() {
		return admauth;
	}
	public void setAdmauth(String admauth) {
		this.admauth = admauth;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getStbk() {
		return stbk;
	}
	public void setStbk(String stbk) {
		this.stbk = stbk;
	}
	public double getStazt() {
		return stazt;
	}
	public void setStazt(double stazt) {
		this.stazt = stazt;
	}
	public double getDstrvm() {
		return dstrvm;
	}
	public void setDstrvm(double dstrvm) {
		this.dstrvm = dstrvm;
	}
	public double getDrna() {
		return drna;
	}
	public void setDrna(double drna) {
		this.drna = drna;
	}
	public String getPhcd() {
		return phcd;
	}
	public void setPhcd(String phcd) {
		this.phcd = phcd;
	}
	public String getUsfl() {
		return usfl;
	}
	public void setUsfl(String usfl) {
		this.usfl = usfl;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getModitime() {
		return moditime;
	}
	public void setModitime(String moditime) {
		this.moditime = moditime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

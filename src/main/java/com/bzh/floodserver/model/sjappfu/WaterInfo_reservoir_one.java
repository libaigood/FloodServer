package com.bzh.floodserver.model.sjappfu;

import java.io.Serializable;
import java.util.Date;

/**
 * 水情信息_水库
 * */
public class WaterInfo_reservoir_one extends BasicInformation implements Serializable{

	private static final long serialVersionUID = 6197925701218193008L;
	//ST_RSVR_R
	 private String stcd;
	 private Date tm;
	 private String ttt;
	 private double rz;
	 private double inq;
	 private double w;
	 private double blrz;
	 private double otq;
	 private String rwchrcd;
	 private String rwptn;
	 private double inqdr;
	 private String msqmt;
	 //DJ_AD
	 private String adcd;
	 private String adnm;
	 //ST_RSVRFSR_B
	 private Date bgmd;
	 private Date edmd;
	 private double fsltdz;
	 private double fsltdw;
	 private String fstp;
	 //统计
	 private String minrz;
	 private String maxrz;
	 private String nowrz;
	 
	 
	 
	 private String rsvrtp;
	 private double damel;
	 private double ckflz;
	 private double dsflz;
	 private double normz;
	 private double ddz;
	 private double actz;
	 private double ttcp;
	 private double fldcp;
	 private double  actcp;
	 private double ddcp;
	 private double hhrz;
	 private double hmxw;
	 private Date hhrztm;
	 private double hmxinq;
	 private double rstdr;
	 private Date  hmxinqtm;
	 private double hmxotq;
	 private Date  hmxotqtm;
	 private double  hlrz;
	 private Date hlrztm;
	 private double hmninq;
	 private Date hmninqtm;
	 private double laz;
	 private double sfq;
	public WaterInfo_reservoir_one() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WaterInfo_reservoir_one(String stcd, String stnm, String rvnm, String hnnm, String bsnm, double lgtd,
			double lttd, String stlc, String addvcd, String dtmnm, double dtmel, double dtpr, String sttp, String frgrd,
			String esstym, String bgfrym, String atcunit, String admauth, String locality, String stbk, double stazt,
			double dstrvm, double drna, String phcd, String usfl, String comments, Date moditime) {
		super(stcd, stnm, rvnm, hnnm, bsnm, lgtd, lttd, stlc, addvcd, dtmnm, dtmel, dtpr, sttp, frgrd, esstym, bgfrym, atcunit,
				admauth, locality, stbk, stazt, dstrvm, drna, phcd, usfl, comments, moditime);
		// TODO Auto-generated constructor stub
	}
	public WaterInfo_reservoir_one(String stcd, Date tm, String ttt, double rz, double inq, double w, double blrz,
			double otq, String rwchrcd, String rwptn, double inqdr, String msqmt, String adcd, String adnm, Date bgmd,
			Date edmd, double fsltdz, double fsltdw, String fstp, String minrz, String maxrz, String nowrz,
			String rsvrtp, double damel, double ckflz, double dsflz, double normz, double ddz, double actz, double ttcp,
			double fldcp, double actcp, double ddcp, double hhrz, double hmxw, Date hhrztm, double hmxinq, double rstdr,
			Date hmxinqtm, double hmxotq, Date hmxotqtm, double hlrz, Date hlrztm, double hmninq, Date hmninqtm,
			double laz, double sfq) {
		super();
		this.stcd = stcd;
		this.tm = tm;
		this.ttt = ttt;
		this.rz = rz;
		this.inq = inq;
		this.w = w;
		this.blrz = blrz;
		this.otq = otq;
		this.rwchrcd = rwchrcd;
		this.rwptn = rwptn;
		this.inqdr = inqdr;
		this.msqmt = msqmt;
		this.adcd = adcd;
		this.adnm = adnm;
		this.bgmd = bgmd;
		this.edmd = edmd;
		this.fsltdz = fsltdz;
		this.fsltdw = fsltdw;
		this.fstp = fstp;
		this.minrz = minrz;
		this.maxrz = maxrz;
		this.nowrz = nowrz;
		this.rsvrtp = rsvrtp;
		this.damel = damel;
		this.ckflz = ckflz;
		this.dsflz = dsflz;
		this.normz = normz;
		this.ddz = ddz;
		this.actz = actz;
		this.ttcp = ttcp;
		this.fldcp = fldcp;
		this.actcp = actcp;
		this.ddcp = ddcp;
		this.hhrz = hhrz;
		this.hmxw = hmxw;
		this.hhrztm = hhrztm;
		this.hmxinq = hmxinq;
		this.rstdr = rstdr;
		this.hmxinqtm = hmxinqtm;
		this.hmxotq = hmxotq;
		this.hmxotqtm = hmxotqtm;
		this.hlrz = hlrz;
		this.hlrztm = hlrztm;
		this.hmninq = hmninq;
		this.hmninqtm = hmninqtm;
		this.laz = laz;
		this.sfq = sfq;
	}
	@Override
	public String toString() {
		return "WaterInfo_reservoir_one [stcd=" + stcd + ", tm=" + tm + ", ttt=" + ttt + ", rz=" + rz + ", inq=" + inq
				+ ", w=" + w + ", blrz=" + blrz + ", otq=" + otq + ", rwchrcd=" + rwchrcd + ", rwptn=" + rwptn
				+ ", inqdr=" + inqdr + ", msqmt=" + msqmt + ", adcd=" + adcd + ", adnm=" + adnm + ", bgmd=" + bgmd
				+ ", edmd=" + edmd + ", fsltdz=" + fsltdz + ", fsltdw=" + fsltdw + ", fstp=" + fstp + ", minrz=" + minrz
				+ ", maxrz=" + maxrz + ", nowrz=" + nowrz + ", rsvrtp=" + rsvrtp + ", damel=" + damel + ", ckflz="
				+ ckflz + ", dsflz=" + dsflz + ", normz=" + normz + ", ddz=" + ddz + ", actz=" + actz + ", ttcp=" + ttcp
				+ ", fldcp=" + fldcp + ", actcp=" + actcp + ", ddcp=" + ddcp + ", hhrz=" + hhrz + ", hmxw=" + hmxw
				+ ", hhrztm=" + hhrztm + ", hmxinq=" + hmxinq + ", rstdr=" + rstdr + ", hmxinqtm=" + hmxinqtm
				+ ", hmxotq=" + hmxotq + ", hmxotqtm=" + hmxotqtm + ", hlrz=" + hlrz + ", hlrztm=" + hlrztm
				+ ", hmninq=" + hmninq + ", hmninqtm=" + hmninqtm + ", laz=" + laz + ", sfq=" + sfq + ", stnm=" + stnm
				+ ", rvnm=" + rvnm + ", hnnm=" + hnnm + ", bsnm=" + bsnm + ", lgtd=" + lgtd + ", lttd=" + lttd
				+ ", stlc=" + stlc + ", addvcd=" + addvcd + ", dtmnm=" + dtmnm + ", dtmel=" + dtmel + ", dtpr=" + dtpr
				+ ", sttp=" + sttp + ", frgrd=" + frgrd + ", esstym=" + esstym + ", bgfrym=" + bgfrym + ", atcunit="
				+ atcunit + ", admauth=" + admauth + ", locality=" + locality + ", stbk=" + stbk + ", stazt=" + stazt
				+ ", dstrvm=" + dstrvm + ", drna=" + drna + ", phcd=" + phcd + ", usfl=" + usfl + ", comments="
				+ comments + ", moditime=" + moditime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(actcp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(actz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((adcd == null) ? 0 : adcd.hashCode());
		result = prime * result + ((adnm == null) ? 0 : adnm.hashCode());
		result = prime * result + ((bgmd == null) ? 0 : bgmd.hashCode());
		temp = Double.doubleToLongBits(blrz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ckflz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(damel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ddcp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ddz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(dsflz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((edmd == null) ? 0 : edmd.hashCode());
		temp = Double.doubleToLongBits(fldcp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fsltdw);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fsltdz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((fstp == null) ? 0 : fstp.hashCode());
		temp = Double.doubleToLongBits(hhrz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hhrztm == null) ? 0 : hhrztm.hashCode());
		temp = Double.doubleToLongBits(hlrz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hlrztm == null) ? 0 : hlrztm.hashCode());
		temp = Double.doubleToLongBits(hmninq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hmninqtm == null) ? 0 : hmninqtm.hashCode());
		temp = Double.doubleToLongBits(hmxinq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hmxinqtm == null) ? 0 : hmxinqtm.hashCode());
		temp = Double.doubleToLongBits(hmxotq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hmxotqtm == null) ? 0 : hmxotqtm.hashCode());
		temp = Double.doubleToLongBits(hmxw);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(inq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(inqdr);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(laz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((maxrz == null) ? 0 : maxrz.hashCode());
		result = prime * result + ((minrz == null) ? 0 : minrz.hashCode());
		result = prime * result + ((msqmt == null) ? 0 : msqmt.hashCode());
		temp = Double.doubleToLongBits(normz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nowrz == null) ? 0 : nowrz.hashCode());
		temp = Double.doubleToLongBits(otq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rstdr);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((rsvrtp == null) ? 0 : rsvrtp.hashCode());
		result = prime * result + ((rwchrcd == null) ? 0 : rwchrcd.hashCode());
		result = prime * result + ((rwptn == null) ? 0 : rwptn.hashCode());
		temp = Double.doubleToLongBits(rz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sfq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((stcd == null) ? 0 : stcd.hashCode());
		result = prime * result + ((tm == null) ? 0 : tm.hashCode());
		temp = Double.doubleToLongBits(ttcp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ttt == null) ? 0 : ttt.hashCode());
		temp = Double.doubleToLongBits(w);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		WaterInfo_reservoir_one other = (WaterInfo_reservoir_one) obj;
		if (Double.doubleToLongBits(actcp) != Double.doubleToLongBits(other.actcp))
			return false;
		if (Double.doubleToLongBits(actz) != Double.doubleToLongBits(other.actz))
			return false;
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
		if (bgmd == null) {
			if (other.bgmd != null)
				return false;
		} else if (!bgmd.equals(other.bgmd))
			return false;
		if (Double.doubleToLongBits(blrz) != Double.doubleToLongBits(other.blrz))
			return false;
		if (Double.doubleToLongBits(ckflz) != Double.doubleToLongBits(other.ckflz))
			return false;
		if (Double.doubleToLongBits(damel) != Double.doubleToLongBits(other.damel))
			return false;
		if (Double.doubleToLongBits(ddcp) != Double.doubleToLongBits(other.ddcp))
			return false;
		if (Double.doubleToLongBits(ddz) != Double.doubleToLongBits(other.ddz))
			return false;
		if (Double.doubleToLongBits(dsflz) != Double.doubleToLongBits(other.dsflz))
			return false;
		if (edmd == null) {
			if (other.edmd != null)
				return false;
		} else if (!edmd.equals(other.edmd))
			return false;
		if (Double.doubleToLongBits(fldcp) != Double.doubleToLongBits(other.fldcp))
			return false;
		if (Double.doubleToLongBits(fsltdw) != Double.doubleToLongBits(other.fsltdw))
			return false;
		if (Double.doubleToLongBits(fsltdz) != Double.doubleToLongBits(other.fsltdz))
			return false;
		if (fstp == null) {
			if (other.fstp != null)
				return false;
		} else if (!fstp.equals(other.fstp))
			return false;
		if (Double.doubleToLongBits(hhrz) != Double.doubleToLongBits(other.hhrz))
			return false;
		if (hhrztm == null) {
			if (other.hhrztm != null)
				return false;
		} else if (!hhrztm.equals(other.hhrztm))
			return false;
		if (Double.doubleToLongBits(hlrz) != Double.doubleToLongBits(other.hlrz))
			return false;
		if (hlrztm == null) {
			if (other.hlrztm != null)
				return false;
		} else if (!hlrztm.equals(other.hlrztm))
			return false;
		if (Double.doubleToLongBits(hmninq) != Double.doubleToLongBits(other.hmninq))
			return false;
		if (hmninqtm == null) {
			if (other.hmninqtm != null)
				return false;
		} else if (!hmninqtm.equals(other.hmninqtm))
			return false;
		if (Double.doubleToLongBits(hmxinq) != Double.doubleToLongBits(other.hmxinq))
			return false;
		if (hmxinqtm == null) {
			if (other.hmxinqtm != null)
				return false;
		} else if (!hmxinqtm.equals(other.hmxinqtm))
			return false;
		if (Double.doubleToLongBits(hmxotq) != Double.doubleToLongBits(other.hmxotq))
			return false;
		if (hmxotqtm == null) {
			if (other.hmxotqtm != null)
				return false;
		} else if (!hmxotqtm.equals(other.hmxotqtm))
			return false;
		if (Double.doubleToLongBits(hmxw) != Double.doubleToLongBits(other.hmxw))
			return false;
		if (Double.doubleToLongBits(inq) != Double.doubleToLongBits(other.inq))
			return false;
		if (Double.doubleToLongBits(inqdr) != Double.doubleToLongBits(other.inqdr))
			return false;
		if (Double.doubleToLongBits(laz) != Double.doubleToLongBits(other.laz))
			return false;
		if (maxrz == null) {
			if (other.maxrz != null)
				return false;
		} else if (!maxrz.equals(other.maxrz))
			return false;
		if (minrz == null) {
			if (other.minrz != null)
				return false;
		} else if (!minrz.equals(other.minrz))
			return false;
		if (msqmt == null) {
			if (other.msqmt != null)
				return false;
		} else if (!msqmt.equals(other.msqmt))
			return false;
		if (Double.doubleToLongBits(normz) != Double.doubleToLongBits(other.normz))
			return false;
		if (nowrz == null) {
			if (other.nowrz != null)
				return false;
		} else if (!nowrz.equals(other.nowrz))
			return false;
		if (Double.doubleToLongBits(otq) != Double.doubleToLongBits(other.otq))
			return false;
		if (Double.doubleToLongBits(rstdr) != Double.doubleToLongBits(other.rstdr))
			return false;
		if (rsvrtp == null) {
			if (other.rsvrtp != null)
				return false;
		} else if (!rsvrtp.equals(other.rsvrtp))
			return false;
		if (rwchrcd == null) {
			if (other.rwchrcd != null)
				return false;
		} else if (!rwchrcd.equals(other.rwchrcd))
			return false;
		if (rwptn == null) {
			if (other.rwptn != null)
				return false;
		} else if (!rwptn.equals(other.rwptn))
			return false;
		if (Double.doubleToLongBits(rz) != Double.doubleToLongBits(other.rz))
			return false;
		if (Double.doubleToLongBits(sfq) != Double.doubleToLongBits(other.sfq))
			return false;
		if (stcd == null) {
			if (other.stcd != null)
				return false;
		} else if (!stcd.equals(other.stcd))
			return false;
		if (tm == null) {
			if (other.tm != null)
				return false;
		} else if (!tm.equals(other.tm))
			return false;
		if (Double.doubleToLongBits(ttcp) != Double.doubleToLongBits(other.ttcp))
			return false;
		if (ttt == null) {
			if (other.ttt != null)
				return false;
		} else if (!ttt.equals(other.ttt))
			return false;
		if (Double.doubleToLongBits(w) != Double.doubleToLongBits(other.w))
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
	public double getInq() {
		return inq;
	}
	public void setInq(double inq) {
		this.inq = inq;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	public double getBlrz() {
		return blrz;
	}
	public void setBlrz(double blrz) {
		this.blrz = blrz;
	}
	public double getOtq() {
		return otq;
	}
	public void setOtq(double otq) {
		this.otq = otq;
	}
	public String getRwchrcd() {
		return rwchrcd;
	}
	public void setRwchrcd(String rwchrcd) {
		this.rwchrcd = rwchrcd;
	}
	public String getRwptn() {
		return rwptn;
	}
	public void setRwptn(String rwptn) {
		this.rwptn = rwptn;
	}
	public double getInqdr() {
		return inqdr;
	}
	public void setInqdr(double inqdr) {
		this.inqdr = inqdr;
	}
	public String getMsqmt() {
		return msqmt;
	}
	public void setMsqmt(String msqmt) {
		this.msqmt = msqmt;
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
	public Date getBgmd() {
		return bgmd;
	}
	public void setBgmd(Date bgmd) {
		this.bgmd = bgmd;
	}
	public Date getEdmd() {
		return edmd;
	}
	public void setEdmd(Date edmd) {
		this.edmd = edmd;
	}
	public double getFsltdz() {
		return fsltdz;
	}
	public void setFsltdz(double fsltdz) {
		this.fsltdz = fsltdz;
	}
	public double getFsltdw() {
		return fsltdw;
	}
	public void setFsltdw(double fsltdw) {
		this.fsltdw = fsltdw;
	}
	public String getFstp() {
		return fstp;
	}
	public void setFstp(String fstp) {
		this.fstp = fstp;
	}
	public String getMinrz() {
		return minrz;
	}
	public void setMinrz(String minrz) {
		this.minrz = minrz;
	}
	public String getMaxrz() {
		return maxrz;
	}
	public void setMaxrz(String maxrz) {
		this.maxrz = maxrz;
	}
	public String getNowrz() {
		return nowrz;
	}
	public void setNowrz(String nowrz) {
		this.nowrz = nowrz;
	}
	public String getRsvrtp() {
		return rsvrtp;
	}
	public void setRsvrtp(String rsvrtp) {
		this.rsvrtp = rsvrtp;
	}
	public double getDamel() {
		return damel;
	}
	public void setDamel(double damel) {
		this.damel = damel;
	}
	public double getCkflz() {
		return ckflz;
	}
	public void setCkflz(double ckflz) {
		this.ckflz = ckflz;
	}
	public double getDsflz() {
		return dsflz;
	}
	public void setDsflz(double dsflz) {
		this.dsflz = dsflz;
	}
	public double getNormz() {
		return normz;
	}
	public void setNormz(double normz) {
		this.normz = normz;
	}
	public double getDdz() {
		return ddz;
	}
	public void setDdz(double ddz) {
		this.ddz = ddz;
	}
	public double getActz() {
		return actz;
	}
	public void setActz(double actz) {
		this.actz = actz;
	}
	public double getTtcp() {
		return ttcp;
	}
	public void setTtcp(double ttcp) {
		this.ttcp = ttcp;
	}
	public double getFldcp() {
		return fldcp;
	}
	public void setFldcp(double fldcp) {
		this.fldcp = fldcp;
	}
	public double getActcp() {
		return actcp;
	}
	public void setActcp(double actcp) {
		this.actcp = actcp;
	}
	public double getDdcp() {
		return ddcp;
	}
	public void setDdcp(double ddcp) {
		this.ddcp = ddcp;
	}
	public double getHhrz() {
		return hhrz;
	}
	public void setHhrz(double hhrz) {
		this.hhrz = hhrz;
	}
	public double getHmxw() {
		return hmxw;
	}
	public void setHmxw(double hmxw) {
		this.hmxw = hmxw;
	}
	public Date getHhrztm() {
		return hhrztm;
	}
	public void setHhrztm(Date hhrztm) {
		this.hhrztm = hhrztm;
	}
	public double getHmxinq() {
		return hmxinq;
	}
	public void setHmxinq(double hmxinq) {
		this.hmxinq = hmxinq;
	}
	public double getRstdr() {
		return rstdr;
	}
	public void setRstdr(double rstdr) {
		this.rstdr = rstdr;
	}
	public Date getHmxinqtm() {
		return hmxinqtm;
	}
	public void setHmxinqtm(Date hmxinqtm) {
		this.hmxinqtm = hmxinqtm;
	}
	public double getHmxotq() {
		return hmxotq;
	}
	public void setHmxotq(double hmxotq) {
		this.hmxotq = hmxotq;
	}
	public Date getHmxotqtm() {
		return hmxotqtm;
	}
	public void setHmxotqtm(Date hmxotqtm) {
		this.hmxotqtm = hmxotqtm;
	}
	public double getHlrz() {
		return hlrz;
	}
	public void setHlrz(double hlrz) {
		this.hlrz = hlrz;
	}
	public Date getHlrztm() {
		return hlrztm;
	}
	public void setHlrztm(Date hlrztm) {
		this.hlrztm = hlrztm;
	}
	public double getHmninq() {
		return hmninq;
	}
	public void setHmninq(double hmninq) {
		this.hmninq = hmninq;
	}
	public Date getHmninqtm() {
		return hmninqtm;
	}
	public void setHmninqtm(Date hmninqtm) {
		this.hmninqtm = hmninqtm;
	}
	public double getLaz() {
		return laz;
	}
	public void setLaz(double laz) {
		this.laz = laz;
	}
	public double getSfq() {
		return sfq;
	}
	public void setSfq(double sfq) {
		this.sfq = sfq;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	 
	 
}

package com.bzh.floodserver.model.sjappfu;

import java.io.Serializable;
import java.util.Date;

/**
 * 水情信息_水库
 */
public class WaterInfo_reservoir_one extends BasicInformation implements Serializable {

	private static final long serialVersionUID = 6197925701218193008L;
	private String subscripttime;//统计图时间
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
	private String bgmd;
	private String edmd;
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
	private double actcp;
	private double ddcp;
	private double hhrz;
	private double hmxw;
	private String hhrztm;
	private double hmxinq;
	private double rstdr;
	private String hmxinqtm;
	private double hmxotq;
	private String hmxotqtm;
	private double hlrz;
	private String hlrztm;
	private double hmninq;
	private String hmninqtm;
	private double laz;
	private double sfq;

	public WaterInfo_reservoir_one(){

	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	@Override
	public String getStcd() {
		return stcd;
	}

	@Override
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

	public String getBgmd() {
		return bgmd;
	}

	public void setBgmd(String bgmd) {
		this.bgmd = bgmd;
	}

	public String getEdmd() {
		return edmd;
	}

	public void setEdmd(String edmd) {
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

	public String getHhrztm() {
		return hhrztm;
	}

	public void setHhrztm(String hhrztm) {
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

	public String getHmxinqtm() {
		return hmxinqtm;
	}

	public void setHmxinqtm(String hmxinqtm) {
		this.hmxinqtm = hmxinqtm;
	}

	public double getHmxotq() {
		return hmxotq;
	}

	public void setHmxotq(double hmxotq) {
		this.hmxotq = hmxotq;
	}

	public String getHmxotqtm() {
		return hmxotqtm;
	}

	public void setHmxotqtm(String hmxotqtm) {
		this.hmxotqtm = hmxotqtm;
	}

	public double getHlrz() {
		return hlrz;
	}

	public void setHlrz(double hlrz) {
		this.hlrz = hlrz;
	}

	public String getHlrztm() {
		return hlrztm;
	}

	public void setHlrztm(String hlrztm) {
		this.hlrztm = hlrztm;
	}

	public double getHmninq() {
		return hmninq;
	}

	public void setHmninq(double hmninq) {
		this.hmninq = hmninq;
	}

	public String getHmninqtm() {
		return hmninqtm;
	}

	public void setHmninqtm(String hmninqtm) {
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

	public String getSubscripttime() {
		return subscripttime;
	}

	public void setSubscripttime(String subscripttime) {
		this.subscripttime = subscripttime;
	}
}

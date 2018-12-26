package com.bzh.floodserver.model.sjappfu;

import java.io.Serializable;
import java.util.Date;

/**
 * 水情信息_河道
 * */
public class WaterInfo_river_one extends BasicInformation implements Serializable{

	private static final long serialVersionUID = 1463531623752490770L;
	//ST_RIVER_R
	private String stcd;
	private Date tm;
	private double z;
	private double q;
	private double xsa;
	private double xsavv;
	private double xsmxv;
	private String flwchrcd;
	private String wptn;
	private String msqmt;
	private String msamt;
	private String msvmt;
	//DJ_AD
	private String adcd;
	private String adnm;
	//ST_RVFCCH_B
	private double ldkel;
	private double rdkel;
	private double wrz;
	private double wrq;
	private double grz;
	private double grq;
	private double flpq;
	private double obhtz;
	private Date obhtztm;
	private double ivhz;
	private Date ivhztm;
	private double obmxq;
	private Date obmxqtm;
	private double ivmxq;
	private Date ivmxqtm;
	private double hmxs;
	private Date hmxstm;
	private double hmxavv;
	private Date hmxavvtm;
	private double hlz;
	private Date hlztm;
	private double hmnq;
	private Date hmnqtm;
	private double taz;
	private double taq;
	private double laz;
	private double laq;
	private double sfz;
	private double sfq;
	//计算后添加
	private String ttt;
	private String minz;
	private String maxz;
	private String nowz;
	public WaterInfo_river_one() {
		super();
	}
	public WaterInfo_river_one(String stcd, String stnm, String rvnm, String hnnm, String bsnm, double lgtd,
			double lttd, String stlc, String addvcd, String dtmnm, double dtmel, double dtpr, String sttp, String frgrd,
			String esstym, String bgfrym, String atcunit, String admauth, String locality, String stbk, double stazt,
			double dstrvm, double drna, String phcd, String usfl, String comments, Date moditime) {
		super(stcd, stnm, rvnm, hnnm, bsnm, lgtd, lttd, stlc, addvcd, dtmnm, dtmel, dtpr, sttp, frgrd, esstym, bgfrym, atcunit,
				admauth, locality, stbk, stazt, dstrvm, drna, phcd, usfl, comments, moditime);
	}
	public WaterInfo_river_one(String stcd, Date tm, double z, double q, double xsa, double xsavv, double xsmxv,
			String flwchrcd, String wptn, String msqmt, String msamt, String msvmt, String adcd, String adnm,
			double ldkel, double rdkel, double wrz, double wrq, double grz, double grq, double flpq, double obhtz,
			Date obhtztm, double ivhz, Date ivhztm, double obmxq, Date obmxqtm, double ivmxq, Date ivmxqtm, double hmxs,
			Date hmxstm, double hmxavv, Date hmxavvtm, double hlz, Date hlztm, double hmnq, Date hmnqtm, double taz,
			double taq, double laz, double laq, double sfz, double sfq, String ttt, String minz, String maxz,
			String nowz) {
		super();
		this.stcd = stcd;
		this.tm = tm;
		this.z = z;
		this.q = q;
		this.xsa = xsa;
		this.xsavv = xsavv;
		this.xsmxv = xsmxv;
		this.flwchrcd = flwchrcd;
		this.wptn = wptn;
		this.msqmt = msqmt;
		this.msamt = msamt;
		this.msvmt = msvmt;
		this.adcd = adcd;
		this.adnm = adnm;
		this.ldkel = ldkel;
		this.rdkel = rdkel;
		this.wrz = wrz;
		this.wrq = wrq;
		this.grz = grz;
		this.grq = grq;
		this.flpq = flpq;
		this.obhtz = obhtz;
		this.obhtztm = obhtztm;
		this.ivhz = ivhz;
		this.ivhztm = ivhztm;
		this.obmxq = obmxq;
		this.obmxqtm = obmxqtm;
		this.ivmxq = ivmxq;
		this.ivmxqtm = ivmxqtm;
		this.hmxs = hmxs;
		this.hmxstm = hmxstm;
		this.hmxavv = hmxavv;
		this.hmxavvtm = hmxavvtm;
		this.hlz = hlz;
		this.hlztm = hlztm;
		this.hmnq = hmnq;
		this.hmnqtm = hmnqtm;
		this.taz = taz;
		this.taq = taq;
		this.laz = laz;
		this.laq = laq;
		this.sfz = sfz;
		this.sfq = sfq;
		this.ttt = ttt;
		this.minz = minz;
		this.maxz = maxz;
		this.nowz = nowz;
	}
	@Override
	public String toString() {
		return "WaterInfo_river_one [stcd=" + stcd + ", tm=" + tm + ", z=" + z + ", q=" + q + ", xsa=" + xsa
				+ ", xsavv=" + xsavv + ", xsmxv=" + xsmxv + ", flwchrcd=" + flwchrcd + ", wptn=" + wptn + ", msqmt="
				+ msqmt + ", msamt=" + msamt + ", msvmt=" + msvmt + ", adcd=" + adcd + ", adnm=" + adnm + ", ldkel="
				+ ldkel + ", rdkel=" + rdkel + ", wrz=" + wrz + ", wrq=" + wrq + ", grz=" + grz + ", grq=" + grq
				+ ", flpq=" + flpq + ", obhtz=" + obhtz + ", obhtztm=" + obhtztm + ", ivhz=" + ivhz + ", ivhztm="
				+ ivhztm + ", obmxq=" + obmxq + ", obmxqtm=" + obmxqtm + ", ivmxq=" + ivmxq + ", ivmxqtm=" + ivmxqtm
				+ ", hmxs=" + hmxs + ", hmxstm=" + hmxstm + ", hmxavv=" + hmxavv + ", hmxavvtm=" + hmxavvtm + ", hlz="
				+ hlz + ", hlztm=" + hlztm + ", hmnq=" + hmnq + ", hmnqtm=" + hmnqtm + ", taz=" + taz + ", taq=" + taq
				+ ", laz=" + laz + ", laq=" + laq + ", sfz=" + sfz + ", sfq=" + sfq + ", ttt=" + ttt + ", minz=" + minz
				+ ", maxz=" + maxz + ", nowz=" + nowz + ", stnm=" + stnm + ", rvnm=" + rvnm + ", hnnm=" + hnnm
				+ ", bsnm=" + bsnm + ", lgtd=" + lgtd + ", lttd=" + lttd + ", stlc=" + stlc + ", addvcd=" + addvcd
				+ ", dtmnm=" + dtmnm + ", dtmel=" + dtmel + ", dtpr=" + dtpr + ", sttp=" + sttp + ", frgrd=" + frgrd
				+ ", esstym=" + esstym + ", bgfrym=" + bgfrym + ", atcunit=" + atcunit + ", admauth=" + admauth
				+ ", locality=" + locality + ", stbk=" + stbk + ", stazt=" + stazt + ", dstrvm=" + dstrvm + ", drna="
				+ drna + ", phcd=" + phcd + ", usfl=" + usfl + ", comments=" + comments + ", moditime=" + moditime
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((adcd == null) ? 0 : adcd.hashCode());
		result = prime * result + ((adnm == null) ? 0 : adnm.hashCode());
		long temp;
		temp = Double.doubleToLongBits(flpq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((flwchrcd == null) ? 0 : flwchrcd.hashCode());
		temp = Double.doubleToLongBits(grq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(grz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(hlz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hlztm == null) ? 0 : hlztm.hashCode());
		temp = Double.doubleToLongBits(hmnq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hmnqtm == null) ? 0 : hmnqtm.hashCode());
		temp = Double.doubleToLongBits(hmxavv);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hmxavvtm == null) ? 0 : hmxavvtm.hashCode());
		temp = Double.doubleToLongBits(hmxs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hmxstm == null) ? 0 : hmxstm.hashCode());
		temp = Double.doubleToLongBits(ivhz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ivhztm == null) ? 0 : ivhztm.hashCode());
		temp = Double.doubleToLongBits(ivmxq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ivmxqtm == null) ? 0 : ivmxqtm.hashCode());
		temp = Double.doubleToLongBits(laq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(laz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ldkel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((maxz == null) ? 0 : maxz.hashCode());
		result = prime * result + ((minz == null) ? 0 : minz.hashCode());
		result = prime * result + ((msamt == null) ? 0 : msamt.hashCode());
		result = prime * result + ((msqmt == null) ? 0 : msqmt.hashCode());
		result = prime * result + ((msvmt == null) ? 0 : msvmt.hashCode());
		result = prime * result + ((nowz == null) ? 0 : nowz.hashCode());
		temp = Double.doubleToLongBits(obhtz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((obhtztm == null) ? 0 : obhtztm.hashCode());
		temp = Double.doubleToLongBits(obmxq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((obmxqtm == null) ? 0 : obmxqtm.hashCode());
		temp = Double.doubleToLongBits(q);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rdkel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sfq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sfz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((stcd == null) ? 0 : stcd.hashCode());
		temp = Double.doubleToLongBits(taq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(taz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tm == null) ? 0 : tm.hashCode());
		result = prime * result + ((ttt == null) ? 0 : ttt.hashCode());
		result = prime * result + ((wptn == null) ? 0 : wptn.hashCode());
		temp = Double.doubleToLongBits(wrq);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(wrz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xsa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xsavv);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xsmxv);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(z);
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
		WaterInfo_river_one other = (WaterInfo_river_one) obj;
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
		if (Double.doubleToLongBits(flpq) != Double.doubleToLongBits(other.flpq))
			return false;
		if (flwchrcd == null) {
			if (other.flwchrcd != null)
				return false;
		} else if (!flwchrcd.equals(other.flwchrcd))
			return false;
		if (Double.doubleToLongBits(grq) != Double.doubleToLongBits(other.grq))
			return false;
		if (Double.doubleToLongBits(grz) != Double.doubleToLongBits(other.grz))
			return false;
		if (Double.doubleToLongBits(hlz) != Double.doubleToLongBits(other.hlz))
			return false;
		if (hlztm == null) {
			if (other.hlztm != null)
				return false;
		} else if (!hlztm.equals(other.hlztm))
			return false;
		if (Double.doubleToLongBits(hmnq) != Double.doubleToLongBits(other.hmnq))
			return false;
		if (hmnqtm == null) {
			if (other.hmnqtm != null)
				return false;
		} else if (!hmnqtm.equals(other.hmnqtm))
			return false;
		if (Double.doubleToLongBits(hmxavv) != Double.doubleToLongBits(other.hmxavv))
			return false;
		if (hmxavvtm == null) {
			if (other.hmxavvtm != null)
				return false;
		} else if (!hmxavvtm.equals(other.hmxavvtm))
			return false;
		if (Double.doubleToLongBits(hmxs) != Double.doubleToLongBits(other.hmxs))
			return false;
		if (hmxstm == null) {
			if (other.hmxstm != null)
				return false;
		} else if (!hmxstm.equals(other.hmxstm))
			return false;
		if (Double.doubleToLongBits(ivhz) != Double.doubleToLongBits(other.ivhz))
			return false;
		if (ivhztm == null) {
			if (other.ivhztm != null)
				return false;
		} else if (!ivhztm.equals(other.ivhztm))
			return false;
		if (Double.doubleToLongBits(ivmxq) != Double.doubleToLongBits(other.ivmxq))
			return false;
		if (ivmxqtm == null) {
			if (other.ivmxqtm != null)
				return false;
		} else if (!ivmxqtm.equals(other.ivmxqtm))
			return false;
		if (Double.doubleToLongBits(laq) != Double.doubleToLongBits(other.laq))
			return false;
		if (Double.doubleToLongBits(laz) != Double.doubleToLongBits(other.laz))
			return false;
		if (Double.doubleToLongBits(ldkel) != Double.doubleToLongBits(other.ldkel))
			return false;
		if (maxz == null) {
			if (other.maxz != null)
				return false;
		} else if (!maxz.equals(other.maxz))
			return false;
		if (minz == null) {
			if (other.minz != null)
				return false;
		} else if (!minz.equals(other.minz))
			return false;
		if (msamt == null) {
			if (other.msamt != null)
				return false;
		} else if (!msamt.equals(other.msamt))
			return false;
		if (msqmt == null) {
			if (other.msqmt != null)
				return false;
		} else if (!msqmt.equals(other.msqmt))
			return false;
		if (msvmt == null) {
			if (other.msvmt != null)
				return false;
		} else if (!msvmt.equals(other.msvmt))
			return false;
		if (nowz == null) {
			if (other.nowz != null)
				return false;
		} else if (!nowz.equals(other.nowz))
			return false;
		if (Double.doubleToLongBits(obhtz) != Double.doubleToLongBits(other.obhtz))
			return false;
		if (obhtztm == null) {
			if (other.obhtztm != null)
				return false;
		} else if (!obhtztm.equals(other.obhtztm))
			return false;
		if (Double.doubleToLongBits(obmxq) != Double.doubleToLongBits(other.obmxq))
			return false;
		if (obmxqtm == null) {
			if (other.obmxqtm != null)
				return false;
		} else if (!obmxqtm.equals(other.obmxqtm))
			return false;
		if (Double.doubleToLongBits(q) != Double.doubleToLongBits(other.q))
			return false;
		if (Double.doubleToLongBits(rdkel) != Double.doubleToLongBits(other.rdkel))
			return false;
		if (Double.doubleToLongBits(sfq) != Double.doubleToLongBits(other.sfq))
			return false;
		if (Double.doubleToLongBits(sfz) != Double.doubleToLongBits(other.sfz))
			return false;
		if (stcd == null) {
			if (other.stcd != null)
				return false;
		} else if (!stcd.equals(other.stcd))
			return false;
		if (Double.doubleToLongBits(taq) != Double.doubleToLongBits(other.taq))
			return false;
		if (Double.doubleToLongBits(taz) != Double.doubleToLongBits(other.taz))
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
		if (wptn == null) {
			if (other.wptn != null)
				return false;
		} else if (!wptn.equals(other.wptn))
			return false;
		if (Double.doubleToLongBits(wrq) != Double.doubleToLongBits(other.wrq))
			return false;
		if (Double.doubleToLongBits(wrz) != Double.doubleToLongBits(other.wrz))
			return false;
		if (Double.doubleToLongBits(xsa) != Double.doubleToLongBits(other.xsa))
			return false;
		if (Double.doubleToLongBits(xsavv) != Double.doubleToLongBits(other.xsavv))
			return false;
		if (Double.doubleToLongBits(xsmxv) != Double.doubleToLongBits(other.xsmxv))
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
	public Date getTm() {
		return tm;
	}
	public void setTm(Date tm) {
		this.tm = tm;
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
	public double getXsa() {
		return xsa;
	}
	public void setXsa(double xsa) {
		this.xsa = xsa;
	}
	public double getXsavv() {
		return xsavv;
	}
	public void setXsavv(double xsavv) {
		this.xsavv = xsavv;
	}
	public double getXsmxv() {
		return xsmxv;
	}
	public void setXsmxv(double xsmxv) {
		this.xsmxv = xsmxv;
	}
	public String getFlwchrcd() {
		return flwchrcd;
	}
	public void setFlwchrcd(String flwchrcd) {
		this.flwchrcd = flwchrcd;
	}
	public String getWptn() {
		return wptn;
	}
	public void setWptn(String wptn) {
		this.wptn = wptn;
	}
	public String getMsqmt() {
		return msqmt;
	}
	public void setMsqmt(String msqmt) {
		this.msqmt = msqmt;
	}
	public String getMsamt() {
		return msamt;
	}
	public void setMsamt(String msamt) {
		this.msamt = msamt;
	}
	public String getMsvmt() {
		return msvmt;
	}
	public void setMsvmt(String msvmt) {
		this.msvmt = msvmt;
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
	public double getLdkel() {
		return ldkel;
	}
	public void setLdkel(double ldkel) {
		this.ldkel = ldkel;
	}
	public double getRdkel() {
		return rdkel;
	}
	public void setRdkel(double rdkel) {
		this.rdkel = rdkel;
	}
	public double getWrz() {
		return wrz;
	}
	public void setWrz(double wrz) {
		this.wrz = wrz;
	}
	public double getWrq() {
		return wrq;
	}
	public void setWrq(double wrq) {
		this.wrq = wrq;
	}
	public double getGrz() {
		return grz;
	}
	public void setGrz(double grz) {
		this.grz = grz;
	}
	public double getGrq() {
		return grq;
	}
	public void setGrq(double grq) {
		this.grq = grq;
	}
	public double getFlpq() {
		return flpq;
	}
	public void setFlpq(double flpq) {
		this.flpq = flpq;
	}
	public double getObhtz() {
		return obhtz;
	}
	public void setObhtz(double obhtz) {
		this.obhtz = obhtz;
	}
	public Date getObhtztm() {
		return obhtztm;
	}
	public void setObhtztm(Date obhtztm) {
		this.obhtztm = obhtztm;
	}
	public double getIvhz() {
		return ivhz;
	}
	public void setIvhz(double ivhz) {
		this.ivhz = ivhz;
	}
	public Date getIvhztm() {
		return ivhztm;
	}
	public void setIvhztm(Date ivhztm) {
		this.ivhztm = ivhztm;
	}
	public double getObmxq() {
		return obmxq;
	}
	public void setObmxq(double obmxq) {
		this.obmxq = obmxq;
	}
	public Date getObmxqtm() {
		return obmxqtm;
	}
	public void setObmxqtm(Date obmxqtm) {
		this.obmxqtm = obmxqtm;
	}
	public double getIvmxq() {
		return ivmxq;
	}
	public void setIvmxq(double ivmxq) {
		this.ivmxq = ivmxq;
	}
	public Date getIvmxqtm() {
		return ivmxqtm;
	}
	public void setIvmxqtm(Date ivmxqtm) {
		this.ivmxqtm = ivmxqtm;
	}
	public double getHmxs() {
		return hmxs;
	}
	public void setHmxs(double hmxs) {
		this.hmxs = hmxs;
	}
	public Date getHmxstm() {
		return hmxstm;
	}
	public void setHmxstm(Date hmxstm) {
		this.hmxstm = hmxstm;
	}
	public double getHmxavv() {
		return hmxavv;
	}
	public void setHmxavv(double hmxavv) {
		this.hmxavv = hmxavv;
	}
	public Date getHmxavvtm() {
		return hmxavvtm;
	}
	public void setHmxavvtm(Date hmxavvtm) {
		this.hmxavvtm = hmxavvtm;
	}
	public double getHlz() {
		return hlz;
	}
	public void setHlz(double hlz) {
		this.hlz = hlz;
	}
	public Date getHlztm() {
		return hlztm;
	}
	public void setHlztm(Date hlztm) {
		this.hlztm = hlztm;
	}
	public double getHmnq() {
		return hmnq;
	}
	public void setHmnq(double hmnq) {
		this.hmnq = hmnq;
	}
	public Date getHmnqtm() {
		return hmnqtm;
	}
	public void setHmnqtm(Date hmnqtm) {
		this.hmnqtm = hmnqtm;
	}
	public double getTaz() {
		return taz;
	}
	public void setTaz(double taz) {
		this.taz = taz;
	}
	public double getTaq() {
		return taq;
	}
	public void setTaq(double taq) {
		this.taq = taq;
	}
	public double getLaz() {
		return laz;
	}
	public void setLaz(double laz) {
		this.laz = laz;
	}
	public double getLaq() {
		return laq;
	}
	public void setLaq(double laq) {
		this.laq = laq;
	}
	public double getSfz() {
		return sfz;
	}
	public void setSfz(double sfz) {
		this.sfz = sfz;
	}
	public double getSfq() {
		return sfq;
	}
	public void setSfq(double sfq) {
		this.sfq = sfq;
	}
	public String getTtt() {
		return ttt;
	}
	public void setTtt(String ttt) {
		this.ttt = ttt;
	}
	public String getMinz() {
		return minz;
	}
	public void setMinz(String minz) {
		this.minz = minz;
	}
	public String getMaxz() {
		return maxz;
	}
	public void setMaxz(String maxz) {
		this.maxz = maxz;
	}
	public String getNowz() {
		return nowz;
	}
	public void setNowz(String nowz) {
		this.nowz = nowz;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

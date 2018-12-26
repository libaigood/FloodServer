package com.bzh.floodserver.model.sjappfu;

import java.io.Serializable;

/**
 * 基础信息表ST_STBPRP_B
 * */
public class DJ_AD implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6282882032484505806L;
	public String adcd;
	public String adnm;
	public DJ_AD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DJ_AD(String adcd, String adnm) {
		super();
		this.adcd = adcd;
		this.adnm = adnm;
	}
	@Override
	public String toString() {
		return "DJ_AD [adcd=" + adcd + ", adnm=" + adnm + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adcd == null) ? 0 : adcd.hashCode());
		result = prime * result + ((adnm == null) ? 0 : adnm.hashCode());
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
		DJ_AD other = (DJ_AD) obj;
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
		return true;
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

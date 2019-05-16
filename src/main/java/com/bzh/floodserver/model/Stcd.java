package com.bzh.floodserver.model;

public class Stcd {
    private String STCD;//站点编号
    private String STNM;//站点指定
    private String LGTD;//站点经度
    private String LTTD;//站点维度
    private String STLC;//站点地址
    private String STTP;//站类  气象站	MM	雨量站	PP
                             // 蒸发站	BB	河道水文站	ZQ
                             // 堰闸水文站	DD	河道水位站	ZZ
                             //潮位站	TT	水库水文站	RR
                             //泵站	 DP	地下水站	ZG
                             // 墒情站	SS	分洪水位站	ZB


    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM;
    }

    public String getLGTD() {
        return LGTD;
    }

    public void setLGTD(String LGTD) {
        this.LGTD = LGTD;
    }

    public String getLTTD() {
        return LTTD;
    }

    public void setLTTD(String LTTD) {
        this.LTTD = LTTD;
    }

    public String getSTLC() {
        return STLC;
    }

    public void setSTLC(String STLC) {
        this.STLC = STLC;
    }

    public String getSTTP() {
        return STTP;
    }

    public void setSTTP(String STTP) {
        this.STTP = STTP;
    }
}

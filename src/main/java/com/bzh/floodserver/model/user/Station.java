package com.bzh.floodserver.model.user;

/**
 * @Author: libai
 * @Date: 2019/5/23 13:50
 * @Version 1.0
 * @Description:用于用户关注那个县域的那个站号，站号的名字
 * Station==站
 */
public class Station {
    private String STCD;//站号
    private String STNM;//站名
    private String ADNM;//县域

    public Station() {
    }

    public Station(String STCD, String STNM) {
        this.STCD = STCD;
        this.STNM = STNM;
    }

    public Station(String STCD, String STNM, String ADNM) {
        this.STCD = STCD;
        this.STNM = STNM;
        this.ADNM = ADNM;
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STND) {
        this.STNM = STND;
    }

    public String getADNM() {
        return ADNM;
    }

    public void setADNM(String ADNM) {
        this.ADNM = ADNM;
    }

    @Override
    public String toString() {
        return "Station{" +
                "STCD='" + STCD + '\'' +
                ", STND='" + STNM + '\'' +
                ", ADNM='" + ADNM + '\'' +
                '}';
    }
}

package com.bzh.floodserver.model.user;

import java.util.List;

/**
 * @Author: libai
 * @Date: 2019/5/23 15:14
 * @Version 1.0
 * @Description:
 */
public class TStation {
    private String ADNM;//县域
    private List<CStation> stationList;
    public TStation(String ADNM, List<CStation> stationList) {
        this.ADNM = ADNM;
        this.stationList = stationList;
    }

    public String getADNM() {
        return ADNM;
    }

    public void setADNM(String ADNM) {
        this.ADNM = ADNM;
    }

    public List<CStation> getStationList() {
        return stationList;
    }

    public void setStationList(List<CStation> stationList) {
        this.stationList = stationList;
    }

    //    public class dd {
//
//    }
    public static class CStation {
        private String STCD;//站号
        private String STNM;//站名
        private Boolean whether;//是否

        public CStation() {
        }

        public CStation(String STCD, String STNM, Boolean whether) {
            this.STCD = STCD;
            this.STNM = STNM;
            this.whether = whether;
        }

        public CStation(String STCD, String STNM) {
            this.STCD = STCD;
            this.STNM = STNM;
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

        public void setSTNM(String STNM) {
            this.STNM = STNM;
        }

        public Boolean getWhether() {
            return whether;
        }

        public void setWhether(Boolean whether) {
            this.whether = whether;
        }

        @Override
        public String toString() {
            return "CStation{" +
                    "STCD='" + STCD + '\'' +
                    ", STNM='" + STNM + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "TStation{" +
                "ADNM='" + ADNM + '\'' +
                ", stationList=" + stationList +
                '}';
    }
}

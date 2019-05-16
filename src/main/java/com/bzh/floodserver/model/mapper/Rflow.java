package com.bzh.floodserver.model.mapper;

public class Rflow {
    private String stcd;
    private String stnm;
    private String adnm;
    private double dyp;

    public Rflow() {
    }

    public Rflow(String stcd, String stnm, String adnm, double dyp) {
        this.stcd = stcd;
        this.stnm = stnm;
        this.adnm = adnm;
        this.dyp = dyp;
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

    public String getAdnm() {
        return adnm;
    }

    public void setAdnm(String adnm) {
        this.adnm = adnm;
    }

    public double getDyp() {
        return dyp;
    }

    public void setDyp(double dyp) {
        this.dyp = dyp;
    }

}

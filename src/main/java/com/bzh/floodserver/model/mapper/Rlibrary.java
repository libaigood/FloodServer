package com.bzh.floodserver.model.mapper;

public class Rlibrary {
    private String stcd;
    private String stnm;
    private String adnm;
    private double rz;
    private double inq;
    private double otq;

    public Rlibrary() {
    }

    public Rlibrary(String stcd, String stnm, String adnm, double rz, double inq, double otq) {
        this.stcd = stcd;
        this.stnm = stnm;
        this.adnm = adnm;
        this.rz = rz;
        this.inq = inq;
        this.otq = otq;
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

    public double getOtq() {
        return otq;
    }

    public void setOtq(double otq) {
        this.otq = otq;
    }
}

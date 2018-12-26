package com.bzh.floodserver.model.mapper;

public class Ravenue {
    private String stcd;
    private String stnm;
    private String rvnm;
    private double q;
    private double z;

    public Ravenue() {
    }

    public Ravenue(String stcd, String stnm, String rvnm, double q, double z) {
        this.stcd = stcd;
        this.stnm = stnm;
        this.rvnm = rvnm;
        this.q = q;
        this.z = z;
    }

    public Ravenue(String stnm, String rvnm, double q, double z) {
        this.stnm = stnm;
        this.rvnm = rvnm;
        this.q = q;
        this.z = z;
    }

    public String getStnm() {
        return stnm;
    }

    public void setSinm(String sinm) {
        this.stnm = sinm;
    }

    public String getRvnm() {
        return rvnm;
    }

    public void setRvnm(String rvnm) {
        this.rvnm = rvnm;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    public void setStnm(String stnm) {
        this.stnm = stnm;
    }
}

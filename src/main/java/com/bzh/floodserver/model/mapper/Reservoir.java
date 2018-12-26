package com.bzh.floodserver.model.mapper;

import java.util.Date;

/**
 * 水库水位站点信息
 */
public class Reservoir {
    private String stcd;
    private Date tm;
    private Double rz;
    private String inq;
    private double w;
    private String otq;


    public Reservoir() {
    }

    public Reservoir(String stcd, Date tm, Double rz, String inq, double w,String otq) {
        this.stcd = stcd;
        this.tm = tm;
        this.rz = rz;
        this.inq = inq;
        this.w = w;
        this.otq = otq;

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

    public Double getRz() {
        return rz;
    }

    public void setRz(Double rz) {
        this.rz = rz;
    }

    public String getInq() {
        return inq;
    }

    public void setInq(String inq) {
        this.inq = inq;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }


    public String getOtq() {
        return otq;
    }

    public void setOtq(String otq) {
        this.otq = otq;
    }

}

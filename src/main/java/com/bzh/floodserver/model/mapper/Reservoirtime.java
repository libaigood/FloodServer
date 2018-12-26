package com.bzh.floodserver.model.mapper;

import java.util.Date;

/**
 * 水库（时）信息
 */
public class Reservoirtime {
    private Date tm;//时间
    private double rz;//库上水位
    private double w;//蓄水量

    public Reservoirtime(Date tm, double rz, double w) {
        this.tm = tm;
        this.rz = rz;
        this.w = w;
    }

    public Reservoirtime() {
    }

    public Date getTm() {
        return tm;
    }

    public void setTm(Date tm) {
        this.tm = tm;
    }

    public double getRz() {
        return rz;
    }

    public void setRz(double rz) {
        this.rz = rz;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "Reservoirtime{" +
                "tm=" + tm +
                ", rz=" + rz +
                ", w=" + w +
                '}';
    }
}

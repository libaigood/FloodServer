package com.bzh.floodserver.model.mapper;

import java.util.Date;

/**
 * 河道（时）信息
 */
public class Rivertime {
    private Date ymdhm;//时间
    private double q;//流量
    private double zr;//水位值

    private String subscripttime;//统计图时间

    public String getSubscripttime() {
        return subscripttime;
    }

    public void setSubscripttime(String subscripttime) {
        this.subscripttime = subscripttime;
    }

    public Rivertime() {
    }

    public Rivertime(Date ymdhm, double q, double zr) {
        this.ymdhm = ymdhm;
        this.q = q;
        this.zr = zr;
    }

    public Date getYmdhm() {
        return ymdhm;
    }

    public void setYmdhm(Date ymdhm) {
        this.ymdhm = ymdhm;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public double getZr() {
        return zr;
    }

    public void setZr(double zr) {
        this.zr = zr;
    }

    @Override
    public String toString() {
        return "Rivertime{" +
                "ymdhm=" + ymdhm +
                ", q=" + q +
                ", zr=" + zr +
                '}';
    }
}

package com.bzh.floodserver.model.mapper;

import java.util.Date;

/**
 * 获取河道的站点信息
 */
public class River {
    //站号
    private String stcd;
    //水位
    private double z;
    //流量
    private double q;
    //时间
    private Date tm;
    //超过警戒水位
    private double chaochu;
    //警戒水位
    private double wrz;

    public double getWrz() {
        return wrz;
    }

    public void setWrz(double wrz) {
        this.wrz = wrz;
    }

    public River() {
    }

    public River(String stcd, double z, double q, Date ymdhm, double chaochu, double wrz) {
        this.stcd = stcd;
        this.z = z;
        this.q = q;
        this.tm = ymdhm;
        this.chaochu = chaochu;
        this.wrz = wrz;
    }

    public River(String stcd, double z, double q, Date ymdhm, double chaochu) {
        this.stcd = stcd;
        this.z = z;
        this.q = q;
        this.tm = ymdhm;
        this.chaochu = chaochu;
    }

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public Date getYmdhm() {
        return tm;
    }

    public void setYmdhm(Date ymdhm) {
        this.tm = ymdhm;
    }

    public double getChaochu() {
        return chaochu;
    }

    public void setChaochu(double chaochu) {
        this.chaochu = chaochu;
    }

    @Override
    public String toString() {
        return "River{" +
                "stcd='" + stcd + '\'' +
                ", z=" + z +
                ", q=" + q +
                ", ymdhm=" + tm +
                ", chaochu=" + chaochu +
                ", wrz=" + wrz +
                '}';
    }
}

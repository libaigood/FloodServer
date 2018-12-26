package com.bzh.floodserver.model.mapper;

/**
 * 河道防洪指标表表结构
 */
public class St_rvfcch_b {
    //测站编号
    private String stcd;
    //警戒水位
    private double wrz;

    public St_rvfcch_b() {
    }

    public St_rvfcch_b(String stcd, double wrz) {
        this.stcd = stcd;
        this.wrz = wrz;
    }

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    public double getWrz() {
        return wrz;
    }

    public void setWrz(double wrz) {
        this.wrz = wrz;
    }

}

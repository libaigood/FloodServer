package com.bzh.floodserver.model.mapper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Rainfall {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private Date tm;
    private String drp;
    private String tmaa;

    private String subscripttime;//统计图时间

    public String getSubscripttime() {
        return subscripttime;
    }

    public void setSubscripttime(String subscripttime) {
        this.subscripttime = subscripttime;
    }

    public Rainfall(Date tm, String drp) {
        this.tm = tm;
        this.drp = drp;
    }

    public Rainfall() {
    }

    public Date getTm() {
        return tm;
    }

    public void setTm(Date tm) {
        this.tm = tm;
    }

    public String getDrp() {
        return drp;
    }

    public void setDrp(String drp) {
        this.drp = drp;
    }

    @Override
    public String toString() {
        return "Rainfall{" +
                "tm=" + dateFormat.format(tm) +
                ", drp='" + drp + '\'' +
                '}';
    }

    public String getTmaa() {
        return tmaa;
    }

    public void setTmaa(String tmaa) {
        this.tmaa = tmaa;
    }
}

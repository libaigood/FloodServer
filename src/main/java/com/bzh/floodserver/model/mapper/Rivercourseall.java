package com.bzh.floodserver.model.mapper;

import java.util.Date;
import java.util.List;

/**
 * 获取河道的站点信息
 * 获取河道（时）信息
 */
public class Rivercourseall {
    private River river;
    private List<Rivertime> rivertimeList;

    public Rivercourseall() {
    }

    public Rivercourseall(River river) {
        this.river = river;
    }

    public Rivercourseall(List<Rivertime> rivertimeList) {
        this.rivertimeList = rivertimeList;
    }

    public Rivercourseall(River river, List<Rivertime> rivertimeList) {
        this.river = river;
        this.rivertimeList = rivertimeList;
    }

    public River getRiver() {
        return river;
    }

    public void setRiver(River river) {
        this.river = river;
    }

    public List<Rivertime> getRivertimeList() {
        return rivertimeList;
    }

    public void setRivertimeList(List<Rivertime> rivertimeList) {
        this.rivertimeList = rivertimeList;
    }
}
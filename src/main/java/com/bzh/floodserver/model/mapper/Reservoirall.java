package com.bzh.floodserver.model.mapper;

import java.util.List;

public class Reservoirall {
    //水库水位站点信息
    private Reservoir reservoir;
    //水库（时）信息
    private List<Reservoirtime> reservoirtimeList;

    public Reservoirall() {
    }

    public Reservoirall(Reservoir reservoir, List<Reservoirtime> reservoirtimeList) {
        this.reservoir = reservoir;
        this.reservoirtimeList = reservoirtimeList;
    }

    public Reservoir getReservoir() {
        return reservoir;
    }

    public void setReservoir(Reservoir reservoir) {
        this.reservoir = reservoir;
    }

    public List<Reservoirtime> getReservoirtimeList() {
        return reservoirtimeList;
    }

    public void setReservoirtimeList(List<Reservoirtime> reservoirtimeList) {
        this.reservoirtimeList = reservoirtimeList;
    }
}

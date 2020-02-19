package ru.task2;

import java.util.List;

public class Worker {

    private String name;
    private List<Stationery> stationeries;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stationery> getStationeries() {
        return stationeries;
    }

    public void setStationeries(List<Stationery> stationeries) {
        this.stationeries = stationeries;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", stationeries=" + stationeries +
                '}';
    }
}

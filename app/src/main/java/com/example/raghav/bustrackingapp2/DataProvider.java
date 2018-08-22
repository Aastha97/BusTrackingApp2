package com.example.raghav.bustrackingapp2;

/**
 * Created by Raghav on 18/12/2017.
 */

public class DataProvider {
    private  String bus;
    private  String driver;
    private  String route;
    private  String dl;

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDl() {
        return dl;
    }

    public void setDl(String dl) {
        this.dl = dl;
    }

    public DataProvider(String bus, String driver, String route, String dl)
    {
        this.bus = bus;
        this.driver = driver;
        this.route = route;
        this.dl = dl;



    }
}

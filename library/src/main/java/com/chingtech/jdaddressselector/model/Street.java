package com.chingtech.jdaddressselector.model;

public class Street {

    private int    id;
    private int    county_id;
    private String name;

    public Street() {
    }

    public Street(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountyId() {
        return county_id;
    }

    public void setCountyId(int county_id) {
        this.county_id = county_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
package com.example.practice12test;

// Country.java
public class Country {
    private String name;
    private String capital;
    private String info;

    public Country(String name, String capital, String info) {
        this.name = name;
        this.capital = capital;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getInfo() {
        return info;
    }
}

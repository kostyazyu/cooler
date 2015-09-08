package com.kostyazyu.cooler.model;

public class City {
    private int id;
    private int coordinates; //external ID. Latitude + longitude (only full degrees). Example Moscow(Russian capital) coordinates = 5537
    private String name;
    private int baseTemperature;
    private double baseRelativeHumidity;

    public City() {
    }

    public City(int id, int coordinates, String name, int baseTemperature, double baseRelativeHumidity) {
        this.id = id;
        this.coordinates = coordinates;
        this.name = name;
        this.baseTemperature = baseTemperature;
        this.baseRelativeHumidity = baseRelativeHumidity;
    }
}

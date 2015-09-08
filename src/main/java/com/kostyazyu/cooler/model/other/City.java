package com.kostyazyu.cooler.model.other;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseTemperature() {
        return baseTemperature;
    }

    public void setBaseTemperature(int baseTemperature) {
        this.baseTemperature = baseTemperature;
    }

    public double getBaseRelativeHumidity() {
        return baseRelativeHumidity;
    }

    public void setBaseRelativeHumidity(double baseRelativeHumidity) {
        this.baseRelativeHumidity = baseRelativeHumidity;
    }
}

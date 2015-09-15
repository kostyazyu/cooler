package com.kostyazyu.cooler.model.other;

public class City {
    private int id;
    private int coordinates; //external ID. Latitude + longitude (only full degrees). Example Moscow(Russian capital) coordinates = 5537
    private String name;
    private int baseTemperature_C;
    private double baseRelativeHumidity_df;

    public City() {
    }

    public City(int id, int coordinates, String name, int baseTemperature_C, double baseRelativeHumidity_df) {
        this.id = id;
        this.coordinates = coordinates;
        this.name = name;
        this.baseTemperature_C = baseTemperature_C;
        this.baseRelativeHumidity_df = baseRelativeHumidity_df;
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

    public int getBaseTemperature_C() {
        return baseTemperature_C;
    }

    public void setBaseTemperature_C(int baseTemperature_C) {
        this.baseTemperature_C = baseTemperature_C;
    }

    public double getBaseRelativeHumidity_df() {
        return baseRelativeHumidity_df;
    }

    public void setBaseRelativeHumidity_df(double baseRelativeHumidity_df) {
        this.baseRelativeHumidity_df = baseRelativeHumidity_df;
    }
}

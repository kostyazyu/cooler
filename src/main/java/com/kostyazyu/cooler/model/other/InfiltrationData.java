package com.kostyazyu.cooler.model.other;

public class InfiltrationData {
    private double height_m;
    private double width_m;
    private double openCoefficient_df; //decimal fraction
    private double curtainCoefficient_df; //decimal fraction
    private boolean hasAutomaticDoor;

    public InfiltrationData() {
    }

    public InfiltrationData(double height_m,
                            double width_m,
                            double openCoefficient_df,
                            double curtainCoefficient_df,
                            boolean hasAutomaticDoor) {

        this.height_m = height_m;
        this.width_m = width_m;
        this.openCoefficient_df = openCoefficient_df;
        this.curtainCoefficient_df = curtainCoefficient_df;
        this.hasAutomaticDoor = hasAutomaticDoor;
    }

    public double getHeight_m() {
        return height_m;
    }

    public void setHeight_m(double height_m) {
        this.height_m = height_m;
    }

    public double getWidth_m() {
        return width_m;
    }

    public void setWidth_m(double width_m) {
        this.width_m = width_m;
    }

    public double getOpenCoefficient_df() {
        return openCoefficient_df;
    }

    public void setOpenCoefficient_df(double openCoefficient_df) {
        this.openCoefficient_df = openCoefficient_df;
    }

    public double getCurtainCoefficient_df() {
        return curtainCoefficient_df;
    }

    public void setCurtainCoefficient_df(double curtainCoefficient_df) {
        this.curtainCoefficient_df = curtainCoefficient_df;
    }

    public boolean isHasAutomaticDoor() {
        return hasAutomaticDoor;
    }

    public void setHasAutomaticDoor(boolean hasAutomaticDoor) {
        this.hasAutomaticDoor = hasAutomaticDoor;
    }
}

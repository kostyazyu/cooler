package com.kostyazyu.cooler.model.other;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class InfiltrationData {

    @NotNull
    @Column(name = "doorHeightM")
    private Double doorHeightM;

    @NotNull
    @Column(name = "doorWidthM")
    private Double doorWidthM;

    @NotNull
    @Column(name = "openCoefficientDF")
    private Double openCoefficientDF; //decimal fraction

    @NotNull
    @Column(name = "curtainCoefficientDF")
    private Double curtainCoefficientDF; //decimal fraction

    @NotNull
    @Column(name = "automaticDoor")
    private Boolean automaticDoor;

    public InfiltrationData() {
    }

    public InfiltrationData(Double doorHeightM, Double doorWidthM, Double openCoefficientDF, Double curtainCoefficientDF, Boolean automaticDoor) {
        this.doorHeightM = doorHeightM;
        this.doorWidthM = doorWidthM;
        this.openCoefficientDF = openCoefficientDF;
        this.curtainCoefficientDF = curtainCoefficientDF;
        this.automaticDoor = automaticDoor;
    }

    public Double getDoorHeightM() {
        return doorHeightM;
    }

    public void setDoorHeightM(Double doorHeightM) {
        this.doorHeightM = doorHeightM;
    }

    public Double getDoorWidthM() {
        return doorWidthM;
    }

    public void setDoorWidthM(Double doorWidthM) {
        this.doorWidthM = doorWidthM;
    }

    public Double getOpenCoefficientDF() {
        return openCoefficientDF;
    }

    public void setOpenCoefficientDF(Double openCoefficientDF) {
        this.openCoefficientDF = openCoefficientDF;
    }

    public Double getCurtainCoefficientDF() {
        return curtainCoefficientDF;
    }

    public void setCurtainCoefficientDF(Double curtainCoefficientDF) {
        this.curtainCoefficientDF = curtainCoefficientDF;
    }

    public Boolean getAutomaticDoor() {
        return automaticDoor;
    }

    public void setAutomaticDoor(Boolean automaticDoor) {
        this.automaticDoor = automaticDoor;
    }
}

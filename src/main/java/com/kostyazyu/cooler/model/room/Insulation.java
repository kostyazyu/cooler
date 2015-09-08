package com.kostyazyu.cooler.model.room;

public class Insulation {
    private InsulationMaterial material;
    private double thickness_mm;

    public Insulation() {
        material = new InsulationMaterial();
    }

    public Insulation(InsulationMaterial material, double thickness_mm) {
        this.material = material;
        this.thickness_mm = thickness_mm;
    }

    public InsulationMaterial getMaterial() {
        return material;
    }

    public void setMaterial(InsulationMaterial material) {
        this.material = material;
    }

    public double getThickness_mm() {
        return thickness_mm;
    }

    public void setThickness_mm(double thickness_mm) {
        this.thickness_mm = thickness_mm;
    }
}

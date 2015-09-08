package com.kostyazyu.cooler.model.room;

public class ColdRoomData {
    private int length_m;
    private int width_m;
    private int height_m;
    private int baseInTemperature_C;
    private int baseOutTemperature_C;
    private InsulatedBarrier wall_1;
    private InsulatedBarrier wall_2;
    private InsulatedBarrier wall_3;
    private InsulatedBarrier wall_4;
    InsulatedBarrier floor;
    InsulatedBarrier ceiling;

    public ColdRoomData() {
    }

    public ColdRoomData(int length_m,
                        int width_m,
                        int height_m,
                        int baseInTemperature_C,
                        int baseOutTemperature_C,
                        InsulatedBarrier wall_1,
                        InsulatedBarrier wall_2,
                        InsulatedBarrier wall_3,
                        InsulatedBarrier wall_4,
                        InsulatedBarrier floor,
                        InsulatedBarrier ceiling) {
        this.length_m = length_m;
        this.width_m = width_m;
        this.height_m = height_m;
        this.baseInTemperature_C = baseInTemperature_C;
        this.baseOutTemperature_C = baseOutTemperature_C;
        this.wall_1 = wall_1;
        this.wall_2 = wall_2;
        this.wall_3 = wall_3;
        this.wall_4 = wall_4;
        this.floor = floor;
        this.ceiling = ceiling;
    }

    public int getLength_m() {
        return length_m;
    }

    public void setLength_m(int length_m) {
        this.length_m = length_m;
    }

    public int getWidth_m() {
        return width_m;
    }

    public void setWidth_m(int width_m) {
        this.width_m = width_m;
    }

    public int getHeight_m() {
        return height_m;
    }

    public void setHeight_m(int height_m) {
        this.height_m = height_m;
    }

    public int getBaseInTemperature_C() {
        return baseInTemperature_C;
    }

    public void setBaseInTemperature_C(int baseInTemperature_C) {
        this.baseInTemperature_C = baseInTemperature_C;
    }

    public int getBaseOutTemperature_C() {
        return baseOutTemperature_C;
    }

    public void setBaseOutTemperature_C(int baseOutTemperature_C) {
        this.baseOutTemperature_C = baseOutTemperature_C;
    }

    public InsulatedBarrier getWall_1() {
        return wall_1;
    }

    public void setWall_1(InsulatedBarrier wall_1) {
        this.wall_1 = wall_1;
    }

    public InsulatedBarrier getWall_2() {
        return wall_2;
    }

    public void setWall_2(InsulatedBarrier wall_2) {
        this.wall_2 = wall_2;
    }

    public InsulatedBarrier getWall_3() {
        return wall_3;
    }

    public void setWall_3(InsulatedBarrier wall_3) {
        this.wall_3 = wall_3;
    }

    public InsulatedBarrier getWall_4() {
        return wall_4;
    }

    public void setWall_4(InsulatedBarrier wall_4) {
        this.wall_4 = wall_4;
    }

    public InsulatedBarrier getFloor() {
        return floor;
    }

    public void setFloor(InsulatedBarrier floor) {
        this.floor = floor;
    }

    public InsulatedBarrier getCeiling() {
        return ceiling;
    }

    public void setCeiling(InsulatedBarrier ceiling) {
        this.ceiling = ceiling;
    }
}

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
                        int baseOutTemperature_C) {
        this.length_m = length_m;
        this.width_m = width_m;
        this.height_m = height_m;
        this.baseInTemperature_C = baseInTemperature_C;
        this.baseOutTemperature_C = baseOutTemperature_C;
        wall_1 = new InsulatedBarrier(baseInTemperature_C, baseOutTemperature_C, length_m, height_m);
        wall_2 = new InsulatedBarrier(baseInTemperature_C, baseOutTemperature_C, width_m, height_m);
        wall_3 = new InsulatedBarrier(baseInTemperature_C, baseOutTemperature_C, length_m, height_m);
        wall_4 = new InsulatedBarrier(baseInTemperature_C, baseOutTemperature_C, width_m, height_m);
        floor = new InsulatedBarrier(baseInTemperature_C, baseOutTemperature_C, width_m, height_m);
        ceiling = new InsulatedBarrier(baseInTemperature_C, baseOutTemperature_C, width_m, height_m);
    }

}

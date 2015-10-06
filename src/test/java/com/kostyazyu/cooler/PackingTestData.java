package com.kostyazyu.cooler;

import com.kostyazyu.cooler.matcher.ModelMatcher;
import com.kostyazyu.cooler.model.other.City;
import com.kostyazyu.cooler.model.product.Packing;

import java.util.Arrays;
import java.util.List;

import static com.kostyazyu.cooler.model.BaseEntity.START_SEQ;

public class PackingTestData {

    public static final Integer PACKING_SEQUENCE = START_SEQ + 6;

    public static final Packing PPU = new Packing(PACKING_SEQUENCE, "PPU", 1000);
    public static final Packing PERLIT = new Packing(PACKING_SEQUENCE + 1, "Perlit", 3000);
    public static final Packing MINWOOL = new Packing(PACKING_SEQUENCE + 2, "MinWool", 2000);

    public static final List<Packing> PACKINGS = Arrays.asList(MINWOOL, PERLIT, PPU);

    public static Packing getCreated() {
        return new Packing(null, "Ananas", 500);
    }

    public static Packing getUpdated() {
        return new Packing(PACKING_SEQUENCE, "PPU Updated", 1000);
    }

    public static final ModelMatcher<Packing, String> MATCHER = new ModelMatcher<>(Packing::toString);



}

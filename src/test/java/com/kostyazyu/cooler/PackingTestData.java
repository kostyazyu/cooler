package com.kostyazyu.cooler;

import com.kostyazyu.cooler.matcher.ModelMatcher;
import com.kostyazyu.cooler.model.product.Packing;

import java.util.Arrays;
import java.util.List;

import static com.kostyazyu.cooler.model.BaseEntity.START_SEQ;

public class PackingTestData {

    public static final Integer PACKING_SEQUENCE = START_SEQ + 6;

    public static final Packing CARDBOARD = new Packing(PACKING_SEQUENCE, "Cardboard", 1000);
    public static final Packing PLASTIC = new Packing(PACKING_SEQUENCE + 1, "Plastic", 3000);
    public static final Packing FOIL = new Packing(PACKING_SEQUENCE + 2, "Foil", 2000);

    public static final List<Packing> PACKINGS = Arrays.asList(CARDBOARD, FOIL, PLASTIC);

    public static Packing getCreated() {
        return new Packing(null, "Wood", 500);
    }

    public static Packing getUpdated() {
        return new Packing(PACKING_SEQUENCE, "Cardboard Updated", 1000);
    }

    public static final ModelMatcher<Packing, String> MATCHER = new ModelMatcher<>(Packing::toString);



}

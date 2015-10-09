package com.kostyazyu.cooler;

import com.kostyazyu.cooler.matcher.ModelMatcher;
import com.kostyazyu.cooler.model.room.InsulationMaterial;

import java.util.Arrays;
import java.util.List;

import static com.kostyazyu.cooler.model.BaseEntity.START_SEQ;

/**
 * Created by Konstantin Zyubin
 * on 07.10.2015.
 * Moscow, Reutov
 */
public class InsulationMaterialTestData {

    public static final Integer INSULATION_SEQUENCE = START_SEQ + 12;

    public static final InsulationMaterial PLASTIC_FOAM = new InsulationMaterial(INSULATION_SEQUENCE, "Plastic Foam", 1000);
    public static final InsulationMaterial GLASS_WOOL = new InsulationMaterial(INSULATION_SEQUENCE+1, "Glass-wool", 2000);
    public static final InsulationMaterial FOAMEX = new InsulationMaterial(INSULATION_SEQUENCE + 2, "Foamex", 3000.5d);

    public static List<InsulationMaterial> INSULATIONS = Arrays.asList(FOAMEX, GLASS_WOOL, PLASTIC_FOAM);

    public static InsulationMaterial getCreated() {
        return new InsulationMaterial(null, "DSP", 4000);
    }

    public static InsulationMaterial getUpdated() {
        return new InsulationMaterial(INSULATION_SEQUENCE, "Plastic Foam Updated", 1000);
    }

    public static final ModelMatcher<InsulationMaterial, String> MATCHER = new ModelMatcher<>(InsulationMaterial::toString);
}

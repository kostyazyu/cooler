package com.kostyazyu.cooler.dao;

import com.kostyazyu.cooler.model.room.InsulationMaterial;

import java.util.List;

/**
 * Created by Konstantin on 15.09.2015.
 */
public interface InsulationMaterialDao {

    InsulationMaterial save(InsulationMaterial insulationMaterial);

    //false if not found
    boolean delete(int id);

    //null if not found
    InsulationMaterial get(int id);

    //null if not found
    InsulationMaterial getByName(String name);

    //empty list if not found
    List<InsulationMaterial> getAll();

}

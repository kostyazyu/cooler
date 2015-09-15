package com.kostyazyu.cooler.service;

import com.kostyazyu.cooler.model.room.InsulationMaterial;
import com.kostyazyu.cooler.util.NotFoundException;

import java.util.List;

public interface InsulationMaterialService {

    InsulationMaterial save(InsulationMaterial insulationMaterial);

    boolean delete(int id) throws NotFoundException;

    InsulationMaterial get(int id)throws NotFoundException;

    InsulationMaterial getByName(String name) throws NotFoundException;

    List<InsulationMaterial> getAll();

    void update(InsulationMaterial material) throws NotFoundException;

}

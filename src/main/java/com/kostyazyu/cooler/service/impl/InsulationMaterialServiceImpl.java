package com.kostyazyu.cooler.service.impl;

import com.kostyazyu.cooler.model.room.InsulationMaterial;
import com.kostyazyu.cooler.service.InsulationMaterialService;
import com.kostyazyu.cooler.util.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsulationMaterialServiceImpl implements InsulationMaterialService {

    //TODO realization after implementation of JPA DAOs

    @Override
    public InsulationMaterial save(InsulationMaterial insulationMaterial) {
        return null;
    }

    @Override
    public boolean delete(int id) throws NotFoundException {
        return false;
    }

    @Override
    public InsulationMaterial get(int id) throws NotFoundException {
        return null;
    }

    @Override
    public InsulationMaterial getByName(String name) throws NotFoundException {
        return null;
    }

    @Override
    public List<InsulationMaterial> getAll() {
        return null;
    }

    @Override
    public void update(InsulationMaterial material) throws NotFoundException {

    }
}

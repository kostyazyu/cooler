package com.kostyazyu.cooler.service.impl;

import com.kostyazyu.cooler.dao.InsulationMaterialDao;
import com.kostyazyu.cooler.model.room.InsulationMaterial;
import com.kostyazyu.cooler.service.InsulationMaterialService;
import com.kostyazyu.cooler.util.NotFoundException;
import com.kostyazyu.cooler.util.exception.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsulationMaterialServiceImpl implements InsulationMaterialService {

    @Autowired
    InsulationMaterialDao materialDao;

    @Override
    public InsulationMaterial save(InsulationMaterial insulationMaterial) {
        return materialDao.save(insulationMaterial);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        ExceptionUtil.check(materialDao.delete(id), id);
    }

    @Override
    public InsulationMaterial get(int id) throws NotFoundException {
        return ExceptionUtil.check(materialDao.get(id), id);
    }

    @Override
    public InsulationMaterial getByName(String name) throws NotFoundException {
        return ExceptionUtil.check(materialDao.getByName(name), "name=" + name);
    }

    @Override
    public List<InsulationMaterial> getAll() {
        return materialDao.getAll();
    }

    @Override
    public void update(InsulationMaterial material) throws NotFoundException {
        ExceptionUtil.check(materialDao.save(material), material.getId());
    }
}

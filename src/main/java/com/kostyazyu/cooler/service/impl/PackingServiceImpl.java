package com.kostyazyu.cooler.service.impl;

import com.kostyazyu.cooler.dao.PackingDao;
import com.kostyazyu.cooler.model.product.Packing;
import com.kostyazyu.cooler.service.PackingService;
import com.kostyazyu.cooler.util.NotFoundException;
import com.kostyazyu.cooler.util.exception.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackingServiceImpl implements PackingService {

    @Autowired
    PackingDao packingDao;

    @Override
    public Packing save(Packing product) {
        return packingDao.save(product);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        ExceptionUtil.check(packingDao.delete(id), id);
    }

    @Override
    public Packing get(int id) throws NotFoundException {
        return ExceptionUtil.check(packingDao.get(id), id);
    }

    @Override
    public Packing getByName(String name) throws NotFoundException {
        return ExceptionUtil.check(packingDao.getByName(name), "name = " + name);
    }

    @Override
    public List<Packing> getAll() {
        return packingDao.getAll();
    }

    @Override
    public void update(Packing packing) throws NotFoundException {
        ExceptionUtil.check(packingDao.save(packing), packing.getId());
    }
}

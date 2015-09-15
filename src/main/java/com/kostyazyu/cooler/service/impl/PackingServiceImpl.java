package com.kostyazyu.cooler.service.impl;

import com.kostyazyu.cooler.model.product.Packing;
import com.kostyazyu.cooler.service.PackingService;
import com.kostyazyu.cooler.util.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackingServiceImpl implements PackingService {

    //TODO realization after implementation of JPA DAOs

    @Override
    public Packing save(Packing product) {
        return null;
    }

    @Override
    public boolean delete(int id) throws NotFoundException {
        return false;
    }

    @Override
    public Packing get(int id) throws NotFoundException {
        return null;
    }

    @Override
    public Packing getByName(String name) throws NotFoundException {
        return null;
    }

    @Override
    public List<Packing> getAll() {
        return null;
    }

    @Override
    public void update(Packing packing) throws NotFoundException {

    }
}

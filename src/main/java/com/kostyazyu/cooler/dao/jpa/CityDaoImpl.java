package com.kostyazyu.cooler.dao.jpa;

import com.kostyazyu.cooler.dao.CityDao;
import com.kostyazyu.cooler.model.other.City;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class CityDaoImpl implements CityDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public City save(City city) {
        if (city.isNew()) {
            em.persist(city);
        } else {
            em.merge(city);
        }
        return city;
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(City.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public City get(int id) {
        return em.find(City.class, id);
    }

    @Override
    public City getByName(String name) {
        return em.createNamedQuery(City.BY_NAME, City.class).setParameter("name", name).getSingleResult();
    }

    @Override
    public List<City> getAll() {
        return em.createNamedQuery(City.ALL_SORTED, City.class).getResultList();
    }
}

package com.kostyazyu.cooler.dao.jpa;

import com.kostyazyu.cooler.dao.PackingDao;
import com.kostyazyu.cooler.model.product.Packing;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class PackingDaoImpl implements PackingDao {

    @PersistenceContext
    EntityManager em;

    @Override
    @Transactional
    public Packing save(Packing product) {
        if (product.isNew()) {
            em.persist(product);
        } else {
            em.merge(product);
        }
        return product;
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(Packing.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Packing get(int id) {
        return em.find(Packing.class, id);
    }

    @Override
    public Packing getByName(String name) {
        TypedQuery<Packing> query = em.createNamedQuery(Packing.BY_NAME, Packing.class).setParameter("name", name);
        List<Packing> resultList = query.getResultList();
        if (resultList.isEmpty()) {
            return null;
        } else {
            return resultList.get(0);
        }
    }

    @Override
    public List<Packing> getAll() {
        return em.createNamedQuery(Packing.ALL_SORTED, Packing.class).getResultList();
    }
}

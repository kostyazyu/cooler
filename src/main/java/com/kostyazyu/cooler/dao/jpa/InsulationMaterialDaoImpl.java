package com.kostyazyu.cooler.dao.jpa;

import com.kostyazyu.cooler.dao.InsulationMaterialDao;
import com.kostyazyu.cooler.model.room.InsulationMaterial;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Konstantin Zyubin
 * on 07.10.2015.
 * Moscow, Reutov
 */
@Repository
@Transactional(readOnly = true)
public class InsulationMaterialDaoImpl implements InsulationMaterialDao {

    @PersistenceContext
    EntityManager em;

    @Override
    @Transactional
    public InsulationMaterial save(InsulationMaterial insulationMaterial) {
        if (insulationMaterial.isNew()) {
            em.persist(insulationMaterial);
        } else {
            em.merge(insulationMaterial);
        }
        return insulationMaterial;
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(InsulationMaterial.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public InsulationMaterial get(int id) {
        return em.find(InsulationMaterial.class, id);
    }

    @Override
    public InsulationMaterial getByName(String name) {
        TypedQuery<InsulationMaterial> query = em.createNamedQuery(InsulationMaterial.BY_NAME, InsulationMaterial.class).setParameter("name", name);
        List<InsulationMaterial> resultList = query.getResultList();
        if (resultList.isEmpty()) {
            return null;
        } else {
            return resultList.get(0);
        }
    }

    @Override
    public List<InsulationMaterial> getAll() {
        return em.createNamedQuery(InsulationMaterial.ALL_SORTED, InsulationMaterial.class).getResultList();
    }
}

package com.concretepage.dao.daoImpl;

import com.concretepage.dao.GoodDao;
import com.concretepage.entity.Good;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Admin on 5/5/2017.
 */
@Transactional
@Repository

public class GoodDaoImpl implements GoodDao {

    //@PersistenceContext
    EntityManager entityManager;

    public GoodDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void persist(Good good) {
        entityManager.getTransaction().begin();
        entityManager.persist(good);
        entityManager.getTransaction().commit();
    }

    public void update(Good good) {
        entityManager.getTransaction().begin();
        Good goodUpdate = findById(good.getGoodID());
        goodUpdate.setGoodName(good.getGoodName());
        goodUpdate.setGoodCategory(good.getGoodCategory());
        entityManager.flush();
        entityManager.getTransaction().commit();
    }

    public Good findById(int goodId) {
        return entityManager.find(Good.class, goodId);
    }

    public List<Good> findAll() {
        String hql = "FROM Good as good";
        return (List<Good>) entityManager.createQuery(hql).getResultList();
    }

    public boolean delete(Good good) {

        Good goodFromDB = findById(good.getGoodID());
        if (goodFromDB != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(goodFromDB);
            entityManager.getTransaction().commit();
            return true;
        } else {
            return false;
        }

    }

    public boolean deleteByID(int goodID) {
        Good goodFromDB = findById(goodID);
        if (goodFromDB != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(goodFromDB);
            entityManager.getTransaction().commit();
            return true;
        } else {
            return false;
        }
    }
}

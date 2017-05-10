package com.concretepage.dao.daoImpl;

import com.concretepage.dao.TenderDao;
import com.concretepage.entity.Good;
import com.concretepage.entity.Tender;
import com.concretepage.entity.TenderStatus;

import java.util.List;

/**
 * Created by Admin on 5/5/2017.
 */
public class TenderDaoImpl implements TenderDao {
    public void persist(Tender tender) {

    }

    public void update(Tender tender) {

    }

    public Tender findById(int tenderId) {
        //return entityManager.find(Good.class, goodId);
        return null;
    }

    public List<Tender> findByProposal(Tender tender) {
        return null;
    }

    public List<Tender> findByStatus(TenderStatus tenderStatus) {
        return null;
    }

    public List<Tender> findAll() {
        return null;
    }

    public void delete(Tender tender) {

    }
}

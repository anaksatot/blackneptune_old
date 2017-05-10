package com.concretepage.service.serviceImpl;

import java.util.List;
import com.concretepage.dao.GoodDao;
import com.concretepage.entity.Good;
import com.concretepage.service.GoodServices;


/**
 * Created by Admin on 5/5/2017.
 */
public class GoodServiceImpl implements GoodServices{
    private GoodDao goodDao;

    public GoodServiceImpl() {
    }

    public GoodServiceImpl(GoodDao goodDao) {
        this.goodDao = goodDao;
    }

    @Override
    public void persist(Good good) {
        System.out.println(good);
        System.out.println(goodDao);
        goodDao.persist(good);
    }

    @Override
    public void update(Good good) {

    }

    @Override
    public Good findById(int id) {
        return null;
    }

    @Override
    public List<Good> findAll() {
        return null;
    }

    @Override
    public void delete(Good good) {

    }
}

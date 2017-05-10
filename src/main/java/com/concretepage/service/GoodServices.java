package com.concretepage.service;
import com.concretepage.entity.Good;
import java.util.List;

/**
 * Created by Admin on 5/5/2017.
 */
public interface GoodServices {

    public void persist(Good good);

    public void update(Good good);

    public Good findById(int id);

    public List<Good> findAll();

    public void delete(Good good);
}

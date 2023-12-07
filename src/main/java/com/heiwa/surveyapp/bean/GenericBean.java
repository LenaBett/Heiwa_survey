package com.heiwa.surveyapp.bean;


import com.heiwa.surveyapp.dao.GenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class GenericBean<T> implements GenericBeanI<T> {
    @PersistenceContext
    private EntityManager em;

    private final GenericDao<T> genericDao = new GenericDao<T>();


    @Override
    public List<T> list(Class<?> entity) {
        genericDao.setEm(em);
        return genericDao.list(entity);
    }


    @Override
    public boolean addOrUpdate(T entity) {
        genericDao.setEm(em);
        genericDao.addOrUpdate(entity);

        return false;
    }

    @Override
    public void delete(T entity) {
    }

    public GenericDao<T> getDao() {
        genericDao.setEm(em);
        return (GenericDao<T>) genericDao;
    }
}

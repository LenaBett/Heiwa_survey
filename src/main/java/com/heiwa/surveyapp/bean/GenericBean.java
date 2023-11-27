package com.heiwa.surveyapp.bean;

import com.heiwa.database.MysqlDatabase;
import com.heiwa.surveyapp.dao.GenericDao;

import javax.ejb.EJB;
import java.util.List;

public abstract class GenericBean<T> implements GenericBeanI<T> {
    @EJB
    MysqlDatabase database;

    private final GenericDao<T> genericDao = new GenericDao<T>();

    @Override
    public List<T> list(Class<?> entity) {
        genericDao.setDatabase(database);
        return genericDao.list(entity);
    }


    @Override
    public boolean addOrUpdate(T entity) {
        genericDao.setDatabase(database);
        genericDao.addOrUpdate(entity);

        return false;
    }

    @Override
    public void delete(T entity) {
    }

    public GenericDao<T> getDao() {
        genericDao.setDatabase(database);
        return (GenericDao<T>) genericDao;
    }
}

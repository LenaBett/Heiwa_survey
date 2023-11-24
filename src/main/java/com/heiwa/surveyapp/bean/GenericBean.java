package com.heiwa.surveyapp.bean;

import com.heiwa.surveyapp.dao.GenericDao;
import com.heiwa.surveyapp.model.Survey;

import java.util.List;

public abstract class GenericBean<T> implements GenericBeanI<T> {

    private final GenericDao<T> genericDao = new GenericDao<T>();

    @Override
    public List<T> list(Class<?> entity) {
        return genericDao.list(entity);
    }


    @Override
    public void addOrUpdate(T entity) {
        genericDao.addOrUpdate(entity);

    }

    @Override
    public void delete(T entity) {
    }

    public GenericDao<T> getDao() {
        return (GenericDao<T>) genericDao;
    }
}

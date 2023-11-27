package com.heiwa.surveyapp.dao;

import java.util.List;
import com.heiwa.database.MysqlDatabase;

import javax.ejb.EJB;

public class GenericDao<T> implements GenericDaoI<T> {
    @EJB
    MysqlDatabase database;
    @SuppressWarnings({"unchecked"})
    @Override
    public List<T> list(Class<?> entity) {
        return (List<T>) database.fetch(entity);

    }

    @Override
    public void addOrUpdate(T entity) {
        database.saveOrUpdate(entity);

    }

    @Override
    public void delete(T entity) {

    }

    public MysqlDatabase getDatabase() {
        return database;
    }

    public void setDatabase(MysqlDatabase database) {
        this.database = database;
    }
}

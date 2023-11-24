package com.heiwa.surveyapp.dao;

import java.util.List;
import com.heiwa.database.MysqlDatabase;

public class GenericDao<T> implements GenericDaoI<T> {

    @SuppressWarnings({"unchecked"})
    @Override
    public List<T> list(Class<?> entity) {
        return (List<T>) MysqlDatabase.select(entity);

    }

    @Override
    public void addOrUpdate(T entity) {
        MysqlDatabase.saveOrUpdate(entity);

    }

    @Override
    public void delete(T entity) {

    }
}

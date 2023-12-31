package com.heiwa.surveyapp.dao;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public interface GenericDaoI <T> extends Serializable {

    List<T> list(Class<?> entity);

    T addOrUpdate(T entity);

    void delete(T entity);

    EntityManager getEm();
    void SetEm(EntityManager em);

}

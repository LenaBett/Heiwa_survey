package com.heiwa.surveyapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GenericDao<T> implements GenericDaoI<T> {
    @PersistenceContext
    private EntityManager em;
    @SuppressWarnings({"unchecked"})
    @Override
    public List<T> list(Class<?> entity) {
        String jpql  = "FROM " + entity.getClass().getSimpleName() + " e";

        List<T> results = (List<T>) em.createQuery(jpql, entity.getClass()).getResultList();

        return results;

    }

    @Override
     public T addOrUpdate(T entity) {
        return em.merge(entity);

    }

    @Override
    public void delete(T entity) {

    }

    public EntityManager getEm() {
        return em;
    }

    @Override
    public void SetEm(EntityManager em) {

    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
}

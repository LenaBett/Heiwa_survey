package com.heiwa.surveyapp.bean;

import java.io.Serializable;
import java.util.List;

public interface GenericBeanI<T> extends Serializable {

    List<T> list(Class<?> entity);

    T addOrUpdate(T entity);

    void delete(T entity);
}

package com.heiwa.surveyapp.bean;

import com.heiwa.surveyapp.model.Result;
import com.heiwa.surveyapp.model.Survey;

import java.io.Serializable;
import java.util.List;

public interface GenericBeanI<T> extends Serializable {

    List<T> list(Class<?> entity);

    void addOrUpdate(T entity);

    void delete(T entity);
}

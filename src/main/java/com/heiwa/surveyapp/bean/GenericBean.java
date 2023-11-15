package com.heiwa.surveyapp.bean;

import com.heiwa.database.Database;
import com.heiwa.surveyapp.model.Result;
import com.heiwa.surveyapp.model.Survey;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public class GenericBean<T> implements GenericBeanI<T> {
    @SuppressWarnings({"unchecked","rawtypes"})
    @Override
    public List<T> list() {
        Class clazz = ((Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]);

        System.out.println("List class " + clazz);
        if (clazz.equals(Survey.class))
            return (List<T>) Database.getDbInstance().getSurveys();


//        if (clazz.equals(Customer.class))
//            return (List<T>) Database.getDbInstance().getCustomers();

        return  new ArrayList<>();
    }

    @Override
    public T addOrUpdateSurvey(T entity) {
        Database database = Database.getDbInstance();

        Class clazz = entity.getClass();
        System.out.println(clazz.getName());

        if (entity instanceof Survey)
            database.getSurveys().add((Survey) entity);

//        else if (entity instanceof Result)
//            database.get().add((Customer) entity);

        return entity;
    }

    @Override
    public void deleteSurvey(T entity) {

    }
}

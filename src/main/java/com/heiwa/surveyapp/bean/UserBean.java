package com.heiwa.surveyapp.bean;

import com.heiwa.surveyapp.model.Survey;
import com.heiwa.surveyapp.model.User;

import java.util.List;

public class UserBean extends GenericBean<User> implements UserBeanI {

    @Override
    public boolean register(User user) {

        if (!user.getPassword().equals(user.getConfirmPassword()))
            throw new RuntimeException("Password & confirm password do not match");

        //1. check if username already exist
        //2. hash password
        //3. initiate event to send email ...Observer design pattern

        getDao().addOrUpdate(user);

        return false;
    }

    @Override
    public boolean unregister(User user) {
        return true;
    }

}

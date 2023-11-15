package com.heiwa.surveyapp.bean;

import com.heiwa.surveyapp.model.User;

public interface UserBeanI {


    boolean register(User user);

    boolean unregister(User user);
}

package com.heiwa.surveyapp.bean;

import com.heiwa.surveyapp.model.User;

public interface AuthBeanI {

    User authenticate(User loginUser);
}

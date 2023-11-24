package com.heiwa.surveyapp.bean;

import com.heiwa.surveyapp.model.User;

import java.sql.SQLException;

public interface AuthBeanI {

    User authenticate(User loginUser) throws SQLException;
}

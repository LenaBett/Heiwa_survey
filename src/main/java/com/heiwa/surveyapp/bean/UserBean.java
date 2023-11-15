package com.heiwa.surveyapp.bean;

import com.heiwa.database.Database;
import com.heiwa.surveyapp.model.User;

import java.io.Serializable;

public class UserBean implements UserBeanI, Serializable {

    Database database = Database.getDbInstance();

    @Override
    public boolean register(User user) {

        if (user.getPassword().equals(user.getConfirmPassword())) {
            database.getUsers().add(new User(100L, user.getUsername(), user.getPassword()));

            return true;
        }

        return false;
    }

    @Override
    public boolean unregister(User user) {
        return true;
    }

}

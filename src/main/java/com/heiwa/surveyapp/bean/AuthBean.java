package com.heiwa.surveyapp.bean;

import com.heiwa.database.Database;
import com.heiwa.surveyapp.model.User;

import java.io.Serializable;

public class AuthBean implements AuthBeanI, Serializable {

    Database database = Database.getDbInstance();

    public User authenticate(User loginUser){
        User userDetails = null;

        for (User user : database.getUsers()) {
            if (loginUser.getUsername().equals(user.getUsername())
                    && loginUser.getPassword().equals(user.getPassword())) {
                userDetails = user;

                break;

            }
        }

        return userDetails;
    }
}

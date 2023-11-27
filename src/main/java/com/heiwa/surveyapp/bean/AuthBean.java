package com.heiwa.surveyapp.bean;

import com.heiwa.database.Database;
import com.heiwa.database.MysqlDatabase;
import com.heiwa.surveyapp.model.User;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Stateless
public class AuthBean implements AuthBeanI, Serializable {
    @EJB
    MysqlDatabase database;

    public User authenticate(User loginUser){

        try {
            loginUser.setPassword(loginUser.getPassword());
        } catch (Exception ex){
            throw new RuntimeException(ex.getMessage());
        }

        List<User> users = database.fetch(loginUser);

        if (users.isEmpty() || users.get(0) == null)
            throw new RuntimeException("Invalid user!!");

        return users.get(0);
    }
}

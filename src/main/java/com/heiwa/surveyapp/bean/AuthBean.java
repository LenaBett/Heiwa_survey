package com.heiwa.surveyapp.bean;

import com.heiwa.database.Database;
import com.heiwa.database.MysqlDatabase;
import com.heiwa.surveyapp.model.User;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthBean implements AuthBeanI, Serializable {

    public User authenticate(User loginUser) throws SQLException {

        PreparedStatement sqlStmt = MysqlDatabase.getInstance().getConnection()
                .prepareStatement("select id,username from users where username=? and password=? limit 1");
        sqlStmt.setString(1, loginUser.getUsername());
        sqlStmt.setString(2, loginUser.getPassword());

        ResultSet result = sqlStmt.executeQuery();

        User user = new User();

        while (result.next()){
            user.setId(result.getLong("id"));
            user.setUsername(result.getString("username"));
        }

        return user;
    }
}

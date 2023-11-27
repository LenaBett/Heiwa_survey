package com.heiwa.surveyapp.model;

import com.heiwa.database.helper.DbTable;
import com.heiwa.database.helper.DbTableColumn;

import java.io.Serializable;

@DbTable(name = "users")
public class User extends BaseEntity {
    @DbTableColumn(name = "username")
    private String username;
    @DbTableColumn(name = "password")
    private String password;

    private String confirmPassword;

    public User(){}

    public User(Long id, String username, String password) {
        setId(id);
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}

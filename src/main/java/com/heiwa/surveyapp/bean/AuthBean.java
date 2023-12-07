package com.heiwa.surveyapp.bean;

import com.heiwa.surveyapp.model.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Stateless
public class AuthBean implements AuthBeanI, Serializable {
    @PersistenceContext
    EntityManager em;

    public User authenticate(User loginUser){

        try {
            loginUser.setPassword(loginUser.getPassword());
        } catch (Exception ex){
            throw new RuntimeException(ex.getMessage());
        }

        List<User> users = em.createQuery("FROM User u WHERE u.password=:password AND u.username=:username", User.class)
                .setParameter("password", loginUser.getPassword())
                .setParameter("username", loginUser.getUsername())
                .getResultList();

        if (users.isEmpty() || users.get(0) == null)
            throw new RuntimeException("Invalid user!!");

        return users.get(0);
    }
}

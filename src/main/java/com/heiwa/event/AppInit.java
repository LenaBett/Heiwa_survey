package com.heiwa.event;

import com.heiwa.database.Database;
import com.heiwa.surveyapp.model.Survey;
import com.heiwa.surveyapp.model.User;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppInit implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("*************** Initializing database *************");

        Database database = Database.getDbInstance();
        database.getUsers().add(new User(0L, "Lena", "12345"));
        database.getUsers().add(new User(1L, "Bett", "12345"));

        database.getSurveys().add(new Survey("Survey1","This is a sample survey"));
        database.getSurveys().add(new Survey("Survey2","This is a sample survey"));
        database.getSurveys().add(new Survey("Survey3","This is a sample survey"));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Application is undeployed or destroyed");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
}

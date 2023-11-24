package com.heiwa.event;

import com.heiwa.database.Database;
import com.heiwa.database.MysqlDatabase;
import com.heiwa.surveyapp.model.Survey;
import com.heiwa.surveyapp.model.User;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.SQLException;

public class AppInit implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        MysqlDatabase.updateSchema();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

        try {
            MysqlDatabase database = MysqlDatabase.getInstance();

            if (database.getConnection() != null){
                database.getConnection().close();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
}

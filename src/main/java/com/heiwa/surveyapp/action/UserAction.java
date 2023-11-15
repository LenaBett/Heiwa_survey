package com.heiwa.surveyapp.action;

import com.heiwa.database.Database;
import com.heiwa.surveyapp.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserAction extends BaseAction {


    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Database database = Database.getDbInstance();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        if (password.equals(confirmPassword))
            database.getUsers().add(new User(10L, username, password));

        resp.sendRedirect("./");
    }
}
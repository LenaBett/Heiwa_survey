package com.heiwa.surveyapp.action;

import com.heiwa.database.Database;
import com.heiwa.surveyapp.bean.UserBean;
import com.heiwa.surveyapp.bean.UserBeanI;
import com.heiwa.surveyapp.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserAction extends BaseAction {

    UserBeanI userBean = new UserBean();
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        userBean.register(serializeForm(User.class, req.getParameterMap()));
        resp.sendRedirect("./");
    }
}
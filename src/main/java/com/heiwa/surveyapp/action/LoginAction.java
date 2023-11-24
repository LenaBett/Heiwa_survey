package com.heiwa.surveyapp.action;

import com.heiwa.surveyapp.bean.AuthBean;
import com.heiwa.surveyapp.bean.AuthBeanI;
import com.heiwa.surveyapp.model.User;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;

@WebServlet(urlPatterns = "/login")
public class LoginAction extends BaseAction{
    AuthBeanI authBean = new AuthBean();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();

        if (StringUtils.isNotBlank((String) httpSession.getAttribute("loggedInId")))
            resp.sendRedirect("./home");
        else
            resp.sendRedirect("./");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        User loginUser  = serializeForm(User.class, req.getParameterMap());

        User userDetails = null;
        try {
            userDetails = authBean.authenticate(loginUser);

            if (userDetails != null) {
                HttpSession httpSession = req.getSession(true);

                httpSession.setAttribute("loggedInId", new Date().getTime() + "");
                httpSession.setAttribute("username", loginUser.getUsername());

                resp.sendRedirect("./home");

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        PrintWriter print = resp.getWriter();
        print.write("<html><body>Invalid login details <a href=\".\"> Login again </a></body></html>");

    }
}

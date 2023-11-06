package com.heiwa.auth;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();

        if (StringUtils.isNotBlank((String) httpSession.getAttribute("loggedInId")))
            resp.sendRedirect("./home");
        else
            resp.sendRedirect("./");

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession(true);
        httpSession.setAttribute("loggedInId", new Date().getTime() + "");

        ServletContext ctx = getServletContext();

        String username = req. getParameter("username");
        String password = req.getParameter("password");

        if (username.equals("Lena")) {

            httpSession.setAttribute("username", username);

            resp.sendRedirect("./home");

        } else {
            PrintWriter print = resp.getWriter();
            print.write("<html><body>Invalid login details <a href=\".\"> Login again </a></body></html>");
        }

    }
}

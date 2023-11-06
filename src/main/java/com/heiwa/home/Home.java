package com.heiwa.home;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import com.heiwa.surveyapp.model.view.html.HeiwaPage;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/home")
public class Home extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();

        if (StringUtils.isNotBlank((String) httpSession.getAttribute("loggedInId"))) {


            new HeiwaPage().renderHtml(req, resp, 0,
                    "<h2>Home Page</h2>");

        } else
            resp.sendRedirect("./");
    }


}

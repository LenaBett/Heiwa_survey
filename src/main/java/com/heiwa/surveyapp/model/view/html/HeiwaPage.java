package com.heiwa.surveyapp.model.view.html;

import com.heiwa.surveyapp.model.view.css.HeiwaCss;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

public class HeiwaPage implements Serializable {
    public void renderHtml(HttpServletRequest req, HttpServletResponse resp,
                           int activeMenu, String content) throws IOException {

        HttpSession session = req.getSession();

        ServletContext ctx = req.getServletContext();

        PrintWriter print = resp.getWriter();

        print.write("<DOCTYPE html>" +


                "<body>" +
                    "<p THis is Heiwa /p>" +
                "</body>" +
                "</html>");
    }


}

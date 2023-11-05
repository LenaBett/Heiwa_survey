package com.heiwa.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Heiwa2")
public class Heiwa2 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, IOException {

        String name = req.getParameter("Name");
        String str1 = new String(name);

        PrintWriter print = resp.getWriter();
        print.print("I can do this" + name + "You gaht this");



    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        PrintWriter print = resp.getWriter();
        print.print("This is the final servlet implementation, can only be accessed using get method!!");


    }
}

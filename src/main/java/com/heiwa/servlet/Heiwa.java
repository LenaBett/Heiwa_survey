package com.heiwa.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Heiwa implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Heiwa means peace");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter print = servletResponse.getWriter();
        print.print("<b>Heiwa Survey<b/>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("shutting down the Heiwa class");

    }
}

package com.heiwa.surveyapp.action;

import com.heiwa.surveyapp.bean.SurveyBean;
import com.heiwa.surveyapp.bean.SurveyBeanI;
import com.heiwa.surveyapp.model.Survey;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/createSurvey")
public class CreateSurveyAction extends BaseAction{
    @EJB
    SurveyBeanI surveyBean;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        renderPage(req, resp, 1,  Survey.class, surveyBean.list(Survey.class));
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        surveyBean.addOrUpdate(serializeForm(Survey.class, req.getParameterMap()));

        resp.sendRedirect("./createSurvey");

    }
}

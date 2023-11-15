package com.heiwa.surveyapp.action;

import com.heiwa.surveyapp.bean.SurveyBean;
import com.heiwa.surveyapp.bean.SurveyBeanI;
import com.heiwa.surveyapp.model.Survey;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/createSurvey")
public class CreateSurveyAction extends BaseAction{

    private final SurveyBeanI surveyBean = new SurveyBean();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        renderPage(req, resp, 1,  Survey.class, surveyBean.list());
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        surveyBean.addOrUpdateSurvey(serializeForm(Survey.class, req.getParameterMap()));

        resp.sendRedirect("./createSurvey");

    }
}

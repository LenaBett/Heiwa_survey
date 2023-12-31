package com.heiwa.surveyapp.action;

import com.heiwa.surveyapp.bean.SurveyBean;
import com.heiwa.surveyapp.bean.SurveyBeanI;
import com.heiwa.surveyapp.model.Survey;
import com.heiwa.surveyapp.view.helper.Title;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/takeSurvey")
@Title(pageTitle = "Take Survey page")
public class TakeSurveyAction extends BaseAction {

    SurveyBeanI surveyBean = new SurveyBean();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        renderPage(req, resp, 2, Survey.class, new ArrayList<Survey>());

    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        surveyBean.addOrUpdate(serializeForm(Survey.class, req.getParameterMap()));

        resp.sendRedirect("./takeSurvey");
    }
}

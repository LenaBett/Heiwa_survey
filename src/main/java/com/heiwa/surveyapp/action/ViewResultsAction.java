package com.heiwa.surveyapp.action;

import com.heiwa.surveyapp.bean.SurveyBean;
import com.heiwa.surveyapp.bean.SurveyBeanI;
import com.heiwa.surveyapp.model.Result;
import com.heiwa.surveyapp.model.Survey;
import com.heiwa.surveyapp.view.helper.Title;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/results")
@Title(pageTitle = "Results page")
public class ViewResultsAction extends BaseAction {

    SurveyBeanI surveyBean = new SurveyBean();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        renderPage(req, resp, 3, Result.class, new ArrayList<Result>());

    }
}

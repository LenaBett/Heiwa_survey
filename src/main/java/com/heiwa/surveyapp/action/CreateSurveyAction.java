package com.heiwa.surveyapp.action;

import com.heiwa.surveyapp.bean.QuestionBean;
import com.heiwa.surveyapp.bean.QuestionBeanI;
import com.heiwa.surveyapp.bean.SurveyBean;
import com.heiwa.surveyapp.bean.SurveyBeanI;
import com.heiwa.surveyapp.model.Question;
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

    @EJB
    QuestionBeanI questionBean;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
//        renderPage(req, resp, 1,  Survey.class, surveyBean.list(Survey.class));
        resp.sendRedirect("./createSurvey.jsp");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {


        Survey survey = serializeForm(Survey.class, req.getParameterMap());

        survey.setTitle(req.getParameter("title"));
        survey.setDescription(req.getParameter("description"));
        surveyBean.addOrUpdate(survey);

        Question question = new Question();
        question.setQuestionText(req.getParameter("questionText"));
        question.setAnswerType(req.getParameter("answerType"));

        System.out.println("question = " + question);
        questionBean.addOrUpdate(question);


        resp.sendRedirect("./createSurvey");

    }
}

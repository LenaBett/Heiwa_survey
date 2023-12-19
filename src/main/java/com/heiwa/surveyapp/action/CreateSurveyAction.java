package com.heiwa.surveyapp.action;

import com.heiwa.surveyapp.bean.QuestionBeanI;
import com.heiwa.surveyapp.bean.SurveyBeanI;
import com.heiwa.surveyapp.model.Question;
import com.heiwa.surveyapp.model.Survey;
import com.heiwa.surveyapp.utility.SurveyCodeGenerator;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/createSurvey")
public class CreateSurveyAction extends BaseAction{
    @EJB
    SurveyBeanI surveyBean;

    @EJB
    QuestionBeanI questionBean;

    @Inject
    private SurveyCodeGenerator surveyCodeGenerator;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
//        renderPage(req, resp, 1,  Survey.class, surveyBean.list(Survey.class));
        resp.sendRedirect("./createSurvey.jsp");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {


        Survey survey = serializeForm(Survey.class, req.getParameterMap());

        survey.setSurveyCode(surveyCodeGenerator.generateSurveyCode());
        survey.setTitle(req.getParameter("title"));
        survey.setDescription(req.getParameter("description"));

        boolean loop = true;
        var firstField = 4;
        List<String> questions = new ArrayList<>();
        while (loop) {
            if (req.getParameter("field"+firstField) != null) {
                questions.add(req.getParameter("field"+firstField));
                firstField++;
            } else {
                loop = false;
            }
        }

        Survey savedSurvey = surveyBean.addOrUpdate(survey);
        Question question = new Question();
        question.setQuestionText(req.getParameter("questionText"));
        question.setSurvey(savedSurvey);
        questionBean.addOrUpdate(question);

        for (var questionText: questions) {
            Question question1 = new Question();
            question1.setQuestionText(questionText);
            question1.setSurvey(savedSurvey);
            questionBean.addOrUpdate(question1);
        }

        resp.sendRedirect("./createSurvey");

    }
}

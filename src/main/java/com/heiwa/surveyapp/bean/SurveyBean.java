package com.heiwa.surveyapp.bean;

import com.heiwa.database.Database;
import com.heiwa.surveyapp.model.Result;
import com.heiwa.surveyapp.model.Survey;

import java.util.List;

public class SurveyBean implements SurveyBeanI{

    public SurveyBean(){}

    @Override
    public List<Survey> list() {
        return Database.getDbInstance().getSurveys();
    }

    @Override
    public Survey addOrUpdateSurvey(Survey survey) {
        Database database = Database.getDbInstance();

        database.getSurveys().add(survey);

        return survey;
    }

    @Override
    public Result displayResult(Result result) {
        return null;
    }

    @Override
    public void deleteSurvey(Survey survey) {

    }
}

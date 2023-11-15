package com.heiwa.surveyapp.bean;

import com.heiwa.surveyapp.model.Result;
import com.heiwa.surveyapp.model.Survey;

import java.util.List;

public interface SurveyBeanI {

    List<Survey> list();

    Survey addOrUpdateSurvey(Survey survey);

    Result displayResult(Result result);

    void deleteSurvey(Survey survey);

}

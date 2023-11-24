package com.heiwa.surveyapp.bean;

import com.heiwa.surveyapp.model.Survey;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
@Remote
public class SurveyBean extends GenericBean<Survey> implements SurveyBeanI {


    @Override
    public void addOrUpdate(Survey survey) {
        if (survey.getTitle() == null)
            throw new RuntimeException("Invalid account type");

        getDao().addOrUpdate(survey);
    }
}

package com.heiwa.surveyapp.bean;

import com.heiwa.surveyapp.model.Survey;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
public class SurveyBean extends GenericBean<Survey> implements SurveyBeanI {


    @Override
    public boolean addOrUpdate(Survey survey) {
        // Validate the survey before adding or updating
        validateSurvey(survey);

        // Add or update the survey
        try {
            getDao().addOrUpdate(survey);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Operation failed
        }
    }

    private void validateSurvey(Survey survey) {
        if (survey.getTitle() == null) {
            throw new IllegalArgumentException("Invalid survey title");
        }
        // Add more validation logic as needed
    }
}

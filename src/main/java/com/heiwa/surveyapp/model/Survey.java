package com.heiwa.surveyapp.model;

import java.io.Serializable;
import java.util.List;

public class Survey implements Serializable {

    private String title;
    private String description;

    private List<Question> survey;

    public Survey(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //public List<Question> getSurvey() {
    //    return survey;
    //}

    // public void setSurvey(List<Question> survey) {
    //    this.survey = survey;
    //}
}

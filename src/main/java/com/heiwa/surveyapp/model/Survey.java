package com.heiwa.surveyapp.model;

import com.heiwa.surveyapp.view.helper.*;

import java.io.Serializable;
import java.util.List;

@Title(pageTitle = "Survey Page")
@HtmlForm(label = "Survey", addUrl = "./createSurvey?action=add", url = "./createSurvey")
@HtmlCard(addUrl = "./createSurvey?submit", viewUrl = "./takeSurvey")

public class Survey {
    @HtmlFormField(label= "Survey Title" , required = true )
    @HtmlCardContent(title = "Survey title")
    private String title;

    @HtmlFormField(label= "Survey Description", required = true )
    @HtmlCardContent(title = "Description")
    private String description;

    @HtmlFormField(label= "Question", required = true )
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

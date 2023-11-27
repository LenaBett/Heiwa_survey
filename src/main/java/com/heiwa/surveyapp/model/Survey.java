package com.heiwa.surveyapp.model;

import com.heiwa.database.helper.DbTable;
import com.heiwa.database.helper.DbTableColumn;
import com.heiwa.surveyapp.view.helper.*;

import java.util.List;

@Title(pageTitle = "Survey Page")
@HtmlForm(label = "Survey", addUrl = "./createSurvey?action=add", url = "./createSurvey")
@HtmlCard(addUrl = "./createSurvey?submit", viewUrl = "./takeSurvey")
@DbTable(name = "survey")

public class Survey extends BaseEntity{
    @HtmlFormField(label= "Survey Title" , required = true )
    @HtmlCardContent(title = "Survey title")
    @DbTableColumn(name = "title")
    private String title;

    @HtmlFormField(label= "Survey Description", required = true )
    @HtmlCardContent(title = "Description")
    @DbTableColumn(name = "desciption")
    private String description;

    @HtmlFormField(label= "Question", required = true )
    @DbTableColumn(name = "questions")
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

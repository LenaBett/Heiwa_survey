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
    @DbTableColumn(name = "Title")
    private String title;

    @HtmlFormField(label= "Survey Description", required = true )
    @HtmlCardContent(title= "Description")
    @DbTableColumn(name = "Description")
    private String description;

    @HtmlFormField(label= "Question", required = true )
    private List<Question> questions;

    public Survey() {
    }

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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}

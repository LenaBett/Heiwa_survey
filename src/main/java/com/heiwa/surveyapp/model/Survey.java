package com.heiwa.surveyapp.model;
import com.heiwa.surveyapp.view.helper.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "survey")
@HtmlForm(label = "Survey", addUrl = "./createSurvey?action=add", url = "./createSurvey")
@HtmlCard(addUrl = "./createSurvey?submit", viewUrl = "./takeSurvey")

public class Survey extends BaseEntity{
    @HtmlFormField(label= "Survey Title" , required = true )
    @HtmlCardContent(title = "Survey title")
    @Column(name = "title")
    private String title;

    @HtmlFormField(label= "Survey Description", required = true )
    @HtmlCardContent(title= "Description")
    @Column(name = "description")
    private String description;


    @HtmlFormField(label= "Question", required = true )
    @OneToMany(mappedBy = "survey", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
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

package com.heiwa.surveyapp.model;

import com.heiwa.surveyapp.view.helper.HtmlCard;
import com.heiwa.surveyapp.view.helper.HtmlCardContent;
import com.heiwa.surveyapp.view.helper.Title;

import java.io.Serializable;

@Title(pageTitle = "Home Page")
@HtmlCard(addUrl= "./createSurvey? action= submit", viewUrl= "./home")
public class HomePageContent implements Serializable {
    @HtmlCardContent(title = "Get Valuable Feedback")
    private String title;
    @HtmlCardContent(title = "Get Valuable Feedback")
    private String description;

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
}
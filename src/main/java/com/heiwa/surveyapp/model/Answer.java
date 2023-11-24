package com.heiwa.surveyapp.model;

import com.heiwa.surveyapp.view.helper.Title;

@Title(pageTitle = "Answer Page")
public class Answer {

    private String answerText;

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }
}

package com.heiwa.surveyapp.model;

import com.heiwa.surveyapp.view.helper.Title;

import java.util.List;

@Title(pageTitle = "Questions Page")
public class Question {
    private String question;
    private List<Answer> answer;

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}

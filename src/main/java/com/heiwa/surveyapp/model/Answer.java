package com.heiwa.surveyapp.model;

import com.heiwa.surveyapp.view.helper.Title;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Answer")
@Title(pageTitle = "Answer Page")
public class Answer extends BaseEntity{

    @Column(name = "answer")

    private String answerText;

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }
}

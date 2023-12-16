package com.heiwa.surveyapp.model;

import com.heiwa.surveyapp.view.helper.Title;

import javax.persistence.*;

@Entity
@Table(name = "answer")
@Title(pageTitle = "Answer Page")
public class Answer extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User respondent;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @Column(name = "answer_text")
    private String answerText;

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public User getRespondent() {
        return respondent;
    }

    public void setRespondent(User respondent) {
        this.respondent = respondent;
    }
}

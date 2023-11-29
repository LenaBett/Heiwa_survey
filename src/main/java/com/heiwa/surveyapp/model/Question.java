package com.heiwa.surveyapp.model;

import com.heiwa.database.helper.DbTable;
import com.heiwa.database.helper.DbTableColumn;
import com.heiwa.surveyapp.view.helper.Title;

import java.util.List;

@Title(pageTitle = "Questions Page")
@DbTable(name = "questions")
public class Question extends BaseEntity {
    @DbTableColumn(name = "Question_Text")
    private String questionText;

    @DbTableColumn(name = "Answer_Type")
    private String answerType;
    @DbTableColumn(name = "Answer")
    private String answer;

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String question) {
        this.questionText = questionText;
    }

}

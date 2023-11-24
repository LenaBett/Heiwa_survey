package com.heiwa.surveyapp.model;

import com.heiwa.surveyapp.view.helper.Title;

import java.util.List;

@Title(pageTitle = "Result Page")
public class Result {

    private String respondent;
    private String question;
    private List<Answer> answers;
}

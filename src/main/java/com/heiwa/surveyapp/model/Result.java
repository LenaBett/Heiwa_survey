package com.heiwa.surveyapp.model;

import com.heiwa.database.helper.DbTable;
import com.heiwa.database.helper.DbTableColumn;
import com.heiwa.surveyapp.view.helper.Title;

import java.util.List;

@Title(pageTitle = "Result Page")
@DbTable(name = "results")
public class Result extends BaseEntity{

    @DbTableColumn(name = "respondent")
    private String respondent;
    @DbTableColumn(name = "question")
    private String question;
    @DbTableColumn(name = "answer")
    private List<Answer> answers;
}

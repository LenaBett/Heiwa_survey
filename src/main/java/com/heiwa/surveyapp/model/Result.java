package com.heiwa.surveyapp.model;

import com.heiwa.database.helper.DbTable;
import com.heiwa.database.helper.DbTableColumn;
import com.heiwa.surveyapp.view.helper.Title;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Result")
public class Result extends BaseEntity{

    @Column(name = "Respondent")
    private String respondent;

    @Column(name = "Survey")
    private String survey;
}

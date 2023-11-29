package com.heiwa.surveyapp.bean;

import com.heiwa.surveyapp.model.Survey;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class SurveyBean extends GenericBean<Survey> implements SurveyBeanI {

}

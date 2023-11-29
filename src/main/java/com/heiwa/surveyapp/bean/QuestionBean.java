package com.heiwa.surveyapp.bean;

import com.heiwa.surveyapp.model.Question;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class QuestionBean extends GenericBean<Question> implements QuestionBeanI {

}

package com.heiwa.surveyapp.rest.api;


import com.heiwa.surveyapp.bean.QuestionBeanI;
import com.heiwa.surveyapp.bean.SurveyBeanI;
import com.heiwa.surveyapp.model.Question;
import com.heiwa.surveyapp.model.Survey;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/question")
public class QuestionRestApi extends BaseRestApi{

    @EJB
    private QuestionBeanI questionBean;

    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addOrUpdate(Question question) {

        question = questionBean.addOrUpdate(question);
        return respond();
    }

//    @Path("/list")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response list(){
//        return respond(questionBean.list(new Question()));
//    }
}

package com.heiwa.surveyapp.rest.api;

import com.heiwa.surveyapp.bean.SurveyBeanI;
import com.heiwa.surveyapp.model.Survey;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/survey")
public class SurveyRestApi extends BaseRestApi{
    @EJB
    private SurveyBeanI surveyBean;

    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addOrUpdate(Survey survey) {

        survey=surveyBean.addOrUpdate(survey);
        return respond();

    }

}

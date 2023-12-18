package com.heiwa.surveyapp.utility;

import javax.enterprise.inject.Default;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class SurveyCodeGenerator {
    public String generateSurveyCode(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

        return "HS" + dateFormat.format(new Date()) + "-" + ThreadLocalRandom.current().nextInt(0, 1000 + 1);
    }
}

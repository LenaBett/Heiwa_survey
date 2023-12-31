package com.heiwa.surveyapp.view.helper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface HtmlCard {

    String addUrl();
    String viewUrl();


    String httpMethod() default "Get";


}

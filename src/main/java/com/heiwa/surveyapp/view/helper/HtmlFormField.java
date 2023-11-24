package com.heiwa.surveyapp.view.helper;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.heiwa.surveyapp.view.helper.HtmlFormFieldType.TEXT;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface HtmlFormField {
    String labelFor() default "";

    String label() default "";

    String id() default "";

    String name() default "";

    boolean required();
    HtmlFormFieldType type() default TEXT;
}

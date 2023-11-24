package com.heiwa.database.helper;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DbTableId {
}

package com.mymaven.annotation.annotationImpl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Smik_li30 on 11.09.2017.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME )
public @interface MethodAnnotation {
    int id();
    int subId();
}

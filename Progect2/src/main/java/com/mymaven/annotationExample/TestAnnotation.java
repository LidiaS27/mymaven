package com.mymaven.annotationExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {

    public enum Priority {
        LOW, MEDIUM, HIGH
    }

    //Создаем поля-параметры
    // default устанавливает значение по-умолчанию и поле не обязательно для заполнения
    Priority priority() default Priority.MEDIUM;

    String[] list() default "";

}
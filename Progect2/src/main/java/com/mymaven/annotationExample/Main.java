package com.mymaven.annotationExample;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
        Class<TestClass> tClass = TestClass.class;

        // Проверяем действительно ли аннотирован класс
        if (tClass.isAnnotationPresent(TestAnnotation.class)) {
            Annotation annotation = tClass.getAnnotation(TestAnnotation.class);
            TestAnnotation testAnnotation = (TestAnnotation) annotation;

            ///Получаем доступ к значениям
            System.out.printf("%nPriority :%s", testAnnotation.priority());
            System.out.printf("%nTags :");

            int listLength = testAnnotation.list().length;
            for (int i = 0; i < listLength; ++i) {
                if (listLength > 1) {
                    System.out.println(testAnnotation.list()[i] + ", ");
                } else {
                    System.out.println(testAnnotation.list()[i]);
                }
                listLength--;
            }
        }
    }
}

package com.mymaven.annotation;

import com.mymaven.annotation.model.User;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.math.BigInteger;

/**
 * Created by Smik_li30 on 11.09.2017.
 */
public class Main {

    public static void main(String[] args) {
        User user =new User();
        System.out.println(user);

        user.setId(new BigInteger("278964"));
        user.setName("Name");
        user.setSurname("Surname");

        Class uClass = User.class;
        Annotation [] anno = uClass.getDeclaredAnnotations();
        for (int i = 0; i<anno.length;i++){
            System.out.println();
        }

        Method [] methods = uClass.getDeclaredMethods();
        for (int i =0; i<methods.length; i++){
            if (methods[i].getName().equals("isUser"))
            System.out.println(methods[i]);
            Annotation [] annos = methods[i].getDeclaredAnnotations();
            for (int j = 0; j<annos.length;j++){
                System.out.println(annos[j]);
            }

        }

    }
}

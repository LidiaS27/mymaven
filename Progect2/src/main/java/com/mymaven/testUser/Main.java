package com.mymaven.testUser;

import java.lang.reflect.Field;

/**
 * Created by Smik_li30 on 11.09.2017.
 */
public class Main {
    public static void main(String [] args) throws Exception {

        UserImpl user = new UserImpl();
//
//        user.setId(1);
//        user.setName("Kate");
//        user.setSurname("Mazur");

       Field name;

            name = user.getClass().getDeclaredField("name");
            name.setAccessible(true);
            name.set(user, "Kate");
            name.setAccessible(false);

        Field id;

            id = user.getClass().getDeclaredField("id");
            id.setAccessible(true);
            id.set(user, 1);
            id.setAccessible(false);

        Field surname;

            surname = user.getClass().getDeclaredField("surname");
            surname.setAccessible(true);
            surname.set(user, "Mazur");
            surname.setAccessible(false);

        System.out.println(user.toString());

    }
}

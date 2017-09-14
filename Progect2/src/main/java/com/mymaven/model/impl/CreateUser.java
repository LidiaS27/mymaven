package com.mymaven.model.impl;

import java.util.ArrayList;
import java.util.List;

public class CreateUser  {

    public List<User> allUsers = usersAdd();

    private static List<User> usersAdd() {

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User ("1","Kate","Mazur","kate28@gmail.com","Kate28","1111","28"));


        return userList;
    }



   @Override
    public String toString() {
        return "CreateUser{" +
                "allUsers=" + allUsers +
                '}';
    }
}

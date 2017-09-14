package com.mymaven.annotation.model;

import com.mymaven.annotation.annotationImpl.MethodAnnotation;

import java.math.BigInteger;

/**
 * Created by Smik_li30 on 11.09.2017.
 */

public class User {

    BigInteger id;
    String name;
    String surname;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @MethodAnnotation(id = 1234567, subId = 12345)
    public boolean isUser(boolean bool){
        return (bool == true? true : false);
    }
}

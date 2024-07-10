package com.Test;

import com.servlet.test;

import java.util.Optional;

public class TestPerson {
    public static void main(String[] args) {

        Person person = new Person();
        person.age=18;
        System.out.println(person.age);


    }
    public Integer parseSaleType(String saleTypeStr){
        if (saleTypeStr==null||saleTypeStr.equals("")) {
            return null;
        }

        if(saleTypeStr.equals("JX")){
            return 1;
        }
        return null;
    }

}

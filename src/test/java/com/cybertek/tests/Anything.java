package com.cybertek.tests;

import com.github.javafaker.Faker;

public class Anything {

    public static void main(String[] args) {

        System.out.println("salamau alaykum");

         Faker faker = new Faker();

        System.out.println(faker.address().zipCode());

        System.out.println(faker.name().fullName());


        System.out.println(faker.artist().name());
        System.out.println(faker.avatar().image());




        //*[@id="file-submit"]

    }


}

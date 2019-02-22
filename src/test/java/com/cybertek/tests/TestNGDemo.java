package com.cybertek.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {


    @Test

    public  void  testOne(){


        System.out.println("Hello World");

        String expected = "a";
        String actuall = "B";

        Assert.assertEquals(expected,actuall);


//        if(expected.equals(actuall)){
//
//            System.out.println("Pass");
//        }else{
//            System.out.println("Fail");
//
//        }
//


    }



}

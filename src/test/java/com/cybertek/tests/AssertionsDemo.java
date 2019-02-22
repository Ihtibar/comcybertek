package com.cybertek.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {


    @Test
    public  void  test1(){

        String a = "A";
        String b = "A";

        Assert.assertEquals(a,b);
    }



    @Test
    public  void  test2(){

        String a = "A";
        String b = "AAA";

        Assert.assertEquals(a,b);//comparing a to b,first param is actual second is expected
    }



    @Test

    public void test3(){

//      boolean b = 1 == 1;
//
//       Assert.assertTrue(true);

        String a = "A";
        String b = "AAA";
//        WebElement element = null;
        Assert.assertTrue(b.contains(a));

        System.out.println("Done");


    }




    @Test
    public  void  test4(){

        String a = "AAA";
        String b = "AAA";

        Assert.assertTrue(b.contains(a),b + "should have containde "+ a);
    }





}

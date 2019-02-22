package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MoreDependenciesTest {

    @Test
    public void openBrowser(){


        System.out.println("opening browser");

        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "openBrowser" ,priority = -9)
    public void login(){


        System.out.println("login");
    }

    @Test(dependsOnMethods = "login")
    public void logout(){


        System.out.println("logout");
    }





}

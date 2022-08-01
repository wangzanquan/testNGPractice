package com.pratice.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {

    //Will run before every test method
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute before every method");
    }

    @Test
    void test1(){
        System.out.println("This is test1...");
    }

    @Test
    void test2(){
        System.out.println("This is test2...");
    }
}

package com.example.test;


import com.example.driver.driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;


public class baseTest {

    protected baseTest(){}

    @BeforeMethod
    protected void setUP() throws Exception {
        System.out.println("before method");
        driver.initDriver();
    }

    @AfterMethod
    protected void tearDown()
    {
        System.out.println("after method");
        driver.quitDriver();
    }
}

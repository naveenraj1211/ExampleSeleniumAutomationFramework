package com.example.test;


import com.example.driver.driverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.sql.Driver;

public class homePageTest extends baseTest {
    private homePageTest(){}
    @Test
    public void test3()
    {
        driverManager.getDriver().findElement(By.name("q")).sendKeys("Testing", Keys.ENTER);
    }

    @Test
    public void test4()
    {
        driverManager.getDriver().findElement(By.name("q")).sendKeys("Parallel", Keys.ENTER);
    }








}

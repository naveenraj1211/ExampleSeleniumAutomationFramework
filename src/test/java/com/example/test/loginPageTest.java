package com.example.test;

import com.example.driver.driver;
import com.example.driver.driverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class loginPageTest extends baseTest {
    private loginPageTest (){}

    @Test
    public void test1()
    {
        driverManager.getDriver().findElement(By.name("q")).sendKeys("selenium java", Keys.ENTER);
    }

}

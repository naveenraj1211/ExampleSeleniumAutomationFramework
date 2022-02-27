package com.example.driver;

import com.example.constans.frameworkConstants;
import com.example.utils.readPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Objects;

public final class driver {
    private driver(){}

    public static void initDriver() throws Exception {
        if (Objects.isNull(driverManager.getDriver())) {
            System.setProperty("webdriver.chrome.driver", frameworkConstants.getChromeDriverPath());
            driverManager.setDriver(new ChromeDriver());
            driverManager.getDriver().get(readPropertyFile.getValue("url"));
        }
    }

    public static void quitDriver(){
        if (Objects.nonNull(driverManager.getDriver())) {
            driverManager.getDriver().quit();
            driverManager.unLoad();
        }
    }

}

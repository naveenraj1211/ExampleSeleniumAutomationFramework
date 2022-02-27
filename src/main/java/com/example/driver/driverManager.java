package com.example.driver;

import org.openqa.selenium.WebDriver;

public final class driverManager {

    private driverManager(){}

    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static WebDriver getDriver()
    {
        return dr.get();
    }

    public static  void setDriver(WebDriver driverref)
    {
         dr.set(driverref);
    }

    public static void unLoad()
    {
        dr.remove();
    }

}

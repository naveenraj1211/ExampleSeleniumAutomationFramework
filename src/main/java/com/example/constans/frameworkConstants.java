package com.example.constans;

public final class frameworkConstants {

    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";

    private  frameworkConstants(){}
    public static String getChromeDriverPath()
    {
        return CHROMEDRIVERPATH;
    }



}

package com.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class readPropertyFile {


    private readPropertyFile(){}

    public static String getValue (String Key) throws Exception {
        String value = "";
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream( System.getProperty("user.dir")+"/src/test/resources/configs/config.properties");
        properties.load(file);

        if(Objects.isNull(properties.getProperty(Key)))
        {
            throw new Exception("Property Name "+Key+" is not found");
        }

        return properties.getProperty(Key);
    }

}

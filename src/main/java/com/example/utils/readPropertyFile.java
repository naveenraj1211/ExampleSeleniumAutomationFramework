package com.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class readPropertyFile {


    private readPropertyFile(){}

    private static Properties properties = new Properties();
    private static final Map<String,String> CONFIGMAP = new HashMap<>();

    static {
        try {
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/configs/config.properties");
            properties.load(file);

            for( Map.Entry<Object, Object> entry:properties.entrySet())
                CONFIGMAP.put((String) entry.getKey(), (String) entry.getValue());

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }



    public static String getValue (String Key) throws Exception {
        String value = "";

        if(Objects.isNull(Key))
        {
            throw new Exception("Property Name "+Key+" is null. Please check the calling method arugument");
        }
        else if(Objects.isNull(properties.getProperty(Key)))
        {
            throw new Exception("Property Name "+Key+" is not found. Please check the property file");
        }
        return CONFIGMAP.get(Key);
    }

}

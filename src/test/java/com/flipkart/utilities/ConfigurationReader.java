package com.flipkart.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        try{
            FileInputStream file = new FileInputStream("configurations.properties");
            properties.load(file);
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String getProperties(String key){
        return properties.getProperty(key);
    }
}

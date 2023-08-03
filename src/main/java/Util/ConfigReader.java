package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    public static Properties initialize_properties(){

        properties = new Properties();

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("src/test/resources/config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return getProperties();

    }

    public static  Properties getProperties(){
        return properties;
    }

}

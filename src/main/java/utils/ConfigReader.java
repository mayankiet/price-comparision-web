package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties = new Properties();

    public ConfigReader() throws IOException {
        File file = new File("Application.Properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
    }

    public String getAmazonUrl(){
        return properties.getProperty("amazon");
    }

    public String getFlipkartUrl(){
        return properties.getProperty("flipkart");
    }
}

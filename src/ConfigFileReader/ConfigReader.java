package ConfigFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    public ConfigReader() {


        BufferedReader reader;
        String propertyFilePath = "configuration//config.properties";
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));

            properties = new Properties();
            try {

                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getPlateformName() {

        String plateformName = properties.getProperty("plateformName");
        if (plateformName != null)
            return plateformName;
        else throw new RuntimeException("plateform not specifes in the Configuration.properties file");
    }


    public String getPlateVersion() {

        String plateformVersion = properties.getProperty("plateformVersion");
        if (plateformVersion != null)
            return plateformVersion;
        else throw new RuntimeException("plateformversion not specifes in the Configuration.properties file");
    }


    public String getDeviceName() {

        String deviceName = properties.getProperty("deviceName");
        if (deviceName != null)
            return deviceName;
        else throw new RuntimeException("deviceName not specifes in the Configuration.properties file");
    }

}

package config_management;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

    private static final Properties config;


    static {

        config = new Properties();
        try {
            config.load(new FileReader("src/test/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPostcodeTestFileLocation() {
        return config.getProperty("get_postcode_test_file_location");
    }

    public static String postcodeIoPostcodesEndpoint() {
        return config.getProperty("postcodeIo_postcodes_endpoint");
    }

    public static String postcodeIoBaseUrl() {
        return config.getProperty("postcodeIo_base_url");
    }

    public static String testEnv() {
        return config.getProperty("test_env");
    }

}

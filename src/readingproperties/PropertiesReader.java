package readingproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            // Load the properties file
            FileInputStream input = new FileInputStream("sample.properties");
            properties.load(input);

            // Get properties by their keys
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            String database = properties.getProperty("database");

            // Print the properties
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Database: " + database);
        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
        }
    }
}

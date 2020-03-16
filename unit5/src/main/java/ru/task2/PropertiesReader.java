package ru.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private Properties properties = new Properties();

    public PropertiesReader(String path) {
        try (FileInputStream input = new FileInputStream(path)) {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Невозможно прочитать файл по указанному пути: " + path);
        }
    }

    public String getProperty(String key) throws PropertyNotFoundException {
        if (!properties.containsKey(key)) {
            throw new PropertyNotFoundException();
        }
        return properties.getProperty(key);
    }
}

package ru.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;
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

    public Optional<String> getProperty(String key) {
        return Optional.ofNullable(properties.getProperty(key));
    }
}

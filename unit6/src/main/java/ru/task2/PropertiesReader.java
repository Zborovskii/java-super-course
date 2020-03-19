package ru.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

public class PropertiesReader {

    private Map<String, String> properties;

    public PropertiesReader(String path) {
        try (FileInputStream input = new FileInputStream(path)) {
            Properties p = new Properties();
            p.load(input);
            properties = new HashMap<>();
            p.forEach((key, value) -> properties.put((String) key, (String) value));
        } catch (IOException e) {
            throw new RuntimeException("Невозможно прочитать файл по указанному пути: " + path);
        }

    }

    public Optional<String> getProperty(String key) {
        return Optional.ofNullable(properties.get(key));
    }
}

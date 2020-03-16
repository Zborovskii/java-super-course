package ru.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class PropertiesReader {

    private Properties properties = new Properties();
    private PrintStream printStream = new PrintStream(System.out);

    public PropertiesReader(String path) {
        try (FileInputStream input = new FileInputStream(path)) {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Не возможно прочитать файл по указанному пути: " + path);
        }
    }

    public String getProperty(String key) throws PropertyNotFoundException {
        if (!properties.containsKey(key)) {
            throw new PropertyNotFoundException();
        }
        return properties.getProperty(key);
    }
}

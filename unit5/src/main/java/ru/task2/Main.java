package ru.task2;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        PropertiesReader propertiesReader = new PropertiesReader("unit5/src/main/resources/properties.properties");

        Optional<String> result = propertiesReader.getProperty("property2");

        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("не найдено проперти");
        }
    }

}

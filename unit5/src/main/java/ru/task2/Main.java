package ru.task2;

public class Main {

    public static void main(String[] args) {
        PropertiesReader propertiesReader = new PropertiesReader("unit5/src/main/resources/properties.properties");

        try {
            System.out.println(propertiesReader.getProperty("property2"));

        } catch (PropertyNotFoundException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }


}

package ru.task3;

public class Main {

    public static void main(String[] args) {
        CharsetTranslator charsetTranslator = new CharsetTranslator("unit4/src/main/java/ru.task3/UTF8File.txt");

        charsetTranslator.translateTo("unit4/src/main/java/ru.task3/UTF16File.txt");
    }
}

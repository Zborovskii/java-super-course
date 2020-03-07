package ru.task1task2;

import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nByteSearch:");
        KeyWordsByteSearcher keyWordsByteSearcher =
                new KeyWordsByteSearcher(
                        Paths.get("unit4/src/main/java/ru/task1task2/KeyWordsSearcher.java").toFile().getAbsolutePath(),
                        Charset.defaultCharset());

        Arrays.stream(keyWordsByteSearcher.getKeyWords().toArray()).forEach(System.out::println);
        keyWordsByteSearcher.extractInto("unit4/src/main/java/ru/task1task2/ByteSearchKeywords.txt");


        System.out.println("\nSymbolSearch:");
        KeyWordsSymbolSearcher keyWordsSymbolSearcher =
                new KeyWordsSymbolSearcher(
                        Paths.get("unit4/src/main/java/ru/task1task2/KeyWordsSearcher.java").toFile().getAbsolutePath(),
                        Charset.defaultCharset());

        Arrays.stream(keyWordsSymbolSearcher.getKeyWords().toArray()).forEach(System.out::println);
        keyWordsSymbolSearcher.extractInto("unit4/src/main/java/ru/task1task2/SymbolSearchKeywords.txt");

    }
}

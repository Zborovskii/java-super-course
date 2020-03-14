package ru.task1task2;


import static org.apache.axis2.util.JavaUtils.isJavaKeyword;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface KeyWordsSearcher {

    String OUTPUT_FORMAT = "%s - %d\n";

    Set<String> getKeyWords();

    void extractInto(String fileName);

    default Map<String, Integer> findKeyWords(String text) {
        Map<String, Integer> foundedKeyWords = new HashMap<>();

        Matcher matcher = Pattern.compile("\\w+").matcher(text);

        while (matcher.find()) {
            String foundedWord = matcher.group();

            if (isJavaKeyword(foundedWord)) {
                if (foundedKeyWords.containsKey(foundedWord)) {
                    foundedKeyWords.put(foundedWord, foundedKeyWords.get(foundedWord) + 1);
                } else {
                    foundedKeyWords.put(foundedWord, 1);
                }
            }
        }

        return foundedKeyWords;
    }
}

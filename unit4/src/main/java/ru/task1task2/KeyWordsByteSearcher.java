package ru.task1task2;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

public class KeyWordsByteSearcher implements KeyWordsSearcher {
    private Map<String, Integer> foundedKeyWords;

    public KeyWordsByteSearcher(String filePath, Charset charset) {
        byte[] bytes = new byte[0];

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(filePath))) {
            bytes = new byte[inputStream.available()];
            bytes = inputStream.readAllBytes();
        } catch (IOException e) {
            System.out.println("Ошибка в ходе чтения исходного файла");
        }

        foundedKeyWords = findKeyWords(new String(bytes, charset));
    }

    @Override
    public Set<String> getKeyWords() {
        return foundedKeyWords.keySet();
    }

    @Override
    public void extractInto(String fileName) {
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileName))) {
            for (String keyWord : foundedKeyWords.keySet()) {
                outputStream.write(String.format(OUTPUT_FORMAT, keyWord, foundedKeyWords.get(keyWord)).getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

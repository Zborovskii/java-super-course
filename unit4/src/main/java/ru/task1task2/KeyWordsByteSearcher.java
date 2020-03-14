package ru.task1task2;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

public class KeyWordsByteSearcher implements KeyWordsSearcher {
    private Map<String, Integer> foundedKeyWords;

    public KeyWordsByteSearcher(String filePath, Charset charset) throws IOException {
        byte[] bytes;

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(filePath))) {
            bytes = inputStream.readAllBytes();
        } catch (IOException e) {
            throw new IOException("Ошибка в ходе чтения исходного файла");
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

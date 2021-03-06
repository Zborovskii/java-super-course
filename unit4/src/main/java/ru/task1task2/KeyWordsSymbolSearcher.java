package ru.task1task2;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyWordsSymbolSearcher implements KeyWordsSearcher {
    private Map<String, Integer> foundedKeyWords = new HashMap<>();

    public KeyWordsSymbolSearcher(String filePath, Charset charset) {
        String lines = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines = lines.concat(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка в ходе чтения исходного файла");
        }
        foundedKeyWords.putAll(findKeyWords(lines));
    }

    @Override
    public Set<String> getKeyWords() {
        return foundedKeyWords.keySet();
    }

    @Override
    public void extractInto(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, Integer> keyWordRecord : foundedKeyWords.entrySet()) {
                writer.write(String.format(OUTPUT_FORMAT, keyWordRecord.getKey(), keyWordRecord.getValue()));
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка в ходе записи файла");
        }
    }
}

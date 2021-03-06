package ru.task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CrazyLogger {
    private StringBuilder log = new StringBuilder();
    private static final String DATE_TIME_PATTERN = "dd-MM-YYYY : hh-mm";
    private static final String MESSAGES_SEPARATOR = ";";
    private static final String DATE_MESSAGE_SEPARATOR = " - ";
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_TIME_PATTERN);


    public void addMessage(String message) {
        log.append(LocalDateTime.now().format(dateTimeFormatter))
                .append(DATE_MESSAGE_SEPARATOR)
                .append(message)
                .append(MESSAGES_SEPARATOR);
    }

    public String getFullLog() {
        return log.toString();
    }

    public String findFirstMessage(String message) {
        return getRecord(log.indexOf(message));
    }

    public String findLastMessage(String message) {
        return getRecord(log.lastIndexOf(message));
    }

    private String getRecord(int messageStartPoint) {
        int recordStartPoint = log.substring(0, messageStartPoint).lastIndexOf(MESSAGES_SEPARATOR);

        return log.substring(recordStartPoint + 1, log.indexOf(MESSAGES_SEPARATOR, messageStartPoint));
    }

    public List<String> findAllMessages(String message) {
        List<String> logArray = Arrays.asList(log.toString().split(MESSAGES_SEPARATOR));

        return logArray.stream().
                filter(item -> item.indexOf(message) != -1).
                collect(Collectors.toList());
    }
}

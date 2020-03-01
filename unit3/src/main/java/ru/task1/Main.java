package ru.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CrazyLogger crazyLogger = new CrazyLogger();

        crazyLogger.addMessage("first message");
        crazyLogger.addMessage("second message");
        crazyLogger.addMessage("third message");
        crazyLogger.addMessage("test");


        System.out.println("All logs: " + crazyLogger.getFullLog());
        System.out.println("First log: " + crazyLogger.findFirstMessage("message"));
        System.out.println("Last log: " + crazyLogger.findLastMessage("message"));

    }
}

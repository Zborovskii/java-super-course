package ru.task2;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    private static final String QUESTION_FORMAT = "question.%s.question";
    private static final String ANSWER_FORMAT = "question.%s.answer";
    private static final String BASE_NAME = "questions";

    public static void main(String[] args) {

        ResourceBundle bundleDefault = ResourceBundle.getBundle(BASE_NAME);
        ResourceBundle bundleEn = ResourceBundle.getBundle(BASE_NAME, Locale.ENGLISH);
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Chose language rus or en");
            String inputString = in.nextLine();

            switch (inputString) {
                case "rus":
                    printQuestions(bundleDefault);
                    System.out.println("Выберите номер вопроса от 1 до 3");

                    inputString = in.nextLine();
                    if (Integer.parseInt(inputString) > 3) {
                        break;
                    }

                    printQuestionAndAnswer(bundleDefault, inputString);
                    break;
                case "en":
                    printQuestions(bundleEn);
                    System.out.println("Chose the question number from 1 to 3");

                    inputString = in.nextLine();
                    if (Integer.parseInt(inputString) > 3) {
                        break;
                    }

                    printQuestionAndAnswer(bundleEn, inputString);
                    break;
                default:
                    System.out.println("You can input only \"rus\" or \"en\" ");
                    break;
            }
        }
    }

    public static void printQuestionAndAnswer(ResourceBundle resourceBundle, String inputString) {

        System.out.println(resourceBundle.getString(String.format(QUESTION_FORMAT, inputString)));
        System.out.println(resourceBundle.getString(String.format(ANSWER_FORMAT, inputString)));
    }

    public static void printQuestions(ResourceBundle resourceBundle) {
        for (Integer i = 1; i <= 3; i++) {
            System.out.println(resourceBundle.getString(String.format(QUESTION_FORMAT, i)));
        }
    }
}

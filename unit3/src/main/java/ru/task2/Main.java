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

        while (true) {
            System.out.println("Chose language rus or en");

            Scanner in = new Scanner(System.in);
            String inputString = in.nextLine();

            if (inputString.equals("rus")) {
                System.out.println("Выберите номер вопроса от 1 до 3");

                inputString = in.nextLine();
                if (Integer.parseInt(inputString) > 3) {
                    break;
                }

                printQuestionAndAnswer(bundleDefault, inputString);
            } else if (inputString.equals("en")) {
                System.out.println("Chose the question number from 1 to 3");

                inputString = in.nextLine();
                if (Integer.parseInt(inputString) > 3) {
                    break;
                }

                printQuestionAndAnswer(bundleEn, inputString);
            } else {
                System.out.println("You can input only \"rus\" or \"en\" ");
            }
        }
    }

    public static void printQuestionAndAnswer(ResourceBundle resourceBundle, String inputString) {

        System.out.println(resourceBundle.getString(String.format(QUESTION_FORMAT, inputString)));
        System.out.println(resourceBundle.getString(String.format(ANSWER_FORMAT, inputString)));
    }
}

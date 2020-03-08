package ru.task1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) throws Exception {

        scanner = new Scanner(System.in);
        programInfo();

        for (; ; ) {
            String inputString = scanner.nextLine();

            String[] userCommand = inputString.split(" ");

            if ((!Arrays.asList("show", "create", "delete", "edit").contains(userCommand[0]))
                    || (userCommand.length < 3 && userCommand[0].equals("edit"))
                    || (userCommand.length > 2 && Arrays.asList("show", "create", "delete").contains(userCommand[0]))) {
                throw new Exception("Вы ввели неверную команду, посмотрите инструкцию с примерами");
            }

            switch (userCommand[0]) {
                case "show":
                    showContents(new File(userCommand[1]));
                    break;
                case "create":
                    createTextFile(new File(userCommand[1]));
                    break;
                case "delete":
                    deleteTextFile(new File(userCommand[1]));
                    break;
                case "edit":
                    editTextFile(new File(userCommand[1]), userCommand[2]);
                    break;
            }
        }

    }

    public static void showContents(File dir) throws IOException {

        if (dir.isDirectory()) {
            System.out.println("Содержимое директории " + dir + "\n");

            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + "  \t folder");
                } else {
                    System.out.println(item.getName() + "\t file");
                }
            }
        } else {
            System.out.println("Содержимое файла " + dir + "\n");

            try (FileReader reader = new FileReader(dir)) {
                int c;
                while ((c = reader.read()) != -1) {
                    System.out.print((char) c);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void createTextFile(File dir) throws IOException {

        if (dir.exists()) {
            throw new IOException("Такой файл уже существует, вы не можете создать файл с одинаковым названием");
        }

        try (FileWriter writer = new FileWriter(dir, false)) {
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public static void deleteTextFile(File dir) throws IOException {

        if (!dir.exists()) {
            throw new IOException("Такого файла не существует, вы не можете удалять не существующий файл");
        }

        if (dir.isDirectory()) {
            throw new IOException("Вы не можете удалить директорию, для удаления выберите файл");
        }
    }

    public static void editTextFile(File dir, String text) throws IOException {
        if (!dir.exists()) {
            throw new IOException("Такого файла не существует, вы не можете изменить не существующий файл");
        }
        try (FileWriter writer = new FileWriter(dir, true)) {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void programInfo() {
        System.out.println("Выможете вносить следующие команды:\n" +
                "show + директория каталога или файла. Пример 'show /Users/macbookbro/Desktop/example/README1.md'\n" +
                "create + директория каталога. Пример 'create /Users/macbookbro/Desktop/example/README1.md'\n" +
                "delete + директория файла. Пример 'delete /Users/macbookbro/Desktop/example/README1.md'\n" +
                "edit + директория файла + добавляемый текст. Пример 'edit /Users/macbookbro/Desktop/example/README1.md' added text");
    }
}

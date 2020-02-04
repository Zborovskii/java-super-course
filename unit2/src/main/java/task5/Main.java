package task5;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Subject math = new Subject("math", false);
        Subject algebra = new Subject("algebra", false);
        Subject history = new Subject("history", true);

        Student student1 = new Student("alex");
        Student student2 = new Student("peter");
        Student student3 = new Student("oleg");
        Student student4 = new Student("vadim");
        Student student5 = new Student("sam");


        student1.customSetMark(math, 5.2);
        student1.customSetMark(algebra, 3.5);
        student1.customSetMark(history, 4);

        student2.customSetMark(history, 5);
        student2.customSetMark(math, 5.9);

        student3.customSetMark(math, 4.5);
        student3.customSetMark(math, 4.5);
        student3.customSetMark(math, 5.1);

        student4.customSetMark(history, 5);
        student4.customSetMark(algebra, 2.1);

        student5.customSetMark(history, 3);

        List<Student> studentsList = Arrays.asList(student1, student2, student3, student4, student5);

        //группа по математике
        groupStudentsBySubject(studentsList, "math");

        //оценки в группе по математике
        getGroupMarksBySubject(studentsList, "math");
    }

    private static void groupStudentsBySubject(List<Student> studentsList, String subject) {
        studentsList.stream()
                .filter(student -> student.getMarks().containsKey(subject))
                .forEach(System.out::println);

    }

    private static void getGroupMarksBySubject(List<Student> studentsList, String subject) {
        studentsList.stream()
                .map(Student::getMarks)
                .filter(s -> s.containsKey(subject))
                .map(s -> s.get(subject))
                .mapToDouble(i -> i.stream()
                        .mapToDouble(j -> j.floatValue())
                        .average()
                        .getAsDouble())
                .average()
                .ifPresent(System.out::println);
    }
}

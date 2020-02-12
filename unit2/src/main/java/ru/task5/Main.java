package ru.task5;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Sasha");
        Student student2 = new Student("Alex");
        Student student3 = new Student("Sveta");

        Group<Integer> groupMath = new Group<>(Subject.MATH);
        Group<Integer> groupHistory = new Group<>(Subject.HISTORY);
        Group<Double> groupAlgebra = new Group<>(Subject.ALGEBRA);

        groupAlgebra.addStudentToGroup(student1);
        groupAlgebra.addStudentToGroup(student2);
        groupHistory.addStudentToGroup(student3);
        groupHistory.addStudentToGroup(student2);
        groupMath.addStudentToGroup(student2);

        groupAlgebra.addMarkToStudent(student2, 0.5);
        groupAlgebra.addMarkToStudent(student2, 0.5);
        groupAlgebra.addMarkToStudent(student1, 5.5);
        groupAlgebra.addMarkToStudent(student1, 1.5);

        groupHistory.addMarkToStudent(student2, 1);
        groupHistory.addMarkToStudent(student3, 2);

        groupMath.addMarkToStudent(student2, 5);
        groupMath.addMarkToStudent(student2, 5);
        groupMath.addMarkToStudent(student2, 5);

        System.out.println(showGroupMarksBySubject(groupAlgebra, student2));
        System.out.println(showAverageMark(Arrays.asList(groupAlgebra, groupHistory, groupMath), student2));
    }

    //выводит среднюю оценку по конкретному студенту
    private static Double showAverageMark(List<Group> groupList, Student student) {

        return groupList.stream()
                .map(i -> showGroupMarksBySubject(i, student))
                .flatMap(Collection::stream)
                .mapToDouble(Number::doubleValue)
                .average()
                .orElse(0.0);
    }

    //выводит все оценки по предмету по студенту
    private static List<Number> showGroupMarksBySubject(Group<?> group, Student student) {

        return group.getMarksList().entrySet().stream()
                .filter(i -> i.getKey().getName().equals(student.getName()))
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.toList());
    }
}

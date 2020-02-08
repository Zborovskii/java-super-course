package ru.task5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {

        Student student1 = new Student("Sasha");
        Student student2 = new Student("Alex");
        Student student3 = new Student("Sveta");

        Group<Integer> groupMath = new Group<Integer>(Subject.MATH);
        Group<Integer> groupHistory = new Group<Integer>(Subject.HISTORY);
        Group<Double> groupAlgebra = new Group<Double>(Subject.ALGEBRA);

        groupAlgebra.addStudentToGroup(student1);
        groupAlgebra.addStudentToGroup(student2);
        groupHistory.addStudentToGroup(student3);
        groupHistory.addStudentToGroup(student2);
        groupMath.addStudentToGroup(student2);

        groupAlgebra.addMarkToStudent(student2, 0.5);
        groupAlgebra.addMarkToStudent(student2, 0.5);
        groupAlgebra.addMarkToStudent(student1, 0.5);
        groupAlgebra.addMarkToStudent(student1, 1.5);

        groupHistory.addMarkToStudent(student2, 1);
        groupHistory.addMarkToStudent(student3, 2);

        groupMath.addMarkToStudent(student2, 5);
        groupMath.addMarkToStudent(student2, 5);
        groupMath.addMarkToStudent(student2, 5);



        showGroupMarksBySubject(groupAlgebra);
    }


    public static void showGroupMarksBySubject(Group group) {
       group.getMarksList().entrySet().forEach(Student::getName);
    }


    public static void showAverageMark(Student student, List<Integer> marksList){


    }






}

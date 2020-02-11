package ru.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group<T extends Number> {

    private Subject subject;
    private Map<Student, List<T>> marksList;

    public Group(Subject subject) {
        this.subject = subject;
        this.marksList = new HashMap<>();
    }

    public Subject getSubject() {
        return subject;
    }

    public Map<Student, List<T>> getMarksList() {
        return marksList;
    }

    public void addStudentToGroup(Student student) {
        marksList.put(student, new ArrayList<>());
        student.addGroup(this);
    }


    public void addMarkToStudent(Student student, T mark) {

        if (marksList.get(student) == null) {
            throw new Error(student.getName() + " - нет в группе " + this.subject);
        }

        ArrayList<T> newListOfMarks = new ArrayList<>(marksList.get(student));
        newListOfMarks.add(mark);

        marksList.put(student, newListOfMarks);
    }
}

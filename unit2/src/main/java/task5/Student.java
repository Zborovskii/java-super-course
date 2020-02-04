package task5;

import java.util.*;

public class Student {

    private String name;
    private Map<String, List<Number>> marks;

    public Student(String name) {
        this.name = name;
        this.marks = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, List<Number>> getMarks() {
        return marks;
    }

    public void customSetMark(Subject subject, Number mark) {
        System.out.println(mark);
        if (
                (subject.getWhole() && (mark.floatValue() % 1 != 0)) || (!subject.getWhole() && (mark.floatValue() % 1 == 0))
        ) {
            throw new Error("По предмету - " + subject.getName() + " введен не допустимый тип числа");
        }


        if (marks.containsKey(subject.getName())) {

            List<Number> marksList = new ArrayList<>();
            marksList.addAll(marks.get(subject.getName()));

            marks.put(subject.getName(), marksList);
        } else {
            marks.put(subject.getName(), Arrays.asList(mark));
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

package task5;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private HashMap<String, Double> marks;

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

    public Map<String, Double> getMarks() {
        return marks;
    }

    public void setMark(Subject subject, Number mark) {
        marks.put(subject.getName(), (double) mark);
    }

    public void setMark(Subject subject, double mark) {
        marks.put(subject.getName(), mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

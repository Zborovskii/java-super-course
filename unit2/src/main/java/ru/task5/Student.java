package ru.task5;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Group> groupList;

    public Student(String name) {
        this.name = name;
        this.groupList = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void addGroup(Group group) {
        groupList.add(group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupList=" + groupList +
                '}';
    }
}

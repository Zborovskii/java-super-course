package ru.task5;

public class Subject {

    private String name;
    private Boolean isWhole;

    public Subject(String name, Boolean isWhole) {
        this.name = name;
        this.isWhole = isWhole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWhole() {
        return isWhole;
    }

    public void setWhole(Boolean whole) {
        isWhole = whole;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", isWhole=" + isWhole +
                '}';
    }
}

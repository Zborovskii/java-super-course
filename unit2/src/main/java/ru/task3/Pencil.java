package ru.task3;

public class Pencil extends Stationery {

    private String softness;

    public Pencil(String name, Integer price, String softness) {
        super(name, price);
        this.softness = softness;
    }

}

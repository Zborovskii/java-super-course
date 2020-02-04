package task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Stationery> beginner = createBeginner();

        //Task 4 сортировка вещей в наборе
        //по наименованию и по цене
        beginner.sort(Comparator.comparing(Stationery::getName).thenComparing(Stationery::getPrice));
        System.out.println("Сортировка по стоимости и наименованию \n" + beginner);

        //по стоимости
        beginner.sort(Comparator.comparing(Stationery::getPrice));
        System.out.println("\n Сортировка по стоимости \n" + beginner);

        //по наименованию
        beginner.sort(Comparator.comparing(Stationery::getName));
        System.out.println("\n Сортировка по наименованию \n" + beginner);
    }

    public static List<Stationery> createBeginner() {
        Pen pen1 = new Pen("a", 100, "parker");
        Pen pen2 = new Pen("b", 100, "parker");
        Pen pen3 = new Pen("c", 10, "parker");
        Pencil pencil2 = new Pencil("a", 70, "m2");
        Pencil pencil1 = new Pencil("a", 50, "m2");


        //создаем набор "новичек"
        return Arrays.asList(pen1, pen2, pen3, pencil1, pencil2);
    }
}

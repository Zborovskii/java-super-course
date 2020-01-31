package Task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Stationery> novichek = createNovichek();

        //Task 4 сортировка вещей в наборе
        //по стоимости
        novichek.sort(Comparator.comparing(Stationery::getPrice));

        //по наименованию
        novichek.sort(Comparator.comparing(Stationery::getName));

        //по наименованию и по цене
        novichek.sort(Comparator.comparing(Stationery::getName).thenComparing(Stationery::getPrice));

        System.out.println(novichek);
    }

    public static List<Stationery> createNovichek() {
        Pen pen1 = new Pen("a", 100, "parker");
        Pen pen2 = new Pen("b", 100, "parker");
        Pen pen3 = new Pen("c", 300, "parker");
        Pencil pencil1 = new Pencil("a", 50, "m2");
        Pencil pencil2 = new Pencil("a", 70, "m2");

        //создаем набор "новичек"
        return Arrays.asList(pen1, pen2, pen3, pencil1, pencil2);
    }
}

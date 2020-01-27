package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Определить полную стоимость канцтоваров у сотрудника

        Stationery pen = new Stationery("pen", 100);
        Stationery pencil = new Stationery("pencil", 50);

        Worker worker = new Worker("John");
        worker.setStationeries(Arrays.asList(pen, pencil));

        int summ = worker.getStationeries().stream().
                mapToInt(Stationery::getPrice).
                sum();

        System.out.println(String.format("Стоимость канцтоваров у сотрудника %s - %s", worker.getName(), summ));


    }
}

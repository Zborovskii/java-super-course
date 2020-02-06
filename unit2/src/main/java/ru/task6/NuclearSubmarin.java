package ru.task6;

public class NuclearSubmarin {

    SubmarinEngine submarinEngine = new SubmarinEngine();

    @Info(author = "Alex", purpose = "start submarin")
    void fullSpeedAhead() {
        System.out.println("Полный вперед");
        this.submarinEngine.startEngine();
    }

    /**
     * Метод позволяет остановить лодку
     *
     * @author Александр
     */
    void stopSubmarine() {
        System.out.println("Стоп машина");
        this.submarinEngine.stopEngine();
    }

    /**
     * Это класс описывает двигатель субмарины
     */
    public class SubmarinEngine {
        void startEngine() {
            System.out.println("Двигатель запущен");
        }

        void stopEngine() {
            System.out.println("Заглушить двигатель");
        }

    }

}

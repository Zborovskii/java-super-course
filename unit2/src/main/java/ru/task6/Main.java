package ru.task6;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        NuclearSubmarin nuclearSubmarin = new NuclearSubmarin();

        nuclearSubmarin.fullSpeedAhead();
        nuclearSubmarin.stopSubmarine();

        System.out.println(NuclearSubmarin.class
                .getDeclaredMethod("fullSpeedAhead")
                .getAnnotation(Info.class)
                .author());
    }
}

package ru.task4;

import java.io.*;
import java.nio.file.Paths;
import java.util.Set;

public class Main {

    private FilmsCollection filmsCollection;
    private String collectionFilePath = Paths.get("unit4/src/main/java/ru/task4/films").toFile().getAbsolutePath();

    public static void main(String[] args) {
        Main filmsApp = new Main();
        filmsApp.load();
        Film film1 = new Film("film1");
        Actor actor1 = new Actor("actor1");
        film1.addActor(actor1);
        filmsApp.addFilm(film1);
        filmsApp.save();
        for (Film film : filmsApp.getFilms()) {
            System.out.println(film.getName());
        }
    }

    public Main() {
        filmsCollection = new FilmsCollection();
    }

    public void addFilm(Film film) {
        filmsCollection.addNewFilm(film);
    }

    public Set<Film> getFilms() {
        return filmsCollection.getFilms();
    }

    public void save() {
        try (FileOutputStream fos = new FileOutputStream(collectionFilePath)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(filmsCollection);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try (FileInputStream fis = new FileInputStream(collectionFilePath)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            filmsCollection = (FilmsCollection) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class filmManagerTest {

    @Test
    public void addFilmTest() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";

        filmManager manager = new filmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastTest() {
        filmManager manager = new filmManager();
        String film1 = "Movie 1";

        manager.addFilm(film1);

        String[] actual = manager.findLast();
        String[] expected = {film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastTest2() {
        filmManager manager = new filmManager();
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);m

        String[] actual = manager.findLast();
        String[] expected = {film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }
}


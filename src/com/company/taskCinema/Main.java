package com.company.taskCinema;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Создать класс Cinema с внутренним классом,
     * с помощью объектов которого можно хранить информацию об адресах кинотеатров, фильмах и времени начала сеансов.
     */
    public static void main(String[] args) {

        List<String> time = new ArrayList<>(){
            {
                add("13:50");
                add("17:50");
                add("11:50");
                add("20:00");
            }
        };
        Cinema.Film film1 = new Cinema.Film("Форсаж", time);
        Cinema.Film film2 = new Cinema.Film("ЛюдиХ", time);
        Cinema.Film film3 = new Cinema.Film("Незваные", time);
        Cinema.Film film4 = new Cinema.Film("Лунтик", time);
        List<Cinema.Film> filmsSov = new ArrayList<>(){
            {
                add(film1);
                add(film2);

            }
        };
        Cinema cinemaSov = new Cinema(Cinema.Address.SOVETSKAYA, filmsSov);

        List<Cinema.Film> filmsBel = new ArrayList<>(){
            {
                add(film1);
                add(film3);
            }
        };
        Cinema cinemaBelitsa = new Cinema(Cinema.Address.BELITSA, filmsBel);

        List<Cinema.Film> filmsOkt = new ArrayList<>(){
            {
                add(film2);
                add(film4);
            }
        };
        Cinema cinemaOkt = new Cinema(Cinema.Address.OKTYABR, filmsOkt);

        List<Cinema> cinemas = new ArrayList<>(){{
            add(cinemaSov);
            add(cinemaBelitsa);
            add(cinemaOkt);
        }};
        Poster poster = new Poster(cinemas);
        System.out.println(poster);
    }
}

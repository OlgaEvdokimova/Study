package com.company.taskCinema;

import java.util.List;

public class Poster {
//    public static final String ADDRESS1 = "ул.Советская";
//    public static final String ADDRESS2 = "Белица";
//    public static final String ADDRESS3 = "пр-т Октября";
private List<Cinema> cinemas;

    public Poster(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

//    public List<Cinema.Film> getFilmByAddress(Cinema.Address address) {
//        for (Cinema c : cinemas) {
//
//        }
//        return
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Cinema c : cinemas){
            sb.append(c);
        }
        return sb.toString();
    }
}

package com.company.taskCinema;

import java.util.List;

public class Cinema {

    private Address address;
    private List<Film> films;

    public Cinema(Address address, List<Film> films) {
        this.address = address;
        this.films = films;
    }

    public static class Film {
        private String name;
        private List<String> time;


        public Film(String name, List<String> time) {
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getTime() {
            return time;
        }

        public void setTime(List<String> time) {
            this.time = time;
        }


        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append("Time: ");
            for (String t : time) {
                sb.append(t).append("; ");
            }
            sb.append("\n");
            return sb.toString();
        }
    }

    enum Address {
        SOVETSKAYA("ул.Советская"), BELITSA("Белица"), OKTYABR("пр-т Октября");

        String address;

        Address(String address) {
            this.address = address;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Address: " + address + " ";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cinema: ").append(address).append("\n");
        for (Film f : films) {
            sb.append("Film: ").append(f);
        }
        sb.append("\n");
        return sb.toString();
    }
}

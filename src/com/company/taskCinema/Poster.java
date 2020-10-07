package com.company.taskCinema;

import java.util.List;

public class Cinema {
//    public static final String ADDRESS1 = "ул.Советская";
//    public static final String ADDRESS2 = "Белица";
//    public static final String ADDRESS3 = "пр-т Октября";
private List<Film> films;

    class Film {
        private String name;
        private List<String> time;
        private String address;

        public Film(String name, List<String> time, String address) {
            this.name = name;
            this.time = time;
            this.address = address;
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

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

    }


}

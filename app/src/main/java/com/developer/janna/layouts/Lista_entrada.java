package com.developer.janna.layouts;

/**
 * Created by Carles on 07/12/2016.
 */

public class Lista_entrada {
    private int event_img;
    private String title, date_time, place;

    public Lista_entrada (int event_img, String title, String date_time, String place) {
        this.event_img = event_img;
        this.title = title;
        this.date_time = date_time;
        this.place = place;
    }

    public int get_event_img() {
        return event_img;
    }

    public String get_title() {
        return title;
    }

    public String get_date_time() {
        return date_time;
    }

    public String get_place() {
        return place;
    }
}

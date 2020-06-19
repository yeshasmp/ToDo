package com.example.yeshasprabhakar.todo;

public class DataModel {

    private String title;
    private String date;
    private String time;

    public DataModel(String title, String date, String time) {
        this.title = title;
        this.date = date;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

}

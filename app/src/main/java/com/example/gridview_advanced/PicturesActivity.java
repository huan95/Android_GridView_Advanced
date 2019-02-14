package com.example.gridview_advanced;

public class PicturesActivity {
    private String Name;
    private int Pictures;

    public PicturesActivity(String name, int pictures) {
        Name = name;
        Pictures = pictures;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPictures() {
        return Pictures;
    }

    public void setPictures(int pictures) {
        Pictures = pictures;
    }
}

package com.example.myapplicationcoffiers;

public class detaiMenuCV {
    private String title;
    private String Price;
    private int gambarcoffe;

    public detaiMenuCV(String title, int gambarcoffe) {
        this.title = title;
        this.gambarcoffe = gambarcoffe;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public int getGambarcoffe() {
        return gambarcoffe;
    }

    public void setGambarcoffe(int gambarcoffe) {
        this.gambarcoffe = gambarcoffe;
    }
}

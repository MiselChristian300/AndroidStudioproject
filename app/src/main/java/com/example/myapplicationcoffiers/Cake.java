package com.example.myapplicationcoffiers;

public class Cake {
    private String title_cake;
    private int gambar_cake;


    public Cake(String title_cake, int gambar_cake) {
        this.title_cake = title_cake;
        this.gambar_cake = gambar_cake;
    }

    public String getTitle_cake() {
        return title_cake;
    }

    public void setTitle_cake(String title_cake) {
        this.title_cake = title_cake;
    }

    public int getGambar_cake() {
        return gambar_cake;
    }

    public void setGambar_cake(int gambar_cake) {
        this.gambar_cake = gambar_cake;
    }
}

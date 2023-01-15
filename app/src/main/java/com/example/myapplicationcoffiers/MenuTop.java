package com.example.myapplicationcoffiers;

public class MenuTop {
    private String keterangan;
    private int gambarmenu;
    private int coverPhoto;

    public MenuTop(String keterangan, int gambarmenu, int coverPhoto) {
        this.keterangan = keterangan;
        this.gambarmenu = gambarmenu;
        this.coverPhoto = coverPhoto;
    }

    public MenuTop(String keterangan, int gambarmenu) {
        this.keterangan = keterangan;
        this.gambarmenu = gambarmenu;
    }

    public int getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(int coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getGambarmenu() {
        return gambarmenu;
    }

    public void setGambarmenu(int gambarmenu) {
        this.gambarmenu = gambarmenu;
    }
}

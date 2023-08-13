package com.zzx.facade;

public class DVDPlayer {
    private static DVDPlayer dvdPlayer = new DVDPlayer();

    public static DVDPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public void on() {
        System.out.println("dvd on 开DVD");
    }

    public void off() {
        System.out.println("dvd off 关DVD");
    }

    public void play() {
        System.out.println("dvd playing DVD播放");
    }

    public void pause() {
        System.out.println("dvd pause DVD暂停");
    }

    public void setDVD(String dvd) {
        System.out.println("dvd setDVD 放入影碟：" + dvd);
    }
}

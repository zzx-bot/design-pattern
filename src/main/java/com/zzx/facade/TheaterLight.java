package com.zzx.facade;

public class TheaterLight {
    private static TheaterLight theaterLight = new TheaterLight();

    public static TheaterLight getTheaterLight() {
        return theaterLight;
    }

    public void on() {
        System.out.println("TheaterLight on  开灯光");
    }

    public void off() {
        System.out.println("TheaterLight off  开灯光");
    }

    public void dim() {
        System.out.println("TheaterLight dim  灯光变暗");
    }

    public void bright() {
        System.out.println("TheaterLight bright  灯光亮起");
    }
}

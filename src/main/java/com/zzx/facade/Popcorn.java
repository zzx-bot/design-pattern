package com.zzx.facade;

//
public class Popcorn {
    private static Popcorn popcorn = new Popcorn();

    public static Popcorn getPopcorn() {
        return popcorn;
    }

    public void on() {
        System.out.println("Popcorn on 开爆米花机");
    }

    public void off() {
        System.out.println("Popcorn off 关爆米花机");
    }

    public void pop() {
        System.out.println("Popcorn pop 开炸爆米花");
    }

}

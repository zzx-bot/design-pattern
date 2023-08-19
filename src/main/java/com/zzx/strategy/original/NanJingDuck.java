package com.zzx.strategy.original;

public class NanJingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("~~南京鸭~~~");
    }

    @Override
    public void fly() {
        System.out.println("~~南京鸭不会飞~~~");
    }
}

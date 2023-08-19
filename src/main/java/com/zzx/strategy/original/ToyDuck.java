package com.zzx.strategy.original;

public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("~~可达鸭~~~");
    }

    @Override
    public void quack() {
        System.out.println("可达鸭~~ 我会嘎嘎嘎 唱歌~~~");
    }

    @Override
    public void walk() {
        System.out.println("可达鸭~~ 我会跑快快！~~~");
    }

    @Override
    public void swim() {
        System.out.println("可达鸭~~ 还不会游泳");
    }

    @Override
    public void fly() {
        System.out.println("可达鸭~~ 还不会飞");
    }
}

package com.zzx.strategy.original;

public abstract class Duck {

    public Duck() {
    }

    public abstract void display();//显示鸭子信息

    public void quack() {
        System.out.println("我是鸭子 嘎嘎叫~~");
    }

    public void walk() {
        System.out.println("我是鸭子 拽拽走~~");
    }

    public void swim() {
        System.out.println("我是鸭子 会游泳~~");
    }

    public void fly() {
        System.out.println("我是鸭子 会飞翔~~~");
    }
}

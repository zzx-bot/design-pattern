package com.zzx.strategy.behavior;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞行技术很差！");
    }
}

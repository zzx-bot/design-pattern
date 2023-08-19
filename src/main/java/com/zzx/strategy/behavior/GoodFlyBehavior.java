package com.zzx.strategy.behavior;

public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞得贼快！");
    }
}

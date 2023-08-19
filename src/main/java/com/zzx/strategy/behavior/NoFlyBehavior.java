package com.zzx.strategy.behavior;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞！");
    }
}

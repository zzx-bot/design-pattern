package com.zzx.strategy.behavior;

public class BadSwimBehavior implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("吐泡泡，游泳不好");
    }
}

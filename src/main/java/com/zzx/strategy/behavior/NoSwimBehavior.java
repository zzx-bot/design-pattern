package com.zzx.strategy.behavior;

public class NoSwimBehavior implements SwimBehavior {

    @Override
    public void swim() {
        System.out.println("啊呜 不会游泳");
    }
}

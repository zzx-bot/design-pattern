package com.zzx.strategy.behavior;

public class GoodSwimBehavior implements SwimBehavior {

    @Override
    public void swim() {
        System.out.println("游得贼快！");
    }
}

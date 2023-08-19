package com.zzx.strategy.behavior;

public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("......");
    }
}

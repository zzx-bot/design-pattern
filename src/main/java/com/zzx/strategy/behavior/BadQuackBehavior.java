package com.zzx.strategy.behavior;

public class BadQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("bad，嘎嘎嘎乱叫！");
    }
}

package com.zzx.strategy;

import com.zzx.strategy.Duck;
import com.zzx.strategy.behavior.*;

public class WildDuck extends Duck {

    @Override
    public void display() {
        System.out.println("~~野鸭~~~");
    }

    public WildDuck() {
        super.setQuackBehavior(new BadQuackBehavior());
        super.setFlyBehavior(new GoodFlyBehavior());
        super.setSwimBehavior(new GoodSwimBehavior());
    }
}

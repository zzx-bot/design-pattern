package com.zzx.strategy;

import com.zzx.strategy.Duck;
import com.zzx.strategy.behavior.*;

public class ToyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("~~可达鸭~~~");
    }

    public ToyDuck() {
        super.setQuackBehavior(new NoQuackBehavior());
        super.setFlyBehavior(new NoFlyBehavior());
        super.setSwimBehavior(new NoSwimBehavior());
    }
}

package com.zzx.strategy;

import com.zzx.strategy.Duck;
import com.zzx.strategy.behavior.BadSwimBehavior;
import com.zzx.strategy.behavior.GoodQuackBehavior;
import com.zzx.strategy.behavior.GoodSwimBehavior;
import com.zzx.strategy.behavior.NoFlyBehavior;

public class NanJingDuck extends Duck {

    public NanJingDuck() {
        super.setQuackBehavior(new GoodQuackBehavior());
        super.setFlyBehavior(new NoFlyBehavior());
//        super.setSwimBehavior(new BadSwimBehavior());
    }

    @Override
    public void display() {
        System.out.println("~~南京鸭~~~");
    }
}

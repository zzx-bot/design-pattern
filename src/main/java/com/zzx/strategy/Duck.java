package com.zzx.strategy;

import com.zzx.strategy.behavior.FlyBehavior;
import com.zzx.strategy.behavior.QuackBehavior;
import com.zzx.strategy.behavior.SwimBehavior;

public abstract class Duck {
    //属性,
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    private SwimBehavior swimBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public SwimBehavior getSwimBehavior() {
        return swimBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public Duck() {
    }

    public abstract void display();//显示鸭子信息

    public void quack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void swim() {
        if (swimBehavior != null) {
            swimBehavior.swim();
        }
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}

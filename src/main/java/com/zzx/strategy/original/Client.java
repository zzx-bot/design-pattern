package com.zzx.strategy.original;

public class Client {
    public static void main(String[] args) {
        NanJingDuck nanJingDuck = new NanJingDuck();
        ToyDuck toyDuck = new ToyDuck();
        WildDuck wildDuck = new WildDuck();
        nanJingDuck.display();
        nanJingDuck.quack();
        nanJingDuck.walk();
        nanJingDuck.swim();
        nanJingDuck.fly();

        toyDuck.display();
        toyDuck.quack();
        toyDuck.walk();
        toyDuck.swim();
        toyDuck.fly();

        wildDuck.display();
        wildDuck.quack();
        wildDuck.walk();
        wildDuck.swim();
        wildDuck.fly();
    }
}

package com.zzx.strategy;


public class Client {
    public static void main(String[] args) {
        NanJingDuck nanJingDuck = new NanJingDuck();
        ToyDuck toyDuck = new ToyDuck();
        WildDuck wildDuck = new WildDuck();
        nanJingDuck.display();
        nanJingDuck.quack();
        nanJingDuck.swim();
        nanJingDuck.fly();

        toyDuck.display();
        toyDuck.quack();
        toyDuck.swim();
        toyDuck.fly();

        wildDuck.display();
        wildDuck.quack();
        wildDuck.swim();
        wildDuck.fly();
    }
}

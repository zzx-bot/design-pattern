package com.zzx.decorator;

public class Decorator extends Drink {
    Drink drink;

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }


    public String getDescription() {
        return super.getDescription() + drink.getDescription();
    }

    public Decorator(Drink drink) {
        this.drink = drink;
    }
}

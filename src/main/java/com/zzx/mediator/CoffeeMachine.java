package com.zzx.mediator;

public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        super.getMediator().getMessage(stateChange, getName());
    }

    public void StartCoffee() {
        System.out.println("It's time to start coffee machine!");
    }

    public void FinishCoffee() {
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        this.sendMessage(0);
    }
}

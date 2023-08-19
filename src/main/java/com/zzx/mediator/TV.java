package com.zzx.mediator;

public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }

    public void StartTv() {
        System.out.println("It's time to StartTV");
    }

    public void StopTv() {
        System.out.println("It's time to StopTv");
    }
}

package com.zzx.mediator;

//同事抽象类
public abstract class Colleague {
    private Mediator mediator;

    private String name;

    public Mediator getMediator() {
        return this.mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(int stateChange);
}

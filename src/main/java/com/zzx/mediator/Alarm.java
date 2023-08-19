package com.zzx.mediator;

public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建 Alarm 同事对象时，将自己放入到 ConcreteMediator 对象中[集合]
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用的中介者对象的 getMessage
        super.getMediator().getMessage(stateChange, this.getName());
    }

    public void SendAlarm(int stateChange) {
        sendMessage(stateChange);
    }
}

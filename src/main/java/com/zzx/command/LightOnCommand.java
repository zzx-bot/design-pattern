package com.zzx.command;

public class LightOnCommand implements Command {
    // 聚合 LightReceive
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        this.lightReceiver.on();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        this.lightReceiver.off();
    }
}

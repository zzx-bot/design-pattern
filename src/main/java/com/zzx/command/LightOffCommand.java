package com.zzx.command;

public class LightOffCommand implements Command {
    // 聚合 LightReceive
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.off();
    }

    @Override
    public void undo() {
        this.lightReceiver.on();
    }
}

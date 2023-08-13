package com.zzx.command;

public class TVOffCommand implements Command {
    // 聚合 TVReceiver  电视
    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        this.tvReceiver.off();
    }

    @Override
    public void undo() {
        this.tvReceiver.on();
    }
}

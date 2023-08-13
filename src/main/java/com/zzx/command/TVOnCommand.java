package com.zzx.command;

public class TVOnCommand implements Command {
    // 聚合 电视 TVReceiver
    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        this.tvReceiver.on();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        this.tvReceiver.off();
    }
}

package com.zzx.command;

public class Client {
    public static void main(String[] args) {
        // 命令接收者
        LightReceiver lightReceiver = new LightReceiver();

        // 命令传递
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        //命令发出  0 代表是遥控电视命令
        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        System.out.println("--------按下电灯的开按钮-----------");
        remoteController.onButtonWasPushed(0);
        System.out.println("--------按下电灯的关按钮-----------");
        remoteController.offButtonWasPushed(0);
        System.out.println("--------按下电灯的撤销-----------");
        remoteController.undoButtonWasPushed();


        // 命令接收者
        TVReceiver tvReceiver = new TVReceiver();

        // 命令传递
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        //命令发出  1 代表是遥控电视命令

        remoteController.setCommand(1, tvOffCommand, tvOnCommand);
        System.out.println("--------按下电视机的开按钮-----------");
        remoteController.onButtonWasPushed(1);
        System.out.println("--------按下电视机的关按钮-----------");
        remoteController.offButtonWasPushed(1);
        System.out.println("--------按下电视机的撤销-----------");
        remoteController.undoButtonWasPushed();

        remoteController.offButtonWasPushed(3);
    }
}

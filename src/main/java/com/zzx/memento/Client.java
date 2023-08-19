package com.zzx.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态#1  攻击力100");
        //保存了当前的状态 1
        caretaker.add(originator.saveStateMemento());
        System.out.println("1 当前状态：" + originator.getState());

        originator.setState("状态#2  攻击力77");
        //保存了当前的状态 2
        caretaker.add(originator.saveStateMemento());
        System.out.println("2 当前状态：" + originator.getState());

        originator.setState("状态#3  攻击力66");
        //保存了当前的状态 2
        caretaker.add(originator.saveStateMemento());
        System.out.println("3 当前状态：" + originator.getState());

        // 恢复到第一个状态
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复到第一个状态：" + originator.getState());
    }
}

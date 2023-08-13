package com.zzx.visitor;

public class Woman implements Person {
    private String name;
    private Action action;

    @Override
    public void accept(Action action) {
        this.action = action;
    }

    public void print(Action action) {
        System.out.println(this.name);
    }
}

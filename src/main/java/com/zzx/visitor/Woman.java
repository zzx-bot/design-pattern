package com.zzx.visitor;

public class Woman implements Person {
    private String name;
    private Action action;

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public void accept(Action action) {
        this.action = action;
    }

    public void print() {
        System.out.println(this.name + " " + this.getClass().getSimpleName() + ": " + this.action.getClass().getSimpleName());
    }
}

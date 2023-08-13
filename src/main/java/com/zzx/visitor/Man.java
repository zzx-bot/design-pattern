package com.zzx.visitor;

public class Man implements Person {
    private Action action;
    private String name;

    public Man(String name) {
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

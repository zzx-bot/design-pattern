package com.zzx.visitor;

public class Man implements Person {
    private String name;
    private Action action;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void accept(Action action) {
        this.action = action;
        action.getManResult(this);
    }

    public void print() {
        System.out.println(this.name + " " + this.getClass().getSimpleName() + ": " + this.action.getClass().getSimpleName());
    }
}

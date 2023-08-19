package com.zzx.visitor;

public class Woman implements Person {
    private String name;

    private Action action;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public void accept(Action action) {
        this.action = action;
        action.getWomanResult(this);
    }

    public void print() {
        System.out.println(this.name + " " + this.getClass().getSimpleName() + ": " + this.action.getClass().getSimpleName());
    }
}

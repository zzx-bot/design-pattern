package com.zzx.visitor;

public class Man implements Person {
    private Action action;

    @Override
    public void accept(Action action) {
        this.action = action;
    }
}

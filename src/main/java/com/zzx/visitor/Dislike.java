package com.zzx.visitor;

public class Dislike implements Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男人" + man.getName() + "点了个踩");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人" + woman.getName() + "点了个踩");
    }
}

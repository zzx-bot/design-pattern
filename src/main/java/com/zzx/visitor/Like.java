package com.zzx.visitor;

public class Like implements Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人" + man.getName() + "点了个赞");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("男人" + woman.getName() + "点了个赞");
    }
}

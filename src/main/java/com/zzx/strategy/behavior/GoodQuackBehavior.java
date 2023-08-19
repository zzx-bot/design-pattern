package com.zzx.strategy.behavior;

public class GoodQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("ga ga 好 ,曲颈向天歌");
    }
}

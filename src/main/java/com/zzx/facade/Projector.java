package com.zzx.facade;

public class Projector {

    private static Projector projector;

    public static Projector getProjector() {
        if (projector == null)
            projector = new Projector();
        return projector;
    }

    public void on() {
        System.out.println("Projector on  开投影");
    }

    public void off() {
        System.out.println("Projector off  关投影");
    }

    public void focus() {
        System.out.println("Projector focus  聚焦好投影");
    }

    public void zoom() {
        System.out.println("Projector zoom  投影缩放到适合位置");
    }
}

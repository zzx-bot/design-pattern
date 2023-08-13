package com.zzx.facade;

public class Screen {

    private static Screen screen;

    public static Screen getScreen() {
        if (screen == null) {
            synchronized (Screen.class) {
                if (screen == null) {
                    screen = new Screen();
                }
            }
        }
        return screen;
    }

    public void up() {
        System.out.println("Screen up  幕布起");
    }

    public void down() {
        System.out.println("Screen down  下幕布");
    }
}

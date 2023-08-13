package com.zzx.facade;

public class Stereo {
    private static Stereo stereo;

    public static Stereo getScreen() {
        if (stereo == null) {
            synchronized (Stereo.class) {
                stereo = new Stereo();
            }
        }
        return stereo;
    }

    public void on() {
        System.out.println("Stereo on  开音响");
    }

    public void off() {
        System.out.println("Stereo off 关音响");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume  调节音响声音" + volume);
    }
}

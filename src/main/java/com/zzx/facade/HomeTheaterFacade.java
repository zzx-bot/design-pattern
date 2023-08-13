package com.zzx.facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;

    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getDvdPlayer();
        this.popcorn = Popcorn.getPopcorn();
        this.projector = Projector.getProjector();
        this.screen = Screen.getScreen();
        this.stereo = Stereo.getScreen();
        this.theaterLight = TheaterLight.getTheaterLight();
    }

    public void redy() {
        System.out.println("家庭影院预备备！ 各部门注意");
        popcorn.on();
        popcorn.pop();

        screen.down();
        projector.on();
        projector.focus();
        projector.zoom();

        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play() {
        System.out.println("\n开始播放影片");
        dvdPlayer.play();
    }

    public void pause() {
        System.out.println("\n暂停一下");
        dvdPlayer.pause();
    }

    public void end() {
        System.out.println("\n完结撒花！");
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
        popcorn.off();
    }
}

package edu.umb.cs680.hw06;

public class DrawerClosedPlaying implements State {
    private DrawerClosedPlaying() { };

    private static DrawerClosedPlaying dvdPlayer = null;

    public static DrawerClosedPlaying getInstance() {
        if (dvdPlayer == null) {
            dvdPlayer = new DrawerClosedPlaying();
        }
        return dvdPlayer;
    }

    @Override
    public void openCloseButtonPushed() {
        System.out.println("Doing nothing");
    }

    @Override
    public void playButtonPushed() {
        System.out.println("Doing nothing");
    }

    @Override
    public void stopButtonPushed() {
        DVDPlayer.stop();
        DVDPlayer.changeState(DrawerClosedNotPlaying.getInstance());
    }
}

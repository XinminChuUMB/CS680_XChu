package edu.umb.cs680.hw06;

public class DrawerOpen implements State {

    private DrawerOpen() { };

    private static DrawerOpen dvdPlayer = null;

    public static DrawerOpen getInstance( ) {
        if (dvdPlayer == null) {
            dvdPlayer = new DrawerOpen();
        }
        return dvdPlayer;
    }

    @Override
    public void openCloseButtonPushed() {
        DVDPlayer.close();
        DVDPlayer.changeState(DrawerClosedNotPlaying.getInstance());
    }

    @Override
    public void playButtonPushed() {
        DVDPlayer.close();
        DVDPlayer.play();
        DVDPlayer.changeState(DrawerClosedPlaying.getInstance());
    }

    @Override
    public void stopButtonPushed() {
        System.out.println("Doing nothing");
    }

}
package edu.umb.cs680.hw06;

public class DrawerClosedNotPlaying implements State {
    private  DrawerClosedNotPlaying(){ };

    private static DrawerClosedNotPlaying dvdPlayer = null;

    public static DrawerClosedNotPlaying getInstance(){
        if (dvdPlayer == null) {
            dvdPlayer = new DrawerClosedNotPlaying();
        }
        return  dvdPlayer;
    }


    @Override
    public void openCloseButtonPushed() {
        DVDPlayer.open();
        DVDPlayer.changeState(DrawerOpen.getInstance());
    }

    @Override
    public void playButtonPushed() {
        System.out.println("Doing nothing");
    }

    @Override
    public void stopButtonPushed() {
        System.out.println("Doing nothing");
    }
}

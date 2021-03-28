package edu.umb.cs680.hw06;

public class DVDPlayer {
    private static DVDPlayer dvdPlayer = null;
    public static State state;

    private DVDPlayer() { };

    public static DVDPlayer getInstance() {
        if (dvdPlayer == null) {
            dvdPlayer = new DVDPlayer();
            state = DrawerClosedNotPlaying.getInstance();
        }
        return dvdPlayer;
    }

    public static State getState() {
        return DVDPlayer.state;
    }

    public static State changeState(State state) {
        DVDPlayer.state = state;
        return DVDPlayer.state;
    }

    public static void openCloseButtonPushed() {
        state.openCloseButtonPushed();
    }

    public static void playButtonPushed() {
        state.playButtonPushed();
    }

    public static void stopButtonPushed() {
        state.stopButtonPushed();
    }

    public static void open() {
        System.out.print("Open the drawer.");
    }

    public static void close() {
        System.out.print("Close the drawer.");
    }

    public static void play() {
        System.out.print("Play.");
    }

    public static void stop() {
        System.out.print("Stop.");
    }
}

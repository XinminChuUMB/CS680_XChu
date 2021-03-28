package edu.umb.cs680.hw06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DrawerClosedPlayingTest {
    @Test
    public void InstanceEquivalentTest() {
        DrawerClosedPlaying d1= DrawerClosedPlaying.getInstance();
        DrawerClosedPlaying d2 = DrawerClosedPlaying.getInstance();
        assertSame(d1, d2);
    }

    @Test
    public void openCloseButtonPushedTest() {
        DVDPlayer.changeState(DrawerClosedPlaying.getInstance());
        DrawerClosedPlaying.getInstance().openCloseButtonPushed();
        State actual7 = DVDPlayer.getState();
        State expected7 = DrawerClosedPlaying.getInstance();
        assertEquals(actual7,expected7);
    }

    @Test
    public void playButtonPushedTest() {
        DVDPlayer.changeState(DrawerClosedPlaying.getInstance());
        DrawerClosedPlaying.getInstance().playButtonPushed();
        State actual8 = DVDPlayer.getState();
        State expected8 = DrawerClosedPlaying.getInstance();
        assertEquals(actual8,expected8);
    }

    @Test
    public void stopButtonPushedTest() {
        DVDPlayer.changeState(DrawerClosedPlaying.getInstance());
        DrawerClosedPlaying.getInstance().stopButtonPushed();
        State actual9 = DVDPlayer.getState();
        State expected9 = DrawerClosedNotPlaying.getInstance();
        assertEquals(actual9,expected9);
    }

}
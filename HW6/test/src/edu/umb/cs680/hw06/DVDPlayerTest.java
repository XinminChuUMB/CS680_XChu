package edu.umb.cs680.hw06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DVDPlayerTest {
    @Test
    public void getInstanceD1AndD2() {
        DVDPlayer d1 = DVDPlayer.getInstance();
        DVDPlayer d2 = DVDPlayer.getInstance();
        assertSame(d1, d2);
    }

    @Test
    public void openCloseButtonPushedTest() {
        DVDPlayer.changeState(DrawerClosedNotPlaying.getInstance());
        DVDPlayer.openCloseButtonPushed();
        State actual = DVDPlayer.getState();
        State expected = DrawerOpen.getInstance();
        assertEquals(actual,expected);
    }

    @Test
    public void playButtonPushedTest() {
        DVDPlayer.changeState(DrawerOpen.getInstance());
        DVDPlayer.playButtonPushed();
        State actual = DVDPlayer.getState();
        State expected = DrawerClosedPlaying.getInstance();
        assertEquals(actual,expected);
    }

    @Test
    public void stopButtonPushedTest() {
        DVDPlayer.changeState(DrawerClosedPlaying.getInstance());
        DVDPlayer.stopButtonPushed();
        State actual = DVDPlayer.getState();
        State expected = DrawerClosedNotPlaying.getInstance();
        assertEquals(actual,expected);
    }



}
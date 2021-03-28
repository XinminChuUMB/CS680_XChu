package edu.umb.cs680.hw06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DrawerClosedNotPlayingTest {
    @Test
    public void InstanceEquivalentTest() {
        DrawerClosedNotPlaying d1 = DrawerClosedNotPlaying.getInstance();
        DrawerClosedNotPlaying d2 = DrawerClosedNotPlaying.getInstance();
        assertSame(d1, d2);
    }

    @Test
    public void openCloseButtonPushedTest() {
        DVDPlayer.changeState(DrawerClosedNotPlaying.getInstance());
        DrawerClosedNotPlaying.getInstance().openCloseButtonPushed();
        State actual1 = DVDPlayer.getState();
        State expected1 = DrawerOpen.getInstance();
        assertEquals(actual1,expected1);
    }

    @Test
    public void playButtonPushedTest() {
        DVDPlayer.changeState(DrawerClosedNotPlaying.getInstance());
        DrawerClosedNotPlaying.getInstance().playButtonPushed();
        State actual2 = DVDPlayer.getState();
        State expected2 = DrawerClosedNotPlaying.getInstance();
        assertEquals(actual2,expected2);
    }

    @Test
    public void stopButtonPushedTest() {
        DVDPlayer.changeState(DrawerClosedNotPlaying.getInstance());
        DrawerClosedNotPlaying.getInstance().stopButtonPushed();
        State actual3 = DVDPlayer.getState();
        State expected3 = DrawerClosedNotPlaying.getInstance();
        assertEquals(actual3,expected3);
    }


}
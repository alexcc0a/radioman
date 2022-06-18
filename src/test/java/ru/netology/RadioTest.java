package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test

    void shouldCurrentStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStations(0);
        int expected = 0;
        int actual = radio.getCurrentStations();
        assertEquals(expected, actual);
    }

    @Test

    void shouldCurrentStationMoreMin() {
        Radio radio = new Radio();
        radio.setCurrentStations(1);
        int expected = 1;
        int actual = radio.getCurrentStations();
        assertEquals(expected, actual);
    }

    @Test

    void shouldCurrentStationBelowMain() {
        Radio radio = new Radio();
        radio.setCurrentStations(-1);
        int expected = 0;
        int actual = radio.getCurrentStations();
        assertEquals(expected, actual);
    }

    @Test

    void shouldCurrentStationAverage() {
        Radio radio = new Radio();
        radio.setCurrentStations(5);
        int expected = 5;
        int actual = radio.getCurrentStations();
        assertEquals(expected, actual);
    }

    @Test

    void shouldCurrentBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentStations(8);
        int expected = 8;
        int actual = radio.getCurrentStations();
        assertEquals(expected, actual);
    }

    @Test

    void shouldCurrentStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStations(9);
        int expected = 9;
        int actual = radio.getCurrentStations();
        assertEquals(expected, actual);
    }

    @Test

    void shouldCurrentStationMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentStations(10);
        int expected = 0;
        int actual = radio.getCurrentStations();
        assertEquals(expected, actual);
    }


    @Test

    void shouldButtonNextReturnToZero() {
        Radio radio = new Radio();
        radio.setCurrentStations(9);
        radio.nextStations();
        int expected = 0;
        int actual = radio.getCurrentStations();
        assertEquals(expected, actual);
    }

    @Test

    void shouldButtonNextSwitchNext() {
        Radio radio = new Radio();
        radio.setCurrentStations(1);
        radio.nextStations();
        int expected = 2;
        int actual = radio.getCurrentStations();
        assertEquals(expected, actual);
    }

    @Test

    void shouldButtonPrevBackToLast() {
        Radio radio = new Radio();
        radio.setCurrentStations(0);
        radio.prevStations();
        int expected = 9;
        int actual = radio.getCurrentStations();
        assertEquals(expected, actual);
    }

    @Test

    void shouldButtonPrevBelowLast() {
        Radio radio = new Radio();
        radio.setCurrentStations(9);
        radio.prevStations();
        int expected = 8;
        int actual = radio.getCurrentStations();
        assertEquals(expected, actual);
    }

    @Test

    void shouldButtonSwitchToStart() {
        Radio radio = new Radio();
        radio.setCurrentStations(1);
        radio.prevStations();
        int expected = 0;
        int actual = radio.getCurrentStations();
        assertEquals(expected, actual);
    }

    @Test

    void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    void shouldIncreaseVolumeStayOnMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    void shouldIncreaseVolumeHigherMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    void shouldDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    void shouldDecreaseVolumeStayOnMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    void shouldDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}

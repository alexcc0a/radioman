package ru.netology;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void selectCurrentStationZero() {
        radio.setCurrentStations(0);
        Assertions.assertEquals(0, radio.getCurrentStations());
    }

    @Test /* Constructor */
    void newSelectCurrentStationZero() {
        Radio radioNew = new Radio(15);
        radioNew.setCurrentStations(0);
        Assertions.assertEquals(0, radioNew.getCurrentStations());
    }

    @Test
    void selectCurrentStationOne() {
        radio.setCurrentStations(1);
        Assertions.assertEquals(1, radio.getCurrentStations());
    }

    @Test /* Constructor */
    void newSelectCurrentStationOne() {
        Radio radioNew = new Radio(15);
        radioNew.setCurrentStations(1);
        Assertions.assertEquals(1, radioNew.getCurrentStations());
    }

    @Test
    void selectCurrentStationMinus() {
        radio.setCurrentStations(-1);
        Assertions.assertEquals(0, radio.getCurrentStations());
    }

    @Test /* Constructor */
    void newSelectCurrentStationMinus() {
        Radio radioNew = new Radio(15);
        radioNew.setCurrentStations(-1);
        Assertions.assertEquals(0, radioNew.getCurrentStations());
    }

    @Test
    void selectCurrentStationAverage() {
        radio.setCurrentStations(5);
        Assertions.assertEquals(5, radio.getCurrentStations());
    }

    @Test /* Constructor */
    void newSelectCurrentStationAverage() {
        Radio radioNew = new Radio(15);
        radioNew.setCurrentStations(5);
        Assertions.assertEquals(5, radioNew.getCurrentStations());
    }

    @Test
    void selectCurrentStationPenult() {
        radio.setCurrentStations(8);
        Assertions.assertEquals(8, radio.getCurrentStations());
    }

    @Test /* Constructor */
    void newSelectCurrentStationPenult() {
        Radio radioNew = new Radio(15);
        radioNew.setCurrentStations(13);
        Assertions.assertEquals(13, radioNew.getCurrentStations());
    }

    @Test
    void selectCurrentStationLast() {
        radio.setCurrentStations(9);
        Assertions.assertEquals(9, radio.getCurrentStations());
    }

    @Test /* Constructor */
    void newSelectCurrentStationLast() {
        Radio radioNew = new Radio(15);
        radioNew.setCurrentStations(14);
        Assertions.assertEquals(14, radioNew.getCurrentStations());
    }

    @Test
    void selectCurrentStationBeyond() {
        radio.setCurrentStations(10);
        Assertions.assertEquals(0, radio.getCurrentStations());
    }

    @Test /* Constructor */
    void newSelectCurrentStationBeyond() {
        Radio radioNew = new Radio(15);
        radioNew.setCurrentStations(15);
        Assertions.assertEquals(0, radioNew.getCurrentStations());
    }

    /* Использование кнопки Next */
    @Test
    void usingButtonNextReturnToZero() {
        radio.setCurrentStations(9);
        radio.nextStations();
        Assertions.assertEquals(0, radio.getCurrentStations());
    }

    @Test /* Constructor */
    void NewUsingButtonNextReturnToZero() {
        Radio radioNew = new Radio(15);
        radioNew.setCurrentStations(14);
        radioNew.nextStations();
        Assertions.assertEquals(0, radioNew.getCurrentStations());
    }

    @Test
    void usingButtonNextSwitchNext() {
        radio.setCurrentStations(1);
        radio.nextStations();
        Assertions.assertEquals(2, radio.getCurrentStations());
    }

    @Test /* Constructor */
    void newUsingButtonNextSwitchNext() {
        Radio radioNew = new Radio(15);
        radioNew.setCurrentStations(1);
        radioNew.nextStations();
        Assertions.assertEquals(2, radioNew.getCurrentStations());
    }

    /*Использование кнопки Prev */
    @Test
    void usingButtonPrevBackToLast() {
        radio.setCurrentStations(0);
        radio.prevStations();
        Assertions.assertEquals(9, radio.getCurrentStations());
    }

    @Test /* Constructor */
    void newUsingButtonPrevBackToLast() {
        Radio radioNew = new Radio(15);
        radioNew.setCurrentStations(0);
        radioNew.prevStations();
        Assertions.assertEquals(14, radioNew.getCurrentStations());
    }

    @Test
    void usingButtonPrevBelowLast() {
        radio.setCurrentStations(9);
        radio.prevStations();
        Assertions.assertEquals(8, radio.getCurrentStations());
    }

    @Test /* Constructor */
    void newUsingButtonPrevBelowLast() {
        Radio radioNew = new Radio(15);
        radioNew.setCurrentStations(14);
        radioNew.prevStations();
        Assertions.assertEquals(13, radioNew.getCurrentStations());
    }

    @Test
    void usingButtonSwitchToStart() {
        radio.setCurrentStations(1);
        radio.prevStations();
        Assertions.assertEquals(0, radio.getCurrentStations());
    }

    @Test /* Constructor */
    void newUsingButtonSwitchToStart() {
        Radio radioNew = new Radio(15);
        radioNew.setCurrentStations(1);
        radioNew.prevStations();
        Assertions.assertEquals(0, radioNew.getCurrentStations());
    }

    /* Увеличение звука. Кнопка + */
    @Test
    void increaseVolumeMax() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeStayOnMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeAboveMax() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    /* Уменьшение звука. Кнопка - */
    @Test
    void decreaseVolumeMin() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeStayOnMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeBeyondLimitZero() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
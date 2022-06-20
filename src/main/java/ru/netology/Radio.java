package ru.netology;

public class Radio {
    private int currentStations;
    private final int totalStations = 10;
    private int maxStations = totalStations - 1;
    private int minStations;
    private int currentVolume;
    private final int maxVolume = 100;
    private int minVolume;

    public Radio() {
    }

    public Radio(int totalStations) {
        this.maxStations = totalStations - 1;
    }

    public int getCurrentStations() {
        return this.currentStations;
    }

    public void setCurrentStations(int currentStations) {
        if (currentStations < minStations) {
            return;
        }
        if (currentStations > maxStations) {
            return;
        }
        this.currentStations = currentStations;
    }

    public void nextStations() {
        if (currentStations == maxStations) {
            this.currentStations = minStations;
            return;
        }
        this.currentStations++;
    }

    public void prevStations() {
        if (currentStations == minStations) {
            this.currentStations = maxStations;
            return;
        }
        this.currentStations--;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            this.currentVolume--;
        }
    }
}
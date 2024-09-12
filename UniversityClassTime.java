package main;

import java.time.LocalTime;

public class UniversityClassTime {
    private LocalTime startTime;
    private LocalTime stopTime;

    /*public main.UniversityClassTime(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.stopTime = endTime;
    }*/
    public LocalTime getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalTime startTime) {this.startTime = startTime;}
    public LocalTime getStopTime() {
        return stopTime;
    }
    public void setStopTime(LocalTime stopTime) {this.stopTime = stopTime;}

    public boolean timeBetween(LocalTime time) {
        if (time.isAfter(startTime) && time.isBefore(stopTime)) {
            return true;
        } else {
            return false;
        }

    }
}
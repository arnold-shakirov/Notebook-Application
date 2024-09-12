package main;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;

public class UniversityClass {
    private String name;
    private HashMap<String, UniversityClassTime> classTimes;



    public HashMap<String, UniversityClassTime> getClassTimes() {return classTimes;}
    public void setClassTimes(HashMap<String, UniversityClassTime> classTimes) {this.classTimes = classTimes;}
    public void addClassDayAndTime(String day, LocalTime startTime, LocalTime stopTime) {
        UniversityClassTime universityClassTime= new UniversityClassTime();
        universityClassTime.setStartTime(startTime);
        universityClassTime.setStopTime(stopTime);
        classTimes.put(day, universityClassTime);
    }
    public UniversityClass(){
        classTimes = new HashMap<>();
    }

    public boolean dateTimeMatches(LocalDateTime noteTime) {
        return false;

    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}


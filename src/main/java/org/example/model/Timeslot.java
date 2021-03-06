package org.example.model;

import org.example.model.Doctor;

import java.time.LocalDate;

public class Timeslot {

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minutes;
    private int startMinute;
    private int endMinute;
    Doctor doctor;
    /* isFree is true when the timeslot is free/available and false when it has been booked*/
    private boolean isFree;


    public Timeslot(int day, int month, int year, int hour, int minutes, int startMinute, int endMinute, Doctor doctor) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = minutes;
        this.startMinute = startMinute;
        this.endMinute = endMinute;
        this.doctor = doctor;
        isFree = true;
    }

    public int getDay() {return day;}
    public int getMonth() {return month;}
    public int getYear() {return year;}
    public int getHour() {return hour;}
    public int getMinutes() {return minutes;}
    public int getStartMinute() {return startMinute;}
    public int getEndMinute() {return endMinute;}
    public Doctor getDoctor() {return doctor;}
    public void setDay(int day) {this.day = day;}
    public void setMonth(int month) {this.month = month;}
    public void setYear(int year) {this.year = year;}
    public void setHour(int hour) {this.hour = hour;}
    public void setMinutes(int minutes) {this.minutes = minutes;}
    public void setStartMinute(int startMinute) {this.startMinute = startMinute;}
    public void setEndMinute(int endMinute) {this.endMinute = endMinute;}
    public void setDoctor(Doctor doctor) {this.doctor = doctor;}

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return "Timeslot{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", hour=" + hour +
                ", minutes=" + minutes +
                ", startMinute=" + startMinute +
                ", endMinute=" + endMinute +
                ", doctor=" + doctor +
                '}';
    }
    //Gets the local date
    public LocalDate getLocalDate() {
        return LocalDate.of(year,month,day);

    }
}

package org.example.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Timeslot {

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minutes;
    private int startMinute;
    private int endMinute;


    public Timeslot(int day, int month, int year, int hour, int minutes, int startMinute, int endMinute) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = minutes;
        this.startMinute = startMinute;
        this.endMinute = endMinute;
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
                '}';
    }

    public LocalDate getLocalDate() {
        return LocalDate.of(year, month, day);

    }
}

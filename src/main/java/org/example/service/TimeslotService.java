package org.example.service;

import org.example.model.Timeslot;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class TimeslotService {

    private static List<Timeslot> timeslotList = new ArrayList<>();

    public static List<Timeslot> getTimeslotList() {
        return timeslotList;
    }

    public static void setTimeslotList(List<Timeslot> timeslotList) {
        TimeslotService.timeslotList = timeslotList;
    }

    public void addTimeslot(Timeslot timeslot){
        timeslotList.add(timeslot);
    }
}

package org.example.model;

import java.util.ArrayList;

public class VaccinationCenter {
    private String code;
    private String address;
    private ArrayList<Timeslot> timeslots;

    ArrayList<Reservation> reservations = new ArrayList<>();

    public VaccinationCenter(String code, String address, ArrayList<Timeslot> timeslots) {
        this.code = code;
        this.address = address;
        this.timeslots = timeslots;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Timeslot> getTimeslots() {
        return timeslots;
    }

    public void setTimeslots(ArrayList<Timeslot> timeslots) {
        this.timeslots = timeslots;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void printOpenDates(){
        System.out.println("The available dates of the " + code + " vaccination center are: ");
        for (Reservation rev : reservations){
            if (reservations.isEmpty()) {
                continue;
            }
            System.out.println(timeslots);
        }
    }
}

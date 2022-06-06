package org.example;

import java.util.ArrayList;

public class Doctor {
    String amka;
    String name;
    String surname;
    ArrayList<Timeslot> timeslots;

    public Doctor(String amka, String name, String surname, ArrayList<Timeslot> timeslots) {
        this.amka = amka;
        this.name = name;
        this.surname = surname;
        this.timeslots = timeslots;
    }

    public String getAmka() {return amka;}
    public void setAmka(String amka) {this.amka = amka;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public ArrayList<Timeslot> getTimeslots() {return timeslots;}
    public void setTimeslots(ArrayList<Timeslot> timeslots) {this.timeslots = timeslots;}
}

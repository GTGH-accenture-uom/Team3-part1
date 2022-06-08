package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor {
    String amka;
    String name;
    String surname;
    ArrayList<Timeslot> timeslots;
    ArrayList<Vaccination> vaccinations = new ArrayList<>();

    public Doctor(String amka, String name, String surname, ArrayList<Timeslot> timeslots) {
        this.amka = amka;
        this.name = name;
        this.surname = surname;
        this.timeslots = timeslots;
    }

    public Doctor(String amka, String name, String surname) {
        this.amka = amka;
        this.name = name;
        this.surname = surname;
        this.timeslots = timeslots;
        timeslots = new ArrayList<>();

    }

    public String getAmka() {return amka;}
    public void setAmka(String amka) {this.amka = amka;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public ArrayList<Timeslot> getTimeslots() {return timeslots;}
    public void setTimeslots(ArrayList<Timeslot> timeslots) {this.timeslots = timeslots;}

    public void addTimeslot(Timeslot timeslot){
        this.timeslots.add(timeslot);
    }

    public void vaccinate(Reservation reservation){
        //todo setDone() method in reservation class
        reservation.setDone(true);
        Insured insured = reservation.getInsuredPerson();
        Timeslot timeslot = reservation.getTimeslot();
        //TODO getLocalDate() method in timeslot Class
        LocalDate vacc_date = timeslot.getLocalDate();
        //set the expiration date two months after the vaccination date (subject to change)
        LocalDate expiration_date = vacc_date.plusMonths(2);
        Vaccination vaccination = new Vaccination(insured,this,vacc_date, expiration_date);
        vaccinations.add(vaccination);
        }

    public void printDoneVaccinations(){
        System.out.println("Vaccinations of Dr " + name +" " +surname +":");
        for (Vaccination vacc: vaccinations) {
            System.out.println(vacc.getVaccinationDate() +" : " +vacc.getInsuredPerson().getName() + " " + vacc.getInsuredPerson().getName());
        }
    }
}
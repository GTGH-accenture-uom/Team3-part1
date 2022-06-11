package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String amka;
    private String name;
    private String surname;
    private ArrayList<Timeslot> timeslots;
    private ArrayList<Vaccination> vaccinations = new ArrayList<>();


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

    public void addVaccination(Vaccination vaccination){
        vaccinations.add(vaccination);
    }
    @Override
    public String toString() {
        return "Doctor{" +
                "amka='" + amka + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


    public List<String> printDoneVaccinations(){
        List<String> results = new ArrayList<>();
        results.add("Vaccinations of Dr " + name +" " +surname +":");
        System.out.println(results.get(0));
        for (Vaccination vacc: vaccinations) {
            results.add((vacc.getVaccinationDate() +" : " +vacc.getInsuredPerson().getName() + " " + vacc.getInsuredPerson().getSurname()).toString());
            System.out.println(vacc.getVaccinationDate() +" : " +vacc.getInsuredPerson().getName() + " " + vacc.getInsuredPerson().getSurname());
        }
        return results;
    }
}
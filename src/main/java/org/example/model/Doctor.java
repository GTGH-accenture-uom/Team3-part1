package org.example.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class Doctor {
    private String amka;
    private String name;
    private String surname;
    private List<Timeslot> timeslots;
    private List<Vaccination> vaccinations = new ArrayList<>();

    public Doctor(String amka, String name, String surname, List<Timeslot> timeslots) {
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


    public void addTimeslot(Timeslot timeslot){
        this.timeslots.add(timeslot);
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "amka='" + amka + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


    public void printDoneVaccinations(){
        System.out.println("Vaccinations of Dr " + name +" " +surname +":");
        for (Vaccination vacc: vaccinations) {
            System.out.println(vacc.getVaccinationDate() +" : " +vacc.getInsuredPerson().getName() + " " + vacc.getInsuredPerson().getName());
        }
    }

}
package org.example.model;

import java.util.ArrayList;

public class Reservation {
    Insured insuredPerson;
    Timeslot timeslot;
    Boolean isDone = false;
    VaccinationCenter vaccinationCenter;

    public Reservation(Insured insuredPerson, Timeslot timeslot,VaccinationCenter vaccinationCenter) {
        this.insuredPerson = insuredPerson;
        this.timeslot = timeslot;
        this.vaccinationCenter = vaccinationCenter;
    }
    public Insured getInsuredPerson() {
        return insuredPerson;
    }
    public void setInsuredPerson(Insured insuredPerson) {
        this.insuredPerson = insuredPerson;
    }
    public Timeslot getTimeslot() {
        return timeslot;
    }
    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    public void setDone(boolean b) {
        isDone = b;
    }

    public VaccinationCenter getVaccinationCenter() {
        return vaccinationCenter;
    }

    public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
        this.vaccinationCenter = vaccinationCenter;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "insuredPerson=" + insuredPerson +
                ", timeslot=" + timeslot +
                ", isDone=" + isDone +
                ", vaccinationCenter=" + vaccinationCenter +
                '}';
    }

/*
    public void printFutureReservations(){
        System.out.println("The coming vaccination dates are: " );
        for (Reservation rev : reservations){
            if (!reservations.isEmpty()){
                System.out.println(timeslot);
            }
        }
    }

     */
}

package org.example.model;

import java.util.ArrayList;

public class Reservation {
    Insured insuredPerson;
    Timeslot timeslot;
    Boolean isDone = false;
    ArrayList<Reservation> reservations = new ArrayList<>(); //αυτο γιατι;

    public Reservation(Insured insuredPerson, Timeslot timeslot) {
        this.insuredPerson = insuredPerson;
        this.timeslot = timeslot;
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


    public void printFutureReservations(){
        System.out.println("The coming vaccination dates are: " );
        for (Reservation rev : reservations){
            if (!reservations.isEmpty()){
                System.out.println(timeslot);
            }
        }
    }
}

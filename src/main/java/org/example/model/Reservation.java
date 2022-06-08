package org.example.model;

public class Reservation {
    Insured insuredPerson;
    Timeslot timeslot;
    Boolean isDone = false;
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
}

package org.example;

import java.sql.Time;

public class Reservation {
    Insured insuredPerson;
    Timeslot timeslot;

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
}

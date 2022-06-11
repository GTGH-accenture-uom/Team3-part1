package org.example.model;

import lombok.Data;

@Data
public class Reservation {
    Insured insuredPerson;
    Timeslot timeslot;
    Boolean isDone = false;
    VaccinationCenter vaccinationCenter;
    Doctor doctor;

    public Reservation(Insured insuredPerson, Doctor doctor, Timeslot timeslot, VaccinationCenter vaccinationCenter) {
        this.insuredPerson = insuredPerson;
        this.timeslot = timeslot;
        this.vaccinationCenter = vaccinationCenter;
        this.doctor=doctor;
    }


    @Override
    public String toString() {
        return "Reservation{" +
                "insuredPerson=" + insuredPerson +
                ", timeslot=" + timeslot +
                ", isDone=" + isDone +
                ", vaccinationCenter=" + vaccinationCenter +
                ", doctor=" + doctor +
                '}';
    }
}

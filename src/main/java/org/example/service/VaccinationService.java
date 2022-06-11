package org.example.service;

import org.example.model.Doctor;
import org.example.model.Insured;
import org.example.model.Reservation;
import org.example.model.Vaccination;

import java.time.LocalDate;
import java.util.ArrayList;

public class VaccinationService {

    private static ArrayList<Vaccination> vaccinationslist;

    public void makeVaccination(Reservation reservation, Doctor doctor){
        reservation.setDone(true);
        LocalDate expiration_date = reservation.getTimeslot().getLocalDate().plusMonths(2);
        Vaccination vacc = new Vaccination(reservation.getInsuredPerson(), doctor,reservation.getTimeslot().getLocalDate(), expiration_date);
        vaccinationslist.add(vacc);
        doctor.addVaccination(vacc);
    }
}

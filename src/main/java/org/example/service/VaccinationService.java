package org.example.service;

import org.example.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VaccinationService {

    private static ArrayList<Vaccination> vaccinationslist = new ArrayList<>();

    public static List<Vaccination> getAllVaccinations() {
        return vaccinationslist;
    }

    public void vaccinate(Reservation reservation, Doctor doctor){
        reservation.setDone(true);
        Insured insured = reservation.getInsuredPerson();
        Timeslot timeslot = reservation.getTimeslot();
        LocalDate vacc_date = timeslot.getLocalDate();

        //set the expiration date two months after the vaccination date (subject to change)
        LocalDate expiration_date = vacc_date.plusMonths(2);
        Vaccination vaccination = new Vaccination(insured,doctor,vacc_date, expiration_date);
        vaccinationslist.add(vaccination);
    }


}

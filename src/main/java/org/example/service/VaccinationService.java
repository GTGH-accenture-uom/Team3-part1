package org.example.service;

import org.example.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VaccinationService {

    public static ArrayList<Vaccination> vaccinationsList = new ArrayList<>();

    public static ArrayList<Vaccination> getVaccinationsList() {
        return vaccinationsList;
    }

    public static void setVaccinationsList(ArrayList<Vaccination> vaccinationsList) {
        VaccinationService.vaccinationsList = vaccinationsList;
    }

    public void vaccinate(Reservation reservation, Doctor doctor){
        reservation.setDone(true);
        Insured insured = reservation.getInsuredPerson();
        Timeslot timeslot = reservation.getTimeslot();
        LocalDate vacc_date = timeslot.getLocalDate();

        //set the expiration date two months after the vaccination date (subject to change)
        LocalDate expiration_date = vacc_date.plusMonths(2);
        Vaccination vaccination = new Vaccination(insured,doctor,vacc_date, expiration_date);
        vaccinationsList.add(vaccination);
    }


}

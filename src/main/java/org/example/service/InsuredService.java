package org.example.service;

import org.example.model.Insured;
import org.example.model.Reservation;
import org.example.model.Vaccination;
import org.example.model.VaccinationCenter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
This class represents the service for all the insured people.
It contains a list of all the insured people, and some needed methods
such as the creation of an insured person.
 */
public class InsuredService {

   private List<Insured> insuredList = new ArrayList<Insured>();

    //creates new Insured object and adds it to the list
    public void createInsured(String afm, String amka, String name, String surname, LocalDate birthdate, String email)
    {
        insuredList.add(new Insured(afm, amka ,name, surname,birthdate, email ));
    }

    //Returns the list with all the insured people.
    public List<Insured> getAllInsured()
    {
        return insuredList;
    }

    public Insured getInsuredByAmka(String s) {
        for (Insured insured:insuredList) {
            if (insured.getAmka().equals(s))
                return insured;

        }
        return null;
    }

    /*
    this method finds and prints the insured people over the age of 60 that have not made
    a reservation. It iterates the insuredList, finds the people that are over 60 years old,
    and then checks if that specific person exists in a reservation object of the reservationsList from
    the reservationService class.
     */
    public List<String> printInsuredOverSixtyWithNoAppointment() {
        List<String> results = new ArrayList<>();
        results.add("Insured people over the age of 60 that have not made a reservation: ");
        boolean hasAppointment = false;
        ArrayList<Insured> eligibleInsured = new ArrayList<>();
        for (Insured insured:insuredList) {
            if (LocalDate.now().getYear()- insured.getBirthdate().getYear() >= 60) {
                for (Reservation res : ReservationService.getReservationList()) {
                    if (res.getInsuredPerson().equals(insured)) {
                        hasAppointment = true;
                        break;
                    }
                }
                if (!hasAppointment) {
                    eligibleInsured.add(insured);
                    results.add(insured.toString());
            }

            }
            hasAppointment = false;
        }
        System.out.println(results.get(0));
        eligibleInsured.forEach(System.out::println);
        return results;
    }

    //Checks and prints if the insured person's vaccination coverage has expired
    // or not depending on the vaccination they had.
    public void checkHasCoverage(Insured insured){
        for(Vaccination vaccination1 : VaccinationService.getVaccinationslist() )
        {
            if (vaccination1.getInsuredPerson().equals(insured) && (vaccination1.getExpirationDate().isAfter(LocalDate.now()))){
                System.out.println("Your vaccination certificate is still valid!");
            }
            else {
                System.out.println("Your vaccination coverage has expired!");
            }
        }
    }

}

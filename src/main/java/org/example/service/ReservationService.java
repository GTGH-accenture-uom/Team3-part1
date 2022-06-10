package org.example.service;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {

    ArrayList<Reservation> reservationList = new ArrayList<>();

    /* creates a new reservation that an insured person made to a certain timeslot and adds it
    * to the list. Sets the corresponding timeslot isFree field to false so that it appears
    * as unavailable/booked*/
    public void createReservation(Insured insured, Timeslot timeslot, VaccinationCenter center){
        reservationList.add(new Reservation(insured, timeslot,center));
        timeslot.setFree(false);
    }


    /*
    This method returns the reservations made to a certain Vaccinations Center, based
    on  the code given as a parameter.
     */
    public void printReservationsOfCenter(String s) {
        System.out.println("The reservations of center with code "+ s + ":");
        List<Reservation> reservationsOfCenter = new ArrayList<>();
        for (Reservation reservation:reservationList) {
            if (reservation.getVaccinationCenter().getCode().equals(s))
                reservationsOfCenter.add(reservation);

        }
        reservationsOfCenter.forEach(System.out::println);
    }
}

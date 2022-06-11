package org.example.service;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {


    //an eixa to idio timeslot se diaforetika centers kai ekana krathsh sto ena
    // me thn boolean metavlhth m edeixne oti den einai dia8esimo to timeslot oute sto allo center

    private List<Reservation> reservationList = new ArrayList<>();
    public void createReservation(Insured insured, Timeslot timeslot, VaccinationCenter center){
        for(Reservation res : reservationList){
            if(res.getTimeslot().equals(timeslot) && res.getVaccinationCenter().equals(center)){
                System.out.println("This timeslot is not available.");
                return;
            }
        }
        reservationList.add(new Reservation(insured, timeslot.getDoctor(), timeslot,center));
    }

    public void deleteReservation(Insured insured,Timeslot timeslot){
        reservationList.removeIf(reservation -> reservation.getInsuredPerson().equals(insured));
        timeslot.setFree(true);
    }
    public List<Reservation> getAllRes() {
        return this.reservationList;
    }
}


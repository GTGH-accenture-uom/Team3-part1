package org.example.service;

import org.example.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservationService {

    private ArrayList<Reservation> reservationList = new ArrayList<>();

    public ReservationService() {
    }

    public ArrayList<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(ArrayList<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    /* creates a new reservation that an insured person made to a certain timeslot and adds it
    * to the list. Sets the corresponding timeslot isFree field to false so that it appears
    * as unavailable/booked*/
    public void createReservation(Insured insured, Timeslot timeslot, VaccinationCenter center){
        reservationList.add(new Reservation(insured, timeslot.getDoctor(), timeslot,center));
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

    public void showResOfDoctorByCenter(Doctor doctor, VaccinationCenter center) {
        System.out.println("----------------------------");
        ArrayList<Reservation> reservations = new ArrayList<>();
        System.out.println("Reservations of Dr " + doctor.getName()+ " " + doctor.getSurname()
        + " of Center with code " + center.getCode());
        for (Reservation reservation:reservationList) {
            if (reservation.getDoctor().equals(doctor) &&
                    reservation.getVaccinationCenter().equals(center)){
                    reservations.add(reservation);
            }

        }
        reservations.forEach(System.out::println);
    }

    public void showResOfDoctorByDay(Doctor doctor, LocalDate date) {
        System.out.println("----------------------------");
        ArrayList<Reservation> reservations = new ArrayList<>();
        System.out.println("Reservations of Dr " + doctor.getName()+ " " + doctor.getSurname()
                + " on " + date);
        for (Reservation reservation:reservationList) {
            if (reservation.getDoctor().equals(doctor) &&
                    reservation.getTimeslot().getLocalDate().equals(date)){
                reservations.add(reservation);
            }

        }
        reservations.forEach(System.out::println);

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


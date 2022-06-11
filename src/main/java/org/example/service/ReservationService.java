package org.example.service;

import lombok.Data;
import org.example.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class ReservationService {

    public List<Reservation> reservationList = new ArrayList<>();


    /*
    This method returns the reservations made to a certain Vaccinations Center, based
    on  the code given as a parameter.
     */
    public void printReservationsOfCenter(String s) {
        System.out.println("The reservations of center with code " + s + ":");
        List<Reservation> reservationsOfCenter = new ArrayList<>();
        for (Reservation reservation : reservationList) {
            if (reservation.getVaccinationCenter().getCode().equals(s))
                reservationsOfCenter.add(reservation);

        }
        reservationsOfCenter.forEach(System.out::println);
    }

    public void showResOfDoctorByCenter(Doctor doctor, VaccinationCenter center) {
        System.out.println("----------------------------");
        ArrayList<Reservation> reservations = new ArrayList<>();
        System.out.println("Reservations of Dr " + doctor.getName() + " " + doctor.getSurname()
                + " of Center with code " + center.getCode());
        for (Reservation reservation : reservationList) {
            if (reservation.getDoctor().equals(doctor) &&
                    reservation.getVaccinationCenter().equals(center)) {
                reservations.add(reservation);
            }

        }
        reservations.forEach(System.out::println);
    }

    public void showResOfDoctorByDay(Doctor doctor, LocalDate date) {
        System.out.println("----------------------------");
        ArrayList<Reservation> reservations = new ArrayList<>();
        System.out.println("Reservations of Dr " + doctor.getName() + " " + doctor.getSurname()
                + " on " + date);
        for (Reservation reservation : reservationList) {
            if (reservation.getDoctor().equals(doctor) &&
                    reservation.getTimeslot().getLocalDate().equals(date)) {
                reservations.add(reservation);
            }

        }
        reservations.forEach(System.out::println);
    }
    //an eixa to idio timeslot se diaforetika centers kai ekana krathsh sto ena
    // me thn boolean metavlhth m edeixne oti den einai dia8esimo to timeslot oute sto allo center

    public void createReservation(Insured insured, Timeslot timeslot, VaccinationCenter center, Doctor doctor) {
        for (Reservation res : reservationList) {
            if (res.getTimeslot().equals(timeslot) && res.getVaccinationCenter().equals(center)) {
                System.out.println("This timeslot is not available.");
                return;
            }
        }
        if(center.getDoctorList().contains(doctor)){
            reservationList.add(new Reservation(insured, doctor, timeslot, center));
        } else {
            System.out.println("This doctor is not exist in the center " +center.getCode());
        }


    }

    public void deleteReservation(Insured insured, Timeslot timeslot) {
        reservationList.removeIf(reservation -> reservation.getInsuredPerson().equals(insured));

    }


    public void printAvTimePerCenter(VaccinationCenter center) {
        for (Timeslot timeslot : center.getTimeslots()) {
            boolean available = true;
            for (Reservation res : reservationList) {
                if (timeslot.equals(res.getTimeslot()) && center.equals(res.getVaccinationCenter())) {
                    available = false;
                }
            }
            if (available) {
                System.out.println("The timeslot " + timeslot + "is available for center " + center.getCode());
            }

        }
    }


    public List<Reservation> getAllRes() {
        return reservationList;
    }

}


package org.example.service;

import org.example.model.Doctor;
import org.example.model.Insured;
import org.example.model.Timeslot;
import org.example.model.VaccinationCenter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
This class represents the service for all the doctors.
It contains a list of all the doctors, and some needed methods
such as the creation of a doctor.
 */
public class DoctorService {

    private List<Doctor> doctorsList = new ArrayList<>();

    public void createDoctor(String amka, String name, String surname){
        doctorsList.add(new Doctor(amka,name,surname));
    }

    public List<Doctor> getAllDoctors(){
        return doctorsList;
    }

}

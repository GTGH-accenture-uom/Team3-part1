
package org.example.service;

import java.util.ArrayList;
import java.util.List;

import org.example.model.Insured;
import org.example.model.Timeslot;
import org.example.model.VaccinationCenter;

public class VaccinationCenterService {
    List<VaccinationCenter> vaccinationCenterList = new ArrayList();

    public VaccinationCenterService() {
    }

    public void createVaccinationCenter(String code, String address) {
        this.vaccinationCenterList.add(new VaccinationCenter(code, address));
    }

    public List<VaccinationCenter> getAllCenters() {
        return this.vaccinationCenterList;
    }

    public void printTimeslotsOfCenter(String s) {
        for (VaccinationCenter center : vaccinationCenterList) {
            if (center.getCode().equals(s)) {
                System.out.println("Timeslots of Vaccination Center with code: " + center.getCode() + ":");
                center.getTimeslots().forEach(System.out::println);
            }
        }
    }

    //printFreeTimeslots prints all the available timeslots of the center with code s
    //h ylopoihsh exei ginei sto ReservationService --> printAvTimePerCenter
//    public void printFreeTimeslots(String s) {
//        for (VaccinationCenter center : vaccinationCenterList) {
//            if (center.getCode().equals(s)) {
//                System.out.println("The available timeslots of Center with code " +center.getCode() + ":");
//                for (Timeslot timeslot: center.getTimeslots()) {
//                    if (timeslot.isFree())
//                        System.out.println(timeslot);
//                }
//            }
//        }
//    }

    public VaccinationCenter getCenterByCode(String s) {
        for (VaccinationCenter vaccinationCenter:vaccinationCenterList) {
            if (vaccinationCenter.getCode().equals(s))
                return vaccinationCenter;

        }
        return null;
    }
}
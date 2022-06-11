package org.example;

import org.example.model.*;
import org.example.service.DoctorService;
import org.example.service.InsuredService;
import org.example.service.ReservationService;
import org.example.service.VaccinationCenterService;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       InsuredService insuredService = new InsuredService();
        insuredService.createInsured("162207556","18029704689","Konstantinos","Antoniadis", LocalDate.parse("1997-02-18"),"kon.anton@gmail.com");
        insuredService.createInsured("108204866","24121101368","Euaggelia","Ilioudi", LocalDate.parse("2011-12-24"),"eua.iliou@gmail.com");
        insuredService.createInsured("503307568","28083504789","Stefanos","Papakonstantinou", LocalDate.parse("1935-08-28"),"stef.pap@gmail.com");
        insuredService.createInsured("325687147","01074807816","Ioannis","Petrakis", LocalDate.parse("1948-07-01"),"ion.petr@gmail.com");
        insuredService.createInsured("481590296","19036504689","Dimitrios","Kasidas", LocalDate.parse("1965-03-19"),"dim.kas@gmail.com");
        insuredService.createInsured("648237666","28090801369","Eleni","Vlahodimou", LocalDate.parse("2008-09-28"),"el.vlah@gmail.com");
        insuredService.createInsured("279600359","05037604637","Chara","Kalogeropoulou", LocalDate.parse("1976-03-05"),"chara.kaloger@gmail.com");
        insuredService.createInsured("412348532","24010604689","Athanasios","Kokkinos", LocalDate.parse("2006-01-24"),"athan.kok@gmail.com");
        insuredService.createInsured("784206336","22024204689","Katerina","Konstantinidh", LocalDate.parse("1942-02-22"),"kat.konst@gmail.com");
        insuredService.createInsured("456202576","04118801486","Dimitra","Gkanidi", LocalDate.parse("1988-11-04"),"dim.gkan@gmail.com");
        insuredService.createInsured("783001492","28080306644","Nikoleta","Apostolou", LocalDate.parse("2003-08-28"),"nikol.ap@gmail.com");
        insuredService.createInsured("842124577","14070004788","Antonios","Nikolaou", LocalDate.parse("2000-07-14"),"anton.nikol@gmail.com");
        insuredService.createInsured("185207410","29019504689","Maria","Panagiotidou", LocalDate.parse("1995-01-29"),"mar.panag@gmail.com");
        insuredService.createInsured("664201431","15064701124","Vaios","Xitsas", LocalDate.parse("1947-06-15"),"vag.xits@gmail.com");
        insuredService.createInsured("501903374","26048108643","Panagiotis","Karathanos", LocalDate.parse("1981-04-26"),"pan.karath@gmail.com");

        //print all insured
        for (Insured insured : insuredService.getInsuredMap().values()) {
            System.out.println(insured);

        }



        DoctorService doctorService = new DoctorService();
        //  doctorService.createDoctor("28088501568","Panagiotis","Panagiotidis");
        //  doctorService.createDoctor("01028400368","Ioannis","Petrou");
        //  doctorService.createDoctor("16048009878","Maria","Mitsiou");
       //  doctorService.createDoctor("23068601368","Asterios","Papadopoulos");
        Doctor doc01 = new Doctor("28088501568","Panagiotis","Panagiotidis");
        Doctor doc02 = new Doctor("01028400368","Ioannis","Petrou");
        Doctor doc03 = new Doctor("16048009878","Maria","Mitsiou");
        Doctor doc04 = new Doctor("23068601368","Asterios","Papadopoulos");

     for (Doctor doctor : doctorService.getAllDoctors()){
            System.out.println(doctor);

        }




        VaccinationCenterService vaccinationCenterService = new VaccinationCenterService();
       // vaccinationCenterService.createVaccinationCenter("01","Konstantinoupolews 18");
       // vaccinationCenterService.createVaccinationCenter("02","Ippokratio 20");
        VaccinationCenter center01 = new VaccinationCenter("01","konstantinoupoleos 18");
        VaccinationCenter center02 = new VaccinationCenter("02","Ipokratio 20");

       for(VaccinationCenter vaccinationCenter : vaccinationCenterService.getAllCenters()){
        System.out.println(vaccinationCenter);
       }




        Timeslot t01= new Timeslot(6,5,2022,18,00,01,20,doc01);
        Timeslot t02= new Timeslot(9,4,2022,12,10,11,30,doc01);
        Timeslot t03= new Timeslot(2,3,2022,8,05,06,26,doc01);
        Timeslot t04= new Timeslot(22,12,2021,9,15,16,30,doc01);
        Timeslot t05= new Timeslot(7,11,2021,19,20,21,40,doc01);
        Timeslot t06= new Timeslot(30,5,2022,12,50,51,10,doc01);
        Timeslot t07= new Timeslot(12,6,2022,2,00,01,15,doc01);
        Timeslot t08= new Timeslot(1,7,2021,9,30,31,50,doc01);
        Timeslot t09= new Timeslot(4,8,2021,20,10,11,30,doc01);
        Timeslot t10= new Timeslot(10,10,2021,10,20,21,40,doc01);





        ReservationService reservationService = new ReservationService();
        reservationService.createReservation(insuredService.getInsuredMap().get("18029704689"),t01,center01);
        reservationService.createReservation(insuredService.getInsuredMap().get("24121101368"),t02,center01);
        reservationService.createReservation(insuredService.getInsuredMap().get("28083504789"),t03,center01);
        reservationService.createReservation(insuredService.getInsuredMap().get("01074807816"),t04,center01);
        reservationService.createReservation(insuredService.getInsuredMap().get("19036504689"),t05,center02);
        reservationService.createReservation(insuredService.getInsuredMap().get("28090801369"),t06,center02);
        reservationService.createReservation(insuredService.getInsuredMap().get("05037604637"),t07,center02);
        reservationService.createReservation(insuredService.getInsuredMap().get("26048108643"),t08,center02);



        for(Reservation res : reservationService.getAllRes()){
            System.out.println(res);
        }
        //omws an mpei la8os amka skaei o kwdikas me nullexception
        reservationService.deleteReservation(insuredService.getInsuredMap().get("24121101368"), t02);

        System.out.println("---------------------");

        for(Reservation res : reservationService.getAllRes()){
            System.out.println(res);
        }


        ArrayList<Timeslot> timeslots = new ArrayList<>();
        timeslots.add(new Timeslot(10,6,2022,12,30,30,40,doctorService.getAllDoctors().get(0)));
        timeslots.add(new Timeslot(10,6,2022,12,40,40,50,doctorService.getAllDoctors().get(0)));
        timeslots.add(new Timeslot(6,6,2022,12,50,50,0,doctorService.getAllDoctors().get(0)));
        timeslots.add(new Timeslot(6,6,2022,1,30,30,40,doctorService.getAllDoctors().get(2)));
        timeslots.add(new Timeslot(6,6,2022,1,40,40,50,doctorService.getAllDoctors().get(2)));

        vaccinationCenterService.getAllCenters().get(0).addTimeslot(timeslots.get(0));
        vaccinationCenterService.getAllCenters().get(0).addTimeslot(timeslots.get(1));
        vaccinationCenterService.getAllCenters().get(0).addTimeslot(timeslots.get(2));
        vaccinationCenterService.getAllCenters().get(1).addTimeslot(timeslots.get(3));
        vaccinationCenterService.getAllCenters().get(1).addTimeslot(timeslots.get(4));

        vaccinationCenterService.printTimeslotsOfCenter("01");
        vaccinationCenterService.printTimeslotsOfCenter("02");

        vaccinationCenterService.printFreeTimeslots("01");
        vaccinationCenterService.printFreeTimeslots("02");

        ReservationService reservationService = new ReservationService();
        reservationService.createReservation(insuredService.getInsuredByAmka("18029704689"),timeslots.get(0),vaccinationCenterService.getCenterByCode("01"));
        reservationService.createReservation(insuredService.getInsuredByAmka("24121101368"),timeslots.get(1),vaccinationCenterService.getCenterByCode("01"));
        reservationService.createReservation(insuredService.getInsuredByAmka("28083504789"),timeslots.get(2),vaccinationCenterService.getCenterByCode("02"));
        reservationService.createReservation(insuredService.getInsuredByAmka("19036504689"),timeslots.get(3),vaccinationCenterService.getCenterByCode("02"));


        //Τα επικείμενα ραντεβού για κάθε εμβολιαστικό κέντρου
        reservationService.printReservationsOfCenter("01");
        reservationService.printReservationsOfCenter("02");

        insuredService.printInsuredOverSixtyWithNoAppointment();

        reservationService.showResOfDoctorByCenter(doctorService.getAllDoctors().get(0),vaccinationCenterService.getCenterByCode("01"));
        reservationService.showResOfDoctorByDay(doctorService.getAllDoctors().get(0), LocalDate.now());

    }
}
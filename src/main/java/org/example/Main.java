package org.example;

import org.example.model.Doctor;
import org.example.model.Insured;
import org.example.model.VaccinationCenter;
import org.example.service.DoctorService;
import org.example.service.InsuredService;
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
        for (Insured insured : insuredService.getAllInsured()) {
            System.out.println(insured);

        }

        DoctorService doctorService = new DoctorService();
        doctorService.createDoctor("28088501568","Panagiotis","Panagiotidis");
        doctorService.createDoctor("01028400368","Ioannis","Petrou");
        doctorService.createDoctor("16048009878","Maria","Mitsiou");
        doctorService.createDoctor("23068601368","Asterios","Papadopoulos");

        for (Doctor doctor : doctorService.getAllDoctors()){
            System.out.println(doctor);

        }

        VaccinationCenterService vaccinationCenterService = new VaccinationCenterService();
        vaccinationCenterService.createVaccinationCenter("01","Konstantinoupolews 18");
        vaccinationCenterService.createVaccinationCenter("02","Ippokratio 20");

        for(VaccinationCenter vaccinationCenter : vaccinationCenterService.getAllCenters()){
            System.out.println(vaccinationCenter);
        }


    }
}
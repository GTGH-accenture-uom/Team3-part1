package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Insured insured01 = new Insured("162207556","18029704689","Konstantinos","Antoniadis", LocalDate.parse("1997-02-18"),"kon.anton@gmail.com");
        Insured insured02 = new Insured("108204866","24121101368","Euaggelia","Ilioudi", LocalDate.parse("2011-12-24"),"eua.iliou@gmail.com");
        Insured insured03 = new Insured("503307568","28083504789","Stefanos","Papakonstantinou", LocalDate.parse("1935-08-28"),"stef.pap@gmail.com");
        Insured insured04 = new Insured("325687147","01074807816","Ioannis","Petrakis", LocalDate.parse("1948-07-01"),"ion.petr@gmail.com");
        Insured insured05 = new Insured("481590296","19036504689","Dimitrios","Kasidas", LocalDate.parse("1965-03-19"),"dim.kas@gmail.com");
        Insured insured06 = new Insured("648237666","28090801369","Eleni","Vlahodimou", LocalDate.parse("2008-09-28"),"el.vlah@gmail.com");
        Insured insured07 = new Insured("279600359","05037604637","Chara","Kalogeropoulou", LocalDate.parse("1976-03-05"),"chara.kaloger@gmail.com");
        Insured insured08 = new Insured("412348532","24010604689","Athanasios","Kokkinos", LocalDate.parse("2006-01-24"),"athan.kok@gmail.com");
        Insured insured09 = new Insured("784206336","22024204689","Katerina","Konstantinidh", LocalDate.parse("1942-02-22"),"kat.konst@gmail.com");
        Insured insured10 = new Insured("456202576","04118801486","Dimitra","Gkanidi", LocalDate.parse("1988-11-04"),"dim.gkan@gmail.com");
        Insured insured11 = new Insured("783001492","28080306644","Nikoleta","Apostolou", LocalDate.parse("2003-08-28"),"nikol.ap@gmail.com");
        Insured insured12 = new Insured("842124577","14070004788","Antonios","Nikolaou", LocalDate.parse("2000-07-14"),"anton.nikol@gmail.com");
        Insured insured13 = new Insured("185207410","29019504689","Maria","Panagiotidou", LocalDate.parse("1995-01-29"),"mar.panag@gmail.com");
        Insured insured14 = new Insured("664201431","15064701124","Vaios","Xitsas", LocalDate.parse("1947-06-15"),"vag.xits@gmail.com");
        Insured insured15 = new Insured("501903374","26048108643","Panagiotis","Karathanos", LocalDate.parse("1981-04-26"),"pan.karath@gmail.com");

        ArrayList<Insured> insuredArrayList = new ArrayList<>();

        insuredArrayList.add(insured01);
        insuredArrayList.add(insured02);
        insuredArrayList.add(insured03);
        insuredArrayList.add(insured04);
        insuredArrayList.add(insured05);
        insuredArrayList.add(insured06);
        insuredArrayList.add(insured07);
        insuredArrayList.add(insured08);
        insuredArrayList.add(insured09);
        insuredArrayList.add(insured10);
        insuredArrayList.add(insured11);
        insuredArrayList.add(insured12);
        insuredArrayList.add(insured13);
        insuredArrayList.add(insured14);
        insuredArrayList.add(insured15);



    }
}
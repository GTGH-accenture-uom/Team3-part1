package org.example.service;

import org.example.model.Insured;
import org.example.model.Vaccination;
import org.example.model.VaccinationCenter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.example.service.VaccinationService.*;

/*
This class represents the service for all the insured people.
It contains a list of all the insured people, and some needed methods
such as the creation of an insured person.
 */
public class InsuredService {

   List<Insured> insuredList = new ArrayList<Insured>();

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

    //ToDo
    //Checks and prints if the insured person's vaccination coverage has expired
    // or not depending on the vaccination they had.
    public void checkHasCoverage(Insured insured, Vaccination vaccination){
         for(Vaccination vaccination1 : vaccinationsList )
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

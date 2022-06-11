package org.example.service;

import lombok.Data;
import org.example.model.Insured;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
This class represents the service for all the insured people.
It contains a list of all the insured people, and some needed methods
such as the creation of an insured person.
 */
@Data
public class InsuredService {

   Map<String,Insured> insuredMap = new HashMap<>();

    //creates new Insured object and adds it to the map
    //map anti gia list wste na mporw na ta kalw sthn main px sthn createReservation
    public void createInsured(String afm, String amka, String name, String surname, LocalDate birthdate, String email)
    {
        insuredMap.put(amka,new Insured(afm, amka ,name, surname,birthdate, email ));
    }



}

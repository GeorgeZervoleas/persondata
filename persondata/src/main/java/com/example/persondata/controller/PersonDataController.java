package com.example.persondata.controller;


import com.example.persondata.dao.PersonDataRepo;
import com.example.persondata.model.PersonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class PersonDataController {

    @Autowired
    private PersonDataRepo persondatarepo;


    @RequestMapping(value = "/createNew")
    public String createNote()
    {
        int temperature;
        Random rn = new Random();
        int min = 5, max = 40;

        for (int i = 0; i < 500; i++) {
            temperature=rn.nextInt(max - min + 1) + min;
            PersonData personData = new PersonData();
            personData.setName("John");
            personData.setLastName("Papas");
            personData.setTemperature(temperature);
            persondatarepo.save(personData);
        }
       return "done";
    }

    @RequestMapping(value = "/getAllRecords")
    public List<PersonData> getalltemp()
        {
            return persondatarepo.findAll();
        }


}

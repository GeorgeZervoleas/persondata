package com.example.persondata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PersonData")
public class PersonData {

    @Id @GeneratedValue
    private int recordid;
    private String aname;
    private String lname;
    private Integer temperature;

    public int getAid() {
        return recordid;
    }

    public void setAid(int id) {
        this.recordid = id;
    }

    public String getName() {
        return aname;
    }

    public void setName(String name) {

        this.aname = name;
    }
    public String getLastName() {
        return lname;
    }

    public void setLastName(String lastname) {
        this.lname = lastname;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature (Integer temp) {
        this.temperature = temp;
    }

    @Override
    public String toString() {
        return "Alien [id= " +recordid + ", aname= " +aname + "]";
    }

}

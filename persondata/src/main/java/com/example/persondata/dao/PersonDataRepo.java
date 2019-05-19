package com.example.persondata.dao;


import com.example.persondata.model.PersonData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonDataRepo  extends JpaRepository<PersonData, Integer> {

}

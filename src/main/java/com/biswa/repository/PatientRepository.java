package com.biswa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.biswa.entiry.Patient;

@Component
public interface PatientRepository extends CrudRepository<Patient,String> {

	   List<Patient>findByAge(int age);

	   
	    List<Patient>findByAgeAndGender(int age,String gender);
}

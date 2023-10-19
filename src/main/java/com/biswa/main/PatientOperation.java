package com.biswa.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biswa.entiry.Patient;
import com.biswa.repository.PatientRepository;
@Component
public class PatientOperation {

	@Autowired
	   public PatientRepository repository;
	
	
	//add one patient details 
	public void addPatientDetails(Patient p) {
		repository.save(p);
	}
//2--> //add multiple patient details
	
	 public void addMorePatientDetails1(List<Patient>patients) {
		  repository.saveAll(patients);
	 }
//3-->//update patient details
	
	public void updatePatientData(Patient p) {
           repository.save(p);
	}
//4--->//deleteById()
	   
	     public void deletePatient(String email) {
	    	 repository.deleteById(email);
	     }
	     
//5--->//findById()
	     
	     public Patient fetchByEmailId(String emailId) {
	    	 return repository.findById(emailId).get();
	     }
	     
//fetch data using age	     
	     public List<Patient>fetchByAge(int age){
	    	   return repository.findByAge(age);
	     }
//based on Age+Gender
	     public List<Patient>getPatientsWithAgeAndGender(int age,String gender){
	    	 return repository.findByAgeAndGender(age, gender);
	     }

		}
	       
          


	   

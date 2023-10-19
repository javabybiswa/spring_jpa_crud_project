package com.biswa.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.biswa.entiry.Patient;

public class PatientApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		
		PatientOperation ops = context.getBean(PatientOperation.class);
		
		// Add Single Patient 
		Patient p = new Patient();
		p.setEmailId("subhman@gmail.com");
		p.setName("subhman gill");
		p.setContact("+918826111377");
		p.setAge(30);
		p.setGender("MALE");
		
		ops.addPatientDetails(p);
		
		// Adding More Patient 
		
		Patient p1 = new Patient();
		p1.setEmailId("rohit@gmail.com");
		p1.setName("rohit sharma");
		p1.setContact("+828388");
		p1.setAge(30);
		p1.setGender("MALE");
		
		Patient p2 = new Patient();
		p2.setEmailId("smruti@gmail.com");
		p2.setName("smruti mandhana");
		p2.setContact("+44343423");
		p2.setAge(36);
		p2.setGender("FEMALE");
		
		Patient p3 = new Patient();
		p3.setEmailId("smrutimandhana@gmail.com");
		p3.setName("smruti mandhana");
		p3.setContact("+64654651");
		p3.setAge(31);
		p3.setGender("FEMALE");
		
		List<Patient> allPatients = new ArrayList<>();
		allPatients.add(p1);
		allPatients.add(p2);
		allPatients.add(p3);
		ops.addMorePatientDetails1(allPatients);
		
		//Update PAtient Details 
		
		Patient abc = new Patient();
		abc.setEmailId("smruti@gmail.com");
		abc.setName("virat kohli");
		abc.setAge(30);
		abc.setGender("MALE");
		abc.setContact("666666666");
		
		ops.updatePatientData(abc);
		
		//delete details
		
		ops.deletePatient("rohit@gmail.com");
		
		//findById()
		Patient patient=ops.fetchByEmailId("subhman@gmail.com");
		  System.out.println(patient);
		
		  
		 }
	 
}
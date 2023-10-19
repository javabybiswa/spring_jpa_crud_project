package com.biswa.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.biswa.entiry.Patient;

public class PatientApplicationTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		
		PatientOperation ops = context.getBean(PatientOperation.class);
		
		//by age
		  List<Patient>patients=ops.fetchByAge(31);
		   System.out.println(patients);
		    
		    //by age and gender
		    List<Patient>patients1=ops.getPatientsWithAgeAndGender(30,"MALE");
		    System.out.println(patients1);
	}

}

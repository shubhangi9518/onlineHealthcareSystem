package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Patient;

import com.service.PatientService;

@RestController
@RequestMapping("/P")
@CrossOrigin(origins="http://localhost:4200/")
public class PatientController
{
   @Autowired
   PatientService patientservice;
   
  
   
    @PostMapping("/add")
    public ResponseEntity<Patient> savePatient(@RequestBody Patient p)
   {
   	Patient patient=patientservice.savePatient(p);
   	return  ResponseEntity.status(HttpStatus.CREATED).header("add", "User added").body(patient);
   }
    
    
//    @PostMapping("/add")
//    public Patient savePatient(@RequestBody Patient p)
// 	{
// 		return patientservice.savePatient(p);
// 		
// 	}
// 	
    
//   @GetMapping("/getOne/{id}")
//   public  Patient getOnePatient(@PathVariable("id")int id)
//   {
//   	return patientservice.getOnePatient(id);
//   }
//   
   
   /*
   @DeleteMapping("/deleteOne/{id}")
   public void deletePatient(@PathVariable("id") int id)
   {
	   patientservice.deletePatient(id);
   }
   */

   /*
   @PutMapping("/updatePatient")
   public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient) 
   {
	   Patient p=patientservice.updatePatient(patient);
   	 return  ResponseEntity.status(HttpStatus.ACCEPTED).header("add", "User added").body(p);
   }
   */

}

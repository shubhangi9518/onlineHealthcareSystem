package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.DoctorNotFoundException;
import com.model.Doctor;
import com.service.DoctorService;

@RestController
@RequestMapping("/D")
@CrossOrigin(origins="http://localhost:4200/")
public class DoctorController {

	@Autowired
     DoctorService doctorservice;
	
 
	@PostMapping("/addDoctor")
	public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor d)
	{
		 Doctor doctor=doctorservice.saveDoctor(d);
    	return  ResponseEntity.status(HttpStatus.CREATED).header("add", "Doctor added").body(doctor);
    }
	
	
	@GetMapping("/getOne/{id}")
    public ResponseEntity<Doctor> getOneDoctor(@PathVariable ("id") int id)
    {
		Doctor doctor=doctorservice.getOneDoctor(id);
   	   return  ResponseEntity.status(HttpStatus.OK).header("get", "get one user ").body(doctor);
    }
	
	@GetMapping("/getAll")
    public  List<Doctor> getAllDoctor()
    {
	  return doctorservice.getAllDoctor();
    }
	
     @DeleteMapping("/deleteDoctor/{doctorId}")
	 public ResponseEntity<Map<String,Object>> deleteDoctor(@PathVariable("doctorId")int doctorId) throws DoctorNotFoundException
	 {
	   Map<String,Object> response=doctorservice.deleteDoctor(doctorId);
	   return ResponseEntity.ok(response);
	 }
	 
    
}


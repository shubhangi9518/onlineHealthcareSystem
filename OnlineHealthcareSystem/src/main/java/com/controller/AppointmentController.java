package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Admin;
import com.model.Appointment;
import com.service.AppointmentService;

@RestController
@RequestMapping("/AB")
@CrossOrigin(origins="http://localhost:4200/")
public class AppointmentController 
{
	@Autowired
	AppointmentService appoimentservice;
	

	@PostMapping("/addAppoiment")
	public ResponseEntity<Appointment> saveAppointment(@RequestBody Appointment a){
		
		Appointment appoiment=appoimentservice.saveAppointment(a);
		return ResponseEntity.status(HttpStatus.CREATED).body(appoiment);
	}
	

	@GetMapping("/getAll")
    public  List<Appointment> getAllappointment()
    {
	  return appoimentservice.getAllappointment();
    }
	

}

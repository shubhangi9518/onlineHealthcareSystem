package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.HealthClub;
import com.model.Medicalstore;
import com.service.HealthClubService;
import com.service.MedicalstoreService;

@RestController
@RequestMapping("/M")
@CrossOrigin(origins=" http://localhost:4200/")
public class MedicalstoreController {
	
	@Autowired
	MedicalstoreService healthClubService;
	
	@PostMapping("/add")
	public Medicalstore addMedicalstore(@RequestBody Medicalstore m)
	{

		return healthClubService.addMedicalstore(m);
	}

}

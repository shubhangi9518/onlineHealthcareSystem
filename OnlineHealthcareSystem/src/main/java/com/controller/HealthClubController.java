package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.HealthClub;
import com.service.HealthClubService;


@RestController
@RequestMapping("/hc")
@CrossOrigin(origins=" http://localhost:4200/")
public class HealthClubController {

	@Autowired
	HealthClubService healthClubService;
	
	@PostMapping("/add")
	public HealthClub addHealthcareClub(@RequestBody HealthClub hc) {

		return healthClubService.addHealthcareClub(hc);
	}
	
//	@GetMapping("/total")
//	public List<Integer[]> findTotal() {
//		return healthClubService.findTotal();	
//   }
}
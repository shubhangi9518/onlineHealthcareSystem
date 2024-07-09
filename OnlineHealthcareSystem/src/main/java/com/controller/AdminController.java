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

import com.model.Admin;
import com.model.Patient;
import com.service.AdminService;

@RestController
@RequestMapping("/A")
@CrossOrigin(origins="http://localhost:4200")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping("/addAdmin")
	public ResponseEntity<Admin> saveAdmin(@RequestBody Admin a){
		
		Admin admin=adminService.saveAdmin(a);
		return ResponseEntity.status(HttpStatus.CREATED).body(admin);
	}
	/*
	@GetMapping("/getAdmin/{id}")
	public ResponseEntity<Admin> getAdmin(@PathVariable int id)
	{
		Admin admin= adminService.getAdmin(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).header("Get", "Get Admin").body(admin);
	}
	
	@DeleteMapping("/deleteAdmin/{id}")
	public void deleteAdmin(@PathVariable int id)
	{
		adminService.deleteAdmin(id);
	}

	@PutMapping("/updateAdmin/{id}")
	public ResponseEntity <Admin> updateAdmin(@RequestBody Admin a)
	{
		Admin admin= adminService.updateAdmin(a);
		return ResponseEntity.status(HttpStatus.ACCEPTED).header("updated","Admin updated").body(a);
	}
	*/
}
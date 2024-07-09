package com.service;

import java.util.List;
import java.util.Map;

import com.exception.DoctorNotFoundException;
import com.model.Doctor;

public interface DoctorService
{
	public Doctor saveDoctor(Doctor d);
	
	public Doctor getOneDoctor(int id);
	
	public  List<Doctor> getAllDoctor();
	
	public Map<String,Object> deleteDoctor(int doctorId) throws DoctorNotFoundException;

}

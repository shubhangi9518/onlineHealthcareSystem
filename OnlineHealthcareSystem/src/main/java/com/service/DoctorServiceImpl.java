package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DoctorRepository;
import com.exception.DoctorNotFoundException;
import com.model.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService 
{
    @Autowired
    DoctorRepository doctorRepo;
    
	
	public Doctor saveDoctor(Doctor d) 
	{
		return doctorRepo.save(d);
	}
	
	public Doctor getOneDoctor(int id)
	{
		return doctorRepo.findById(id).orElse(null);
	}

	@Override
	public List<Doctor> getAllDoctor()
	{
		return doctorRepo.findAll();
	}

	@Override
	public Map<String, Object> deleteDoctor(int doctorId) throws DoctorNotFoundException {
		 Map<String,Object> response=new HashMap<String,Object>();
		 try {
		 
			 Doctor doctor= doctorRepo.findById(doctorId).orElseThrow(()->new DoctorNotFoundException("doctor not found"+doctorId));
			 doctorRepo.delete(doctor);
			 response.put("deleted", Boolean.TRUE);//response ready
		 
		 
		 }catch(DoctorNotFoundException u)
		 {
			 response.put(" not deleted", u.getMessage());
		 }
		  return response;
	 }
	
	public Doctor updateUser(Doctor doctor)
    {
	
	  Doctor d=doctorRepo.findById(doctor.getDoctorId()).orElse(null);
	  d.setDoctorName(doctor.getDoctorName());
	  d.setQualification(doctor.getQualification());
	  d.setEmailId(doctor.getEmailId());
	  d.setAddress(doctor.getAddress());
	  d.setGender(doctor.getGender());
	  d.setSpeciality(doctor.getSpeciality());
	  
	  
	  return  doctorRepo.save(d);
	
    }


}

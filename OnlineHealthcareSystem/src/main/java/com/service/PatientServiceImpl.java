package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PatientRepository;
import com.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

         @Autowired
		 PatientRepository patientRepo;
         
		  public Patient savePatient(Patient p)
		  {
			 return patientRepo.save(p);
		  }
		  
		  public Patient getOnePatient(int id)
		  {
			  return patientRepo.findById(id).orElse(null);
		  }
		  

		  public void deletePatient(int id)
		  {
			  patientRepo.deleteById(id);
		  }
		  
		  
		  public Patient updatePatient(Patient patient)
		  {
			
			  Patient p= patientRepo.findById(patient.getId()).orElse(null);
			  p.setPatientName( patient.getPatientName());
			  p.setMobileNo(patient.getMobileNo());
			  p.setEmailId(patient.getEmailId());
			  p.setAddress(patient.getAddress());
			  p.setDob(patient.getDob());
			  p.setGender(patient.getGender());
			  
			return  patientRepo.save(p);
		}
		  
		  
	}
	



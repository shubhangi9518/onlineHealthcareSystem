package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.HealthClubRepository;
import com.dao.MedicineRepository;
import com.model.Medicalstore;

@Service
public class MedicalstoreServiceImpl implements MedicalstoreService
{
	
	@Autowired
	MedicineRepository MedicineRepo;

	@Override
	public Medicalstore addMedicalstore(Medicalstore m) 
	{
		
		return MedicineRepo.save(m);
	}

}

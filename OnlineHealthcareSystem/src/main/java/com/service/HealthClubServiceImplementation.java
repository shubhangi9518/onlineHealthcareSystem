package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.HealthClubRepository;
import com.model.HealthClub;

@Service
public class HealthClubServiceImplementation implements HealthClubService {

	@Autowired
	HealthClubRepository healthClubRepo;
	@Override
	public HealthClub addHealthcareClub(HealthClub hc) {
		// TODO Auto-generated method stub
		return healthClubRepo.save(hc);
	}

//	@Override
//	public List<Integer[]> findTotal() {
//		// TODO Auto-generated method stub
//		return healthClubRepo.findTotal();
//	}

}

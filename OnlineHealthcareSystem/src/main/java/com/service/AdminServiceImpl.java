package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepository;
import com.model.Admin;
import com.model.Patient;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepo;

	@Override
	public Admin saveAdmin(Admin a) {
		return adminRepo.save(a);
	}

	/*
	@Override
	public Admin getAdmin(int AdminId) {
		return adminRepo.findById(AdminId).orElse(null);
	}

		public void deleteAdmin(int id) {
			adminRepo.deleteById(id);		
		}

		@Override
		public Admin updateAdmin(Admin a) {
			Admin admin= adminRepo.findById(a.getAdminId()).orElse(null);
			a.setUsername(admin.getUsername());
			a.setPassword(admin.getPassword());
			
			return adminRepo.save(a);
		}
	
	*/
	
}
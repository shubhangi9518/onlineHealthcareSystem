package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AppointmentRepository;
import com.model.Appointment;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	AppointmentRepository AppointmentRepo;

	@Override
	public Appointment saveAppointment(Appointment a)
	{
		return AppointmentRepo.save(a);
	}

	@Override
	public List<Appointment> getAllappointment() {
		
		return AppointmentRepo.findAll();
	}
	

}

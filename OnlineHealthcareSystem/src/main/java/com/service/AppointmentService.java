package com.service;

import java.util.List;

import com.model.Appointment;

public interface AppointmentService 
{
	public Appointment saveAppointment(Appointment a);

	public List<Appointment> getAllappointment();
	
}

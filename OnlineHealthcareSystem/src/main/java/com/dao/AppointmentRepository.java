package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Appointment;

public interface AppointmentRepository   extends JpaRepository<Appointment,Integer> 
{

}




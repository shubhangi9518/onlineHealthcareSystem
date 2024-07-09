package com.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Appointment {
	
	@Id
	private int appointmentId;
	private String patientName;
	private String emailId;
	private int mobileNo ;
	private String doctorName;
	private LocalDate date;
	private String time;
	
	

	public Appointment() 
	{
		super();
		
	}

	public Appointment(int appointmentId, String patientName, String emailId, int mobileNo, String doctorName,
			LocalDate date, String time) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.doctorName = doctorName;
		this.date = date;
		this.time = time;
		
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}

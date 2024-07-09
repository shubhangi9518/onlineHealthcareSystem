package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Patient
{
	@Id
	@Column(name="patient_id")
	private int id;
	private String patientName;
	private String emailId;
	private int mobileNo;
	private String gender;
	private String dob;
	private String address;
	
	@OneToOne
	private Appointment appointment;
	
	public Patient()
	{
		super();
		
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="doctor_id")
	private Doctor doctor;

	public Patient(int id, String patientName, String emailId, int mobileNo, String gender, String dob, String address,
			Appointment appointment, Doctor doctor) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.appointment = appointment;
		this.doctor = doctor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	

}

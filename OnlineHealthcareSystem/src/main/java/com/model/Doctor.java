package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Doctor 
{
   @Id
   private int doctorId;
   private String doctorName;
   private String qualification;
   private String emailId;
   private String gender;   
   private String address;
   private String speciality;
   
   
   @ManyToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
    private List<Patient> patients;
   
   @OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
   private List<Appointment> appointment;
   
   public Doctor() 
   {
		super();
		
   }

	public Doctor(int doctorId, String doctorName, String qualification, String emailId, String gender, String address,
			String speciality, List<Patient> patients, List<Appointment> appointment) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.qualification = qualification;
		this.emailId = emailId;
		this.gender = gender;
		this.address = address;
		this.speciality = speciality;
		this.patients = patients;
		this.appointment= appointment;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppoiments(List<Appointment> appoiments) {
		this.appointment = appointment;
	}
	
	
   
}	
  
	   


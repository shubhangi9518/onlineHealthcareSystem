package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
public class Admin
{
	@Id
	private int adminId;
	private String userName;
	private String password;
	
    @OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	private List<Doctor> doctor;
	
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	private List<Patient> patient;
	
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	private List<Appointment> Appoiments;
	
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	private List<Medicalstore> medicalstore ;
	
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	private List<HealthClub> healthclub ;
    

	public Admin()
	{
		super();
		// TODO Auto-generated constructor stub
	}


	public Admin(int adminId, String userName, String password, List<Doctor> doctor, List<Patient> patient,
			List<Appointment> appoiments, List<Medicalstore> medicalstore, List<HealthClub> healthclub) {
		super();
		this.adminId = adminId;
		this.userName = userName;
		this.password = password;
		this.doctor = doctor;
		this.patient = patient;
		this.Appoiments = appoiments;
		this.medicalstore = medicalstore;
		this.healthclub = healthclub;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Doctor> getDoctor() {
		return doctor;
	}


	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}


	public List<Patient> getPatient() {
		return patient;
	}


	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}


	public List<Appointment> getAppoiments() {
		return Appoiments;
	}


	public void setAppoiments(List<Appointment> appoiments) {
		Appoiments = appoiments;
	}


	public List<Medicalstore> getMedicalstore() {
		return medicalstore;
	}


	public void setMedicalstore(List<Medicalstore> medicalstore) {
		this.medicalstore = medicalstore;
	}


	public List<HealthClub> getHealthclub() {
		return healthclub;
	}


	public void setHealthclub(List<HealthClub> healthclub) {
		this.healthclub = healthclub;
	}
}
package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Medicalstore
{
	@Id
	private int medicineId;
	private String medicineName;
    private int price;
	
	public Medicalstore() {
		super();
		
	}

	public Medicalstore(int medicineId, String medicineName, int price) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.price = price;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

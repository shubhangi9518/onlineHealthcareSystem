package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "packages")
public class Package {

    @Id
    private int packageId;
    private String packageName;
    private Double price; // Ensure this field exists

    public Package() {
        super();
    }

	public Package(int packageId, String packageName, Double price) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.price = price;
	}

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

   

}



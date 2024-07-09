package com.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "health_club")
public class HealthClub {

    @Id
    private int id;
    private String name;
    private String time;
    private LocalDate date;
    private String topic;
    
    //@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
    @OneToMany
    private List<Package> packages;

    public HealthClub() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthClub(int id, String name, String time, LocalDate date, String topic, List<Package> packages) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.date = date;
		this.topic = topic;
		this.packages = packages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public List<Package> getPackages() {
		return packages;
	}

	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}

	
	
    
	

	
}


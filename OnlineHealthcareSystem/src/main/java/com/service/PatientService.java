package com.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Patient;

public interface PatientService
{
    public Patient savePatient(Patient p);
    
    public  Patient getOnePatient(int id);
    
  public void deletePatient(int id);
	
  	//public Map<String,Object> deletePatient(int id) throws UserNotFoundException;
  	
  	public Patient updatePatient(Patient Patient);
}

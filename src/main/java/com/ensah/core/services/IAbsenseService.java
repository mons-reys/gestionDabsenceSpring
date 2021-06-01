package com.ensah.core.services;

import java.util.List;

import com.ensah.core.bo.Absence;


public interface IAbsenseService {

	public void addAbsence(Absence absense);

	public void updateAbsence(Absence absense);
	
	public List<Absence> getAllAbsences();
	
	public void deleteAbsence(Long id);
	
	public Absence getAbsenceById(Long id);

}

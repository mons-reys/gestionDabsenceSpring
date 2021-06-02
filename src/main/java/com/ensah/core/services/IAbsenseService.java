package com.ensah.core.services;

import java.util.List;

import com.ensah.core.bo.Absence;


public interface IAbsenseService {
	
	public List<Absence> getAllAbsences();
		
	public Absence getAbsenceById(Long id);

}

package com.ensah.core.services;

import java.util.List;

import com.ensah.core.bo.Etudiant;



public interface IEtudiantService {
	
	public List<Etudiant> getAllEtudiant();
	
	public Etudiant getEtudiantById(Long idEudiant);
	
}

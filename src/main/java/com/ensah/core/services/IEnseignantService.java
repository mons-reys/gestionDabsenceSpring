package com.ensah.core.services;

import com.ensah.core.bo.Etudiant;
import com.ensah.core.bo.Person;

import java.util.List;

public interface IEnseignantService {

    public List<Etudiant> getAllEtudiants();
    public String getSeance();
    public Boolean setAbsence(Etudiant etudiant);
    public Person getEtudiantById(Long id);
    public List getEtudiantHistory(long id);

}

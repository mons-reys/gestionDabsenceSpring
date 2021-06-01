package com.ensah.core.dao;

import com.ensah.core.bo.Etudiant;
import com.ensah.core.bo.Inscription;
import com.ensah.genericdao.GenericDao;

public interface IinscriptionDao extends GenericDao<Inscription,Long> {


    public Boolean checkInscription(Etudiant etudiant);

}

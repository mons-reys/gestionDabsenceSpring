package com.ensah.core.dao;

import com.ensah.core.bo.Etudiant;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class IEtudiantDaoImpl extends HibernateSpringGenericDaoImpl<Etudiant, Long> implements IEtudiantDao {

	public IEtudiantDaoImpl() {
		super(Etudiant.class);
	}

}

package com.ensah.core.dao;

import com.ensah.core.bo.Absence;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class IAbsenceDaoImpl extends HibernateSpringGenericDaoImpl<Absence, Long> implements IAbsenceDao  {

	public IAbsenceDaoImpl() {
		super(Absence.class);
	}

}

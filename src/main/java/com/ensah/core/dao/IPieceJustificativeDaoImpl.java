package com.ensah.core.dao;

import com.ensah.core.bo.PieceJustificative;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class IPieceJustificativeDaoImpl extends HibernateSpringGenericDaoImpl<PieceJustificative, Long> implements IPieceJustificativeDao {

	public IPieceJustificativeDaoImpl() {
		super(PieceJustificative.class);
		
	}

}

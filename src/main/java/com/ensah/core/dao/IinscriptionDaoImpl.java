package com.ensah.core.dao;

import com.ensah.core.bo.Etudiant;
import com.ensah.core.bo.Inscription;
import com.ensah.genericdao.EntityNotFoundException;

import java.util.List;

public class IinscriptionDaoImpl implements IinscriptionDao{
    @Override
    public Boolean checkInscription(Etudiant etudiant) {

        etudiant.getInscriptions();
        return null;
    }


    @Override
    public Long create(Inscription o) {
        return null;
    }

    @Override
    public void update(Inscription o) {

    }

    @Override
    public List<Inscription> getAll() {
        return null;
    }

    @Override
    public List<Inscription> getAllDistinct() {
        return null;
    }

    @Override
    public Inscription findById(Long pId) throws EntityNotFoundException {
        return null;
    }

    @Override
    public List<Inscription> getEntityByColValue(String ClassName, String pColumnName, String pValue) {
        return null;
    }

    @Override
    public void delete(Long pId) throws EntityNotFoundException {

    }

    @Override
    public boolean exists(Long pId) {
        return false;
    }
}

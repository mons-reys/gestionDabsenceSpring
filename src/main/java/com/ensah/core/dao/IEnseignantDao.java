package com.ensah.core.dao;

import com.ensah.core.bo.Enseignant;
import com.ensah.genericdao.EntityNotFoundException;
import com.ensah.genericdao.GenericDao;

import java.util.List;

public interface IEnseignantDao extends GenericDao<Enseignant,Long> {

    @Override
    Long create(Enseignant o);

    @Override
    void update(Enseignant o);

    @Override
    List<Enseignant> getAll();

    @Override
    List<Enseignant> getAllDistinct();

    @Override
    Enseignant findById(Long pId) throws EntityNotFoundException;

    @Override
    List<Enseignant> getEntityByColValue(String ClassName, String pColumnName, String pValue);

    @Override
    void delete(Long pId) throws EntityNotFoundException;

    @Override
    boolean exists(Long pId);

}

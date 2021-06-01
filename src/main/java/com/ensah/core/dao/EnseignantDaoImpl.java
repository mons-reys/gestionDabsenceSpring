package com.ensah.core.dao;


import com.ensah.core.bo.Enseignant;
import com.ensah.genericdao.EntityNotFoundException;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EnseignantDaoImpl extends HibernateSpringGenericDaoImpl<Enseignant,Long> implements IEnseignantDao {
    /**
     * Constructeur précisant la classe de l'objet métier manipulé
     *
     *  la classe de l'objet métier manipulé
 */
    public EnseignantDaoImpl() {
        super(Enseignant.class);
    }

    @Override
    public Long create(Enseignant pObject) {
        return super.create(pObject);
    }

    @Override
    public void update(Enseignant pObject) {
        super.update(pObject);
    }

    @Override
    public List<Enseignant> getAll() {
        return super.getAll();
    }

    @Override
    public void delete(Long pId) throws EntityNotFoundException {
        super.delete(pId);
    }

    @Override
    public boolean exists(Long id) {
        return super.exists(id);
    }

    @Override
    public Enseignant findById(Long pId) throws EntityNotFoundException {
        return super.findById(pId);
    }

    @Override
    public List<Enseignant> getAllDistinct() {
        return super.getAllDistinct();
    }

    @Override
    public List<Enseignant> getEntityByColValue(String ClassName, String pColumnName, String pValue) {
        return super.getEntityByColValue(ClassName, pColumnName, pValue);
    }
}

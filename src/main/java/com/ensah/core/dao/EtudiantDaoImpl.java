package com.ensah.core.dao;


import com.ensah.core.bo.Etudiant;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class EtudiantDaoImpl extends HibernateSpringGenericDaoImpl<Etudiant,Long> {
    /**
     * Constructeur précisant la classe de l'objet métier manipulé
     *
     *  la classe de l'objet métier manipulé
     */
    public EtudiantDaoImpl() {
        super(Etudiant.class);
    }
}

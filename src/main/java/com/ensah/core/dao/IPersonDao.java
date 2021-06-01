package com.ensah.core.dao;

import com.ensah.core.bo.Person;
import com.ensah.genericdao.EntityNotFoundException;
import com.ensah.genericdao.GenericDao;

import java.util.List;

public interface IPersonDao  extends GenericDao<Person, Long> {

    @Override
    Long create(Person o);

    @Override
    void update(Person o);

    @Override
    List<Person> getAll();

    @Override
    List<Person> getAllDistinct();

    @Override
    Person findById(Long pId) throws EntityNotFoundException;

    @Override
    List<Person> getEntityByColValue(String ClassName, String pColumnName, String pValue);

    @Override
    void delete(Long pId) throws EntityNotFoundException;

    @Override
    boolean exists(Long pId);
}

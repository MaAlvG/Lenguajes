package com.project.hospital.dao;


import com.sun.jdi.IntegerValue;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class PacienteDaoImp implements PacienteDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public int getMedicoCabecera() {
        String query = "FROM Paciente";
        return Integer.parseInt(entityManager.createQuery(query).toString());
    }
}

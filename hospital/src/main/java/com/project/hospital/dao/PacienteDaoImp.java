package com.project.hospital.dao;

import com.project.hospital.models.genericLst;
import com.project.hospital.models.paciente;
import com.sun.jdi.IntegerValue;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class PacienteDaoImp implements PacienteDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public int getMedicoCabecera() {
        String query = "FROM Paciente";
        return Integer.parseInt(entityManager.createQuery(query).toString());
    }

    @Override
    public void nuevoPct(paciente nuevoPct) {
        entityManager.merge(nuevoPct);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<paciente> getPacientes() {
        String query = "FROM paciente";
        return entityManager.createQuery(query).getResultList();
    }

}

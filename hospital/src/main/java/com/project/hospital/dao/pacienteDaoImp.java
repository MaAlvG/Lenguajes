package com.project.hospital.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import com.project.hospital.models.paciente;

@Repository
@Transactional
public class pacienteDaoImp implements pacienteDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<paciente> getPacientes() {
        String query = "FROM Usuario";
        @SuppressWarnings("unchecked")
        List<paciente> resultado = entityManager.createQuery(query).getResultList();
        return resultado;
    }

}

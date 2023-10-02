package com.project.hospital.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.hospital.models.cita;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CitaDaoImp implements CitaDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void generarCita(cita nuevaCita) {
        entityManager.merge(nuevaCita);
    }
}

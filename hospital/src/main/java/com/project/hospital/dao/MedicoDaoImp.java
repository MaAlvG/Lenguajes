package com.project.hospital.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.hospital.models.medico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class MedicoDaoImp implements MedicoDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void nuevoMed(medico nuevoMed) {
        entityManager.merge(nuevoMed);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<medico> getMedicos() {
        String query = "FROM medico";
        return entityManager.createQuery(query).getResultList();
    }
}

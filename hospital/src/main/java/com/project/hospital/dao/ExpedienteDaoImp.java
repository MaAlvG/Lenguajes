package com.project.hospital.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.hospital.models.expediente;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ExpedienteDaoImp implements ExpedienteDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void nuevoExp(expediente nuevoExp) {
        entityManager.merge(nuevoExp);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<expediente> getExpEspecifico(int id) {
        String query = "FROM expediente WHERE id = '" + id + "'";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<expediente> getExpedientes() {

        String query = "FROM expediente";
        return entityManager.createQuery(query).getResultList();
    }
}

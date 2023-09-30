package com.project.hospital.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class ExpedienteDaoImp implements ExpedienteDao{
    @PersistenceContext
    private EntityManager entityManager;
}

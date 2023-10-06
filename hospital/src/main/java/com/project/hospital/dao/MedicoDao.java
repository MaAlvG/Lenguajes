package com.project.hospital.dao;

import java.util.List;

import com.project.hospital.models.medico;

public interface MedicoDao {

    List<medico> getMedicos();

    void nuevoMed(medico nuevoMed);
}

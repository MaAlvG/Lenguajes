package com.project.hospital.dao;

import java.util.List;

import com.project.hospital.models.paciente;

public interface PacienteDao {
    int getMedicoCabecera();

    List<paciente> getPacientes();

    void nuevoPct(paciente nuevoPct);
}

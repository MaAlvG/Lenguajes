package com.project.hospital.dao;

import java.util.List;

import com.project.hospital.models.expediente;

public interface ExpedienteDao {
    List<expediente> getExpEspecifico(int id);

    List<expediente> getExpedientes();

    void nuevoExp(expediente nuevoExp);
}

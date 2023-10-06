package com.project.hospital.controllers;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.hospital.dao.CitaDao;
import com.project.hospital.dao.ExpedienteDao;
import com.project.hospital.dao.MedicoDao;
import com.project.hospital.dao.PacienteDao;
import com.project.hospital.models.cita;
import com.project.hospital.models.expediente;
import com.project.hospital.models.medico;
import com.project.hospital.models.paciente;

@RestController
public class userControllers {

    @Autowired
    private CitaDao citaDao;

    @Autowired
    private MedicoDao medicoDao;

    @Autowired
    private PacienteDao pacienteDao;
    @Autowired
    private ExpedienteDao expedienteDao;

    @RequestMapping(value = "api/paciente/{id}")
    public paciente getPaciente(@PathVariable int id) {
        paciente test1 = new paciente("aa", "BB", id, "333r", 0);
        System.out.println(test1.printInfo());
        return test1;
    }

    @RequestMapping(value = "api/cita", method = RequestMethod.POST)
    public void genCita(@RequestBody cita nuevaCita) {
        citaDao.generarCita(nuevaCita);

    }

    @RequestMapping(value = "api/addMedico", method = RequestMethod.POST)
    public void nuevoMed(@RequestBody medico nuevoMedico) {
        medicoDao.nuevoMed(nuevoMedico);

    }

    @RequestMapping(value = "api/addPaciente", method = RequestMethod.POST)
    public void nuevoPct(@RequestBody paciente nuevoPct) {
        pacienteDao.nuevoPct(nuevoPct);

    }

    @RequestMapping(value = "api/addExp", method = RequestMethod.POST)
    public void nuevoExp(@RequestBody expediente nuevoExp) {
        expedienteDao.nuevoExp(nuevoExp);

    }

    @RequestMapping(value = "api/pacientes")
    public List<paciente> getPacientes() {

        return pacienteDao.getPacientes();
    }

    @RequestMapping(value = "api/medicos")
    public List<medico> getMedicos() {
        return medicoDao.getMedicos();
    }

    @RequestMapping(value = "api/expediente/{id}")
    public List<expediente> getExpediente(@PathVariable int id) {

        return expedienteDao.getExpEspecifico(id);
    }

    @RequestMapping(value = "api/expediente")
    public List<expediente> getExpedientes() {

        return expedienteDao.getExpedientes();
    }

}

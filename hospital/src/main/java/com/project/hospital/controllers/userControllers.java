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
import com.project.hospital.models.cita;
import com.project.hospital.models.expediente;
import com.project.hospital.models.medico;
import com.project.hospital.models.paciente;

@RestController
public class userControllers {

    @Autowired
    private CitaDao citaDao;


    @RequestMapping(value = "api/paciente/{id}")
    public paciente getPaciente(@PathVariable int id) {
        paciente test1 = new paciente("aa", "BB", id, "333r", 0);
        System.out.println(test1.printInfo());
        return test1;
    }

    @RequestMapping(value = "api/cita{id}", method = RequestMethod.POST)
    public void genCita(@RequestBody cita nuevaCita) {
        citaDao.generarCita(nuevaCita);

    }

    @RequestMapping(value = "api/pacientes")
    public List<paciente> getPacientes() {
        List<paciente> pacientes = new ArrayList<>();
        paciente test1 = new paciente("aa", "BB", 1, "111r", 01);
        paciente test2 = new paciente("bb", "CC", 2, "222r", 02);
        paciente test3 = new paciente("cc", "DD", 3, "333r", 03);
        pacientes.add(test1);
        pacientes.add(test2);
        pacientes.add(test3);
        return pacientes;
    }

    @RequestMapping(value = "api/medicos")
    public List<medico> getMedicos() {
        List<medico> medicos = new ArrayList<>();
        medico test1 = new medico("aa", "BB", 1, "111r", "general");
        medico test2 = new medico("bb", "CC", 2, "222r", "oncologia");
        medico test3 = new medico("cc", "DD", 3, "333r", "reumatologia");
        medicos.add(test1);
        medicos.add(test2);
        medicos.add(test3);
        return medicos;
    }

    @RequestMapping(value = "api/expediente{id}")
    public List<expediente> getExpedientes(@PathVariable int id) {
        List<expediente> exps = new ArrayList<>();
        LocalDate hoy = LocalDate.now();
        expediente test1 = new expediente(1, hoy, "yes", "111r", "med1 med 2 med3");
        expediente test2 = new expediente(2, hoy, "no ", "222r", "med1 med 2 med3");
        expediente test3 = new expediente(3, hoy, "mby", "333r", "med1 med 2 med3");
        exps.add(test1);
        exps.add(test2);
        exps.add(test3);
        return exps;
    }

}

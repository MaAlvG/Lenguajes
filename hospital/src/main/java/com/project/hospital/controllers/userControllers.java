package com.project.hospital.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hospital.models.paciente;

@RestController
public class userControllers {

    @RequestMapping(value = "api/paciente/{ced}")
    public paciente getPaciente(@PathVariable int ced) {
        paciente test1 = new paciente("aa", "BB", ced, "333r", 0);
        System.out.println(test1.printInfo());
        return test1;
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
}

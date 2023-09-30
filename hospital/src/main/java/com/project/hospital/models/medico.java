package com.project.hospital.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "medico")
public class medico extends person {
    @Column(name = "idmed")
    private int IDMed;
    private static int genIDMed;
    @Column(name = "especialidad")
    private String especialidad;

    public int getIDMed() {
        return IDMed;
    }

    public static int getGenIDMed() {
        return genIDMed;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNombre() {
        return super.getNombre();
    }

    public String getApellido() {
        return super.getApellido();
    }

    public int getCedula() {
        return super.getCedula();
    }

    public String getMail() {
        return super.getMail();
    }

    public medico(String fN, String lN, int ced, String email, String especiality) {
        super(fN, lN, ced, email);
        this.especialidad = especiality;
        genIDMed++;
        this.IDMed = genIDMed;
    }

    public String getInfo() {
        String info = super.printInfo();
        info = info.concat(" Cedula Medica: ");
        info = info.concat(Integer.toString(IDMed));
        info = info.concat(" Especialidad: ");
        info = info.concat(especialidad);
        return info;
    }

    public String printFullName() {
        return super.printFullName();
    }
}

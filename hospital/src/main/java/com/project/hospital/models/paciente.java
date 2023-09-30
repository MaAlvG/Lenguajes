package com.project.hospital.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class paciente extends person {
    @Column(name = "medico_cabecera")
    private int medicoCabecera;

    public int getMedicoCabecera() {
        return medicoCabecera;
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

    public paciente(String fN, String lN, int ced, String email, int medicId) {

        super(fN, lN, ced, email);
        this.medicoCabecera = medicId;
    }

    public String printInfo() {
        String info = super.printInfo();
        info = info.concat(" Medico a cargo: ");
        info = info.concat(Integer.toString(medicoCabecera));
        return info;
    }

    public String printFullName() {
        return super.printFullName();
    }
}

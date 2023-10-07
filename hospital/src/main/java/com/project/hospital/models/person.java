package com.project.hospital.models;

//import lombok.Getter;
//import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class person {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "cedula")
    private int cedula;
    @Column(name = "correo")
    private String eMail;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public String getMail() {
        return eMail;
    }

    public person(String fN, String lN, int ced, String email) {
        this.nombre = fN;
        this.apellido = lN;
        this.cedula = ced;
        this.eMail = email;
    }

    public person(){}

    public String printInfo() {
        String info = "Nombre: ";
        info = info.concat(nombre);
        info = info.concat(" Apellido: ");
        info = info.concat(apellido);
        info = info.concat(" Cedula: ");
        info = info.concat(Integer.toString(cedula));
        info = info.concat(" eMail: ");
        info = info.concat(eMail);
        return info;
    }

    public String printFullName() {
        return nombre.concat(apellido);
    }
}

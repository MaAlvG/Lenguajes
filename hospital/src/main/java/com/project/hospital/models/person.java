package com.project.hospital.models;

public abstract class person {
    private String nombre;
    private String apellido;
    private int cedula;
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

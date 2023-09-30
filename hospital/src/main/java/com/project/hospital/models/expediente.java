package com.project.hospital.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class expediente {
    private int id;
    private LocalDate fecha;
    private String padecimiento;
    private String procedimiento;
    private ArrayList<String> medicamentos;

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public ArrayList<String> getMedicamentos() {
        return medicamentos;
    }

    public expediente(int id, LocalDate date, String sick, String procd, ArrayList<String> mdn) {
        this.id = id;
        this.fecha = date;
        this.padecimiento = sick;
        this.procedimiento = procd;
        this.medicamentos = mdn;
    }

    public String printExpediente() {
        String expediente = "Id del paciente: ";
        expediente = expediente.concat(Integer.toString(id));
        expediente = expediente.concat("\nFecha: ");
        expediente = expediente.concat(String.valueOf(fecha));
        expediente = expediente.concat("\nPadecimiento: ");
        expediente = expediente.concat(padecimiento);
        expediente = expediente.concat("\nProcedimiento: ");
        expediente = expediente.concat(procedimiento);
        expediente = expediente.concat("\nLista de medicamentos: ");

        for (int i = 0; i < medicamentos.size(); i++) {
            expediente = expediente.concat(medicamentos.get(i));
            expediente = expediente.concat(", ");

        }
        return expediente;
    }
}

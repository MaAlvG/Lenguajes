package com.project.hospital.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "expediente")
public class expediente {
    @Column(name = "id")
    private int id;
    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "padecimiento")
    private String padecimiento;
    @Column(name = "procedimiento")
    private String procedimiento;
    @Column(name = "medicamentos")
    private String medicamentos;

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

    public String getMedicamentos() {
        return medicamentos;
    }

    public expediente(int id, LocalDate date, String sick, String procd, String mdn) {
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
        expediente = expediente.concat(medicamentos);

        return expediente;
    }
}

package com.project.hospital.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "cita")
public class cita {
    // private static final int duration = 30;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int cita_id;
    @Column(name = "medico_id")
    private int medico_id;
    @Column(name = "paciente_id")
    private int paciente_id;
    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "hora")
    private LocalTime hora;

    public int getMedico_id() {
        return medico_id;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public cita(LocalDate date, LocalTime hour, int md, int pct) {
        this.medico_id = md;
        this.paciente_id = pct;
        this.fecha = date;
        this.hora = hour;
    }

    public String printCita() {
        String cita = "Duracion: 30 minutos\nMedico a cargo: ";
        cita = cita.concat(Integer.toString(medico_id));
        cita = cita.concat("\nPaciente: ");
        cita = cita.concat(Integer.toString(paciente_id));
        cita = cita.concat("\nFecha: ");
        cita = cita.concat(String.valueOf(fecha));
        cita = cita.concat("\nHora: ");
        cita = cita.concat(String.valueOf(hora));
        return cita;
    }
}

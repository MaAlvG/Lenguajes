package com.project.hospital.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class cita {
    // private static final int duration = 30;
    private int medico_id;
    private int paciente_id;
    private LocalDate fecha;
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

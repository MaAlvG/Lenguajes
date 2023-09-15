package com.lenguajes.javaFIles;

import java.time.LocalDate;

public class appointment {
    private static final int duration = 30;
    private medic medico;
    private pacient paciente;
    private LocalDate date;

    public appointment(medic md, pacient pct, LocalDate date) {
        this.medico = md;
        this.paciente = pct;
        this.date = date;
    }
}

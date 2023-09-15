package com.lenguajes.javaFIles;

public class medic extends person {
    private int IDMed;
    private static int genIDMed;
    private String especiality;

    public medic(String fN, String lN, int ced, String email, String especiality) {
        super(fN, lN, ced, email);
        this.especiality = especiality;
        genIDMed++;
        this.IDMed = genIDMed;
    }

}

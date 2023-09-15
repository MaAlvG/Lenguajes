package com.lenguajes.javaFIles;

public abstract class person {
    private String fName;
    private String lName;
    private int ced;
    private String eMail;

    public person(String fN, String lN, int ced, String email) {
        this.fName = fN;
        this.lName = lN;
        this.ced = ced;
        this.eMail = email;
    }

}

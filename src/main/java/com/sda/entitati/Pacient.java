package com.sda.entitati;

public class Pacient {
    private String nume;
    private String diagnostic;

    public Pacient(String nume, String diagnostic) {
        this.nume = nume;
        this.diagnostic = diagnostic;
    }

    public String getNume() {
        return nume;
    }

    public String getDiagnostic() {
        return diagnostic;
    }
}

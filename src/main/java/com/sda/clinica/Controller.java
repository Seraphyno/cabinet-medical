package com.sda.clinica;

import com.sda.entitati.Doctor;

public class Controller {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Alex Ionescu", "cardiologie");
        doctor.addPatient();
    }
}

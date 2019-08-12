package com.sda.clinica;

import com.sda.database.DatabaseAccess;
import com.sda.entitati.Doctor;
import com.sda.entitati.Pacient;

public class Controller {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Alex Ionescu", "cardiologie");
        Pacient pacient = new Pacient("Ion Alexandrescu", "aritmie severa");
        doctor.addPatient(pacient);

        DatabaseAccess.closeClientConnection();
    }
}

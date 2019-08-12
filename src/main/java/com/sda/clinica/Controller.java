package com.sda.clinica;

import com.sda.database.DatabaseAccess;
import com.sda.entitati.Doctor;
import com.sda.entitati.Pacient;

public class Controller {

    public static void main(String[] args) {
        DatabaseAccess db = DatabaseAccess.getDatabaseAccess();

        Doctor doctor = new Doctor("Alex Ionescu", "cardiologie");
        Doctor chirurg = new Doctor("Vlad Ene", "chirurgie");


        Pacient pacient1 = new Pacient("Ion Alexandrescu", "aritmie severa");
        Pacient pacient2 = new Pacient("Dan Popescu", "aritmie");
        Pacient pacient3 = new Pacient("Alin Ionescu", "apendicita");
        Pacient pacient4 = new Pacient("Ion Alexandrescu", "tumora operabila");

        doctor.addPatient(pacient1);
        doctor.addPatient(pacient2);
        chirurg.addPatient(pacient3);
        chirurg.addPatient(pacient4);


        db.printDoctors();
        db.printPatients();

        DatabaseAccess.closeClientConnection();
    }
}

package com.sda.entitati;

import com.sda.database.DatabaseAccess;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

    private final DatabaseAccess db = DatabaseAccess.getDatabaseAccess();

    private String name;
    private String specialitate;
    private List<Pacient> pacienti;

    public Doctor(String name, String specialitate) {
        this.name = name;
        this.specialitate = specialitate;
        this.pacienti = new ArrayList<>();
        //todo - la crearea unui doctor trebuie salvat in db
    }

    public String getName() {
        return name;
    }

    public String getSpecialitate() {
        return specialitate;
    }

    public List<Pacient> getPacienti() {
        return pacienti;
    }

    public void addPatient(Pacient pacient) {
        Document doctor = db.findDocument("doctori", this.name);
        ArrayList<Pacient> pacienti = (ArrayList<Pacient>) doctor.get("pacienti");
        //daca nu exista in lista , il adaugam
        if (!pacienti.contains(pacient)) {
            pacienti.add(pacient);
            db.update(pacienti);
        }
    }
}

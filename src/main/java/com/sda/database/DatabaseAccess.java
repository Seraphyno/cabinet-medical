package com.sda.database;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.sda.entitati.Pacient;
import org.bson.Document;

import java.util.ArrayList;

public class DatabaseAccess {

    private MongoClient client;
    private MongoDatabase database;
    private static DatabaseAccess db;

    private DatabaseAccess() {
        this.client = new MongoClient();
        this.database = client.getDatabase("clinica");
    }

    public static DatabaseAccess getDatabaseAccess() {
        if (db == null) {
            db = new DatabaseAccess();
        }
        return db;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void closeClientConnection() {
        client.close();
    }

    /**
     * @param entityType doctori sau pacienti
     * @param nume       numele persoanei cautate
     * @return o persoana
     */
    public Document findDocument(String entityType, String nume) {
        String collectionName = "doctori";
        if ("pacienti".equals(entityType)) {
            collectionName = "pacienti";
        }
        MongoCollection<Document> collection = database.getCollection(collectionName);
        return collection.find(new Document("nume", nume)).first();
    }

    public void update(ArrayList<Pacient> pacienti) {
        MongoCollection<Document> doctori = database.getCollection("doctori");
        //todo - complete the update
        doctori.updateOne();
    }
}

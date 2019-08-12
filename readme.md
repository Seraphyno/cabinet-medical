### Exercitiu

- Creati o baza de date pt o clinica care sa contina doctori cu pacientii asignati
- Un doctor poate sa aiba mai multi pacienti

Creati:

- clasa database-access care se ocupa cu citire/salvare in db
- clasa doctor (name, specialitate, lista pacienti)
- clasa pacient (name, diagnostic)
- clasa controller (main) - salvati 2 doctori si 4 pacienti
    - asignati cei 4 pacienti la doctori
    - in orice moment afisati doctorii cu pacientii asignati
    + bonus: afisati doar pacientii
    
    
baza de date va fi MongoDb, unde vom folosi:
 - database - clinica
 - collection - doctori
public class App {
    public static void main(String[] args) throws Exception {
      
    //erzeug zwei Studierendern
    Studierender student1 = new Studierender("Ada", "12345678", "UXD2");
    Studierender student2 = new Studierender("Ben", "23456781", "UXD2");

    //erzeug zwei Dozierendern
    Dozierender dozent1 = new Dozierender("Nestler","Informatik","C303");
    Dozierender dozent2 = new Dozierender("Sturm","Informatik","C304");

    //erzeugen Vorlesungsstunde
    Vorlesungsstunde vorlesungsstunde = new Vorlesungsstunde("Java", "2024-05-01", "10:00", "C303");
    vorlesungsstunde.detailsAnzeigen();

    //erzeugen Praktikumsstunde
    Praktikumsstunde praktikumsstunde = new Praktikumsstunde("Java", "2024-05-01", "11:00", "C304", "Aufgabe1");
    praktikumsstunde.detailsAnzeigen();

    //frage stellen
    student1.frageStellen(dozent1.getName(),"wann haben wir praktikum? ");
    dozent1.frageBeantworten(student1.getName(),"Praktikum findet am Freitag statt.");

    //Sprechstundenanfrage
    student2.sprechstundenAnfrageSenden(dozent2.getName(),"Gruppeteilung in SoSe2024");
    dozent2.sprechstundenanfrageerhalten();
    //dozent2.feedbackVerwalten(student2.getName(),"sehr gut");

    //erzeugen Lehrveranstaltung
   /* Lehrveranstaltung lehrveranstaltung = new Lehrveranstaltung(dozent1,student1,vorlesungsstunde,praktikumsstunde);
    lehrveranstaltung.addStudierender(student2);
    lehrveranstaltung.addVorlesungsstunde(vorlesungsstunde);
    lehrveranstaltung.addPraktikumsstunde(praktikumsstunde);
    lehrveranstaltung.anzeigenVeranstaltungsdetails();
    */
    
    //erzeugen Sprechstunde
   // Sprechstunde sprechstunde = new Sprechstunde("Java", "2024-05-01", "10:00", "C303");
    //sprechstunde.detailsAnzeigen();
    //erzeugen Feedback
    
   // dozent1.feedbackVerwalten(student1, "sehr gut" );
    }
}
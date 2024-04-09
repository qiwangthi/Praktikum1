import java.security.cert.PKIXRevocationChecker;

public class Lehrveranstaltung {
    //Datenfield
    private String titel;
    /*private String Dozierende;
    private String Studierende;
    private String Vorlesungsstunden;
    private String Praktikumsstunden;*/

    //Konstruktor
    public Lehrveranstaltung (String titel){
        this.titel = titel;
    }

    //Hinzufügen/Entfernen von Studierenden
    public void addStudierenden(Studierender studierender){   
    }
    public void removeStudierenden(Studierender studierender){   
    }
    //Hinzufügen von Vorlesungs- und Praktikumsstunden
    public void addVorlesungsstunde(Vorlesungsstunde vorlesungsstunde){   
    }
    public void addPraktikumsstunden(Praktikumsstunden praktikumsstunden){   
    }
    //Anzeigen der Veranstaltungsdetails
    public void anzeigenVeranstaltungsdetails() {
        System.out.println("Titel:"+ this.titel);
        System.out.println("Dozierender:" dozierender.getName());
    
        System.out.println("Studierender:")
        for (Studierender studierender : StudierenderListe){
            System.out.println("-"+ studierender.getName());
        }
        System.out.println("Vorlesungstunde:")
        for (Vorlesungsstunde vorlesungsstunde: VorlesungsstundeListe){
            System.out.println("- Thema: " + vorlesungsstunde.getThema());
            System.out.println("  Datum: " + vorlesungsstunde.getDatum());
            System.out.println("  Uhrzeit: " + vorlesungsstunde.getUhrzeit());
            System.out.println("  Raum: " + vorlesungsstunde.getRaum());
        }
        
        System.out.println("Praktikumsstunden:");
        for (Praktikumsstunde praktikumsstunde : praktikumsstundenListe) {
            System.out.println("- Thema: " + praktikumsstunde.getThema());
            System.out.println("  Datum: " + praktikumsstunde.getDatum());
            System.out.println("  Uhrzeit: " + praktikumsstunde.getUhrzeit());
            System.out.println("  Raum: " + praktikumsstunde.getRaum());
            System.out.println("  Aufgaben: " + praktikumsstunde.getAufgaben());
        }
        }
}

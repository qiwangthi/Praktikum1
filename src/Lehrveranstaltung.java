import java.security.cert.PKIXRevocationChecker;

public class Lehrveranstaltung {
    //Datenfield
    private String titel;
    private Dozierender dozierender;
    private Studierender studierender;
    private int Vorlesungsstunde;
    private int Praktikumsstunde;

    //Konstruktor
    public Lehrveranstaltung (String titel, Dozierender dozierender,Studierender studierender,int Vorlesungsstunde,int Praktikumsstunden ){
        this.titel = titel;
        this.dozierender = dozierender;
        this.studierender= studierender;
        this.vorlesungsstunde = vorlesungsstunde;
        this.praktikumsstunde = praktikumsstunden;



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
        System.out.println("Vorlesungstunde: " +)
        
        
        System.out.println("Praktikumsstunden:");
        
        }
}

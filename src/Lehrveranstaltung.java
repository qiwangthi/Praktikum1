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

    //get-Methode
    public String getTitel(){
        return this.titel;
    }
    public Dozierender getDozierender(){
        return this.dozierender;
    } 
    public Studierender getStudierender(){
        return this.studierender;
    }
    public int getVorlesungsstunde(){
        return this.vorlesungsstunde;
    }
    public int getPraktikumsstunde(){
        return this.praktikumsstunde;
    }

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
        System.out.println("Titel: "+ this.titel);
        System.out.println("Dozierender: " + dozierender.getName());
        System.out.println("Studierender: "+ studierender.getName();
        System.out.println("Vorlesungstunde: " +vorlesungsstunde.getName())
        System.out.println("Praktikumsstunden: "+ praktikumsstunde.getName());
        
        }
}

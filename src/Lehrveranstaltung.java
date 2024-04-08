public class Lehrveranstaltung {
    //Datenfelder
    private String titel;
    private String dozierende;
    private String studierende;
    private float vorlesungsstunde;
    private float praktikumsstunde;

    //Konstrucktor
    public Lehrveranstaltung(String titel,String dozierende,String studierende,float vorlesungsstunde,float praktikumsstunde ){
        this.titel=titel;
        this.dozierende=dozierende;
        this.studierende=studierende;
        this.vorlesungsstunde=vorlesungsstunde;
        this.praktikumsstunde=praktikumsstunde;
    }
    //öffentliche Methode
    public void addStudierend(Studierender studierender){

    }
    public void removeStudierend(Studierender studierender){
        
    }
    public void addVorlesungsstunde(Vorlesungsstunde vorlesungsstunde ){
        
    }
    public void removeVorlesungsstunde(Vorlesungsstunde vorlesungsstunde ){
        
    }
    public void anzeigenVeranstaltungsDetails(Titel titel,Dozierender do ){
        
    }
}

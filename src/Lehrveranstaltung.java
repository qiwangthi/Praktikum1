import java.security.cert.PKIXRevocationChecker;
import java.util.ArrayList;
import java.util.List;
public class Lehrveranstaltung {
    //Datenfield
    //private String titel;
    private Dozierender dozierender;
    private List<Studierender> studierender;
    private int Vorlesungsstunde;
    private int Praktikumsstunde;

    //Konstruktor
    public Lehrveranstaltung ( Dozierender dozierender,String studierender,int Vorlesungsstunde,int Praktikumsstunden ){
        //this.titel = titel;
        this.dozierender = dozierender;
        this.studierender= new ArrayList<>();
        this.vorlesungsstunde = vorlesungsstunde;
        this.praktikumsstunde = praktikumsstunden;
    }
    //get-Methode
    /*public String (){
        return this.titel;
    }
            

*/



    public Dozierender getDozierender(){
        return this.dozierender;
    } 
    //public Studierender getStudierender(){
        //return this.studierender;
        
    public int getVorlesungsstunde(){
        return this.vorlesungsstunde;
    }
    public int getPraktikumsstunde(){
        return this.praktikumsstunde;
    }
    //set-Methode
    public void setDozierender(Dozierender dozierender){
        this.dozierender = dozierender;
    }
    public void setStudierender(Studierender studierender){
        this.studierender = new ArrayList<>();
    }
    public void setVorlesungsstunde(int vorlesungsstunde){
        this.vorlesungsstunde = vorlesungsstunde;
    }
    public void setPraktikumsstunde(int praktikumsstunde){
        this.praktikumsstunde = praktikumsstunde;
    }
    public void addStudierender(Studierender studierender){
        this.studierender.add(studierender);
    }
    public void removeStudierender(Studierender studierender){
        this.studierender.remove(studierender);
    }
    public void addVorlesungsstunde(int vorlesungsstunde){
        this.vorlesungsstunde += vorlesungsstunde;
    }
    public void addPraktikumsstunde(int praktikumsstunde){
        this.praktikumsstunde += praktikumsstunde;
    }   
    public void anzeigenVeranstaltungsdetails(){
        System.out.println("Dozierender: "+ this.dozierender.getName());
        System.out.println("Studierende: ");
        for (Studierender studierender : this.studierender){
            System.out.println(studierender.getName());
        }
        System.out.println("Vorlesungsstunde: "+ this.vorlesungsstunde);
        System.out.println("Praktikumsstunde: "+ this.praktikumsstunde);
    }
       
    
}

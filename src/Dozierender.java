import java.util.ArrayList;
import java.util.List;

public class Dozierender {
//Daten field
private String name;
private String fakultaet;
private String bueronummer;
private List<String> feedbacks;

//konstruktor
public Dozierender (String name,String fakultaet,String bueronummer){
    this.name = name;
    this.fakultaet = fakultaet;
    this.bueronummer = bueronummer;
    this.feedbacks = new ArrayList<>();
}

//get-Methode
public String getName(){
    return this.name;
}
public String getFakultaet(){
    return this.fakultaet;
}
public String getBueronummer(){
    return this.bueronummer;
}
//Öffentliche Methode:
public void frageBeantworten(Studierender student,String antwort){
System.out.println("von:"+ getName());
System.out.println("an:"+ student);
System.out.println("Antwort:"+ antwort);
}
//feedback von Donzent
public void feedbackVerwalten(Feedback feedback)
}

    private String name;
    private String fakultaet;
    private String bueronummer;

    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFakultaet() {
        return fakultaet;
    }

    public void setFakultaet(String fakultaet) {
        this.fakultaet = fakultaet;
    }

    public String getBueronummer() {
        return bueronummer;
    }

    public void setBueronummer(String bueronummer) {
        this.bueronummer = bueronummer;
    }
    
    public void frageBeantworten(String student, String antwort){
        System.out.println("Antwort von: "+this.name);
        System.out.println("Antwort an: "+student);
        System.out.println(antwort);
    }
}



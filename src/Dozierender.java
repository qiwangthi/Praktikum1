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

}



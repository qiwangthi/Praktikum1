public class Dozierender {
//Daten field
private String name;
private String fakultaet;
private String bueronummer;

//konstruktor
public Dozierender (String name,String fakultaet,String bueronummer){
    this.name = name;
    this.fakultaet = fakultaet;
    this.bueronummer = bueronummer;
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
public void frageBeantworten(Studierender studierender,String antwort){
System.out.println("von:"+ getName());
System.out.println("an:"+ studierender);
System.out.println("Antwort:"+ antwort);


}

}

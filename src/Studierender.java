// Klasse Studierender
public class Studierender {
    // Datenfelder
  private String name;
  private String matrikelnummer;
  private String studiengang;

  // Konstruktor
  public Studierender(String name,String matrikelnummer,String studiengang){
    this.name = name;
    this.matrikelnummer = matrikelnummer;
    this.studiengang = studiengang;
  }
//Öffentliche Methode
  public  String frageStellen (Dozierender dozierender,String frage){
    return dozierender.frageBeantworten(this.frage);
  }
  public String getName(){
    return this.name;
  }
  public String getMatrikelnummer(){
    return this.matrikelnummer;
  }
  public String getStudiengang(){
    return this.studiengang;
  }

  
// Methode , um eine Sprechstundenanfrage an einen Dozierenden zu senden
   public void sprechstundenAnfrageSenden(Dozierender dozierender,String grund){
    dozierender.sprechstundenAnfrageErhalten(this.grund);
   }
   


  
}

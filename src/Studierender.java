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
  // Get-Methode
  public String getName(){
    return this.name;
  }
  public String getMatrikelnummer(){
    return this.matrikelnummer;
  }
  public String getStudiengang(){
    return this.studiengang;
  }

  //Öffentliche Methode
  public void frageStellen(String dozierender,String frage){
    System.out.println("von:"+ this.name);
    System.out.println("an:"+ dozierender);
    System.out.println("Frage:"+ frage);
  }
// Methode , um eine Sprechstundenanfrage an einen Dozierenden zu senden
   //public void sprechstundenAnfrageSenden(Dozierender dozierender,String grund){
    //dozierender.sprechstundenAnfrageErhalten(grund);
   //}
   

  
   
}

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
  
  //methode um sprechstundenanfrage zu senden
   public void sprechstundenAnfrageSenden(Dozierender dozierender,String grund){
   // System.out.println("Sprechstundenanfrage von "+this.name);
    System.out.println("Grund der Anfrage: "+ grund);
   }

  
   
}

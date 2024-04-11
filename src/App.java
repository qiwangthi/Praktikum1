public class App {
    public static void main(String[] args) throws Exception {
      
    //erzeug zwei Studierendern
    Studierender student1 = new Studierender("Ada", "12345678", "UXD2");
    Studierender student2 = new Studierender("Ben", "23456781", "UXD2");

    //erzeug zwei Dozierendern
    Dozierender dozent1 = new Dozierender("Nestler","Informatik","C303");
    Dozierender dozent2 = new Dozierender("Sturm","Informatik","C304");
    
    //frage stellen
    student1.frageStellen(dozent1.getName(),"wann haben wir praktikum? ");
    dozent1.frageBeantworten(student1,"Praktikum findet am Freitag statt.");

    //Sprechstundenanfrage
    student2.sprechstundenAnfrageSenden(dozent2.getName(),"Gruppeteilung in SoSe2024");
    
    //feedbackverwaltung
    
    dozent2.feedbackVerwalten("Ben","1","sehr gute Beteiligung im Seminar");
    }  
} 

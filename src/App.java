public class App {
    public static void main(String[] args) throws Exception {
      
    //erzeug ein Studierender
    Studierender studierender = new Studierender("Qi", "00153608", "UXD");
    //erzeug ein Dozierender
    Dozierender dozierender = new Dozierender("Nestler","UXD","C303");
    //frage stellen
    studierender.frageStellen(dozierender.getName(),"wann haben wir praktikum? ");
    dozierender.frageBeantworten(studierender,"Praktikum findet am Freitag statt.");
   
    }  
} 

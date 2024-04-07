public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    //erzeug ein Studierender
    Studierender studierender = new Studierender("Qi", "00153608", "UXD");
    //erzeug ein Dozierender
    Doziernder dozierender = new Dozierender(name:"Nestler","UXD","C303");
    //frage stellen
    Dozierender.fragestellen(doziernder,"wann haben wir praktikum? ")
    
   
    
} 

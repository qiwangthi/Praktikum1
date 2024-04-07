public class App {

    public static void main(String[] args) throws Exception {
        Dozierender dozent1 = new Dozierender("Nestler", "I", "C303");
        Dozierender dozent2 = new Dozierender("Sturm", "I", "J102");
        Studierender student1 = new Studierender("Ada", "1234567", "UXD2");
        Studierender student2 = new Studierender("Rox", "1357913", "UXD2");
        
        //student1.frageStellen("Nestler", "Wann haben wir Praktikum?");
        student2.frageStellen(dozent1.getName(), "Wann haben wir Praktikum?");
        dozent1.frageBeantworten(student2.getName(), "Praktikum findet am Freitag statt.");
        
    }
}
}

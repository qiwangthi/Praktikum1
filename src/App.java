public class App {

    public static void main(String[] args) throws Exception {

        //Erstellung von Kommunikationsteilnehmern
        Dozierender dozent1 = new Dozierender("Nestler", "I", "C303");
        Dozierender dozent2 = new Dozierender("Sturm", "I", "J102");
        Studierender student1 = new Studierender("Ada", "1234567", "UXD2");
        Studierender student2 = new Studierender("Rox", "1357913", "UXD2");
        
        //Test des Dialogs
        student2.frageStellen(dozent1.getName(), "Wann haben wir Praktikum?");
        dozent1.frageBeantworten(student2.getName(), "Praktikum findet am Freitag statt.");
        
        //Erstellung von Vorlesungsstunde
        Vorlesungsstunde vorlesung1 = new Vorlesungsstunde("Wiederholung", "11. April, 2024", "14:05:00", "K015");
        vorlesung1.detailsAnzeigen();

        //Erstellung von Praktikumsstunde
        Praktikumsstunde praktikum1 = new Praktikumsstunde("GitHub", "12. April, 2024", "09:00", "C303", "Aufabe 1 in Moodle");
        praktikum1.detailsAnzeigen();

        //Test des Dialogs 2
        student1.frageStellen(dozent2.getName(), "Wann haben wir Praktikum?");
        dozent2.frageBeantworten(student1.getName(), "Hier finden Sie Informationen zur folgenden Praktikum:");
        praktikum1.detailsAnzeigen();
    }
}


import java.util.ArrayList;
import java.util.List;

public class Lehrveranstaltung {
    private String titel;
    private List<Studierender> studierende;
    private List<Dozierender> dozierende;
    private List<Vorlesungsstunde> vorlesungsstunden;
    private List<Praktikumsstunde> praktikumsstunden;

    public Lehrveranstaltung(String titel) {
        this.titel = titel;
        this.studierende = new ArrayList<>();
        this.dozierende = new ArrayList<>();
        this.vorlesungsstunden = new ArrayList<>();
        this.praktikumsstunden = new ArrayList<>();
    }

    public List<Studierender> getStudierende() {
        return studierende;
    }

    public List<Dozierender> getDozierende() {
        return dozierende;
    }

    public void addStudierender(Studierender studierender) {
        studierende.add(studierender);
    }

    public void removeStudierender(Studierender studierender) {
        studierende.remove(studierender);
    }

    public void addDozierender(Dozierender dozierender) {
        dozierende.add(dozierender);
    }

    public void addVorlesungsstunde(Vorlesungsstunde vorlesungsstunde) {
        vorlesungsstunden.add(vorlesungsstunde);
    }

    public void addPraktikumsstunde(Praktikumsstunde praktikumsstunde) {
        praktikumsstunden.add(praktikumsstunde);
    }

    public void anzeigenDetails() {
        System.out.println("Lehrveranstaltung: " + titel);
        System.out.println("Teilnehmende Studierende: " + studierende.size());
        System.out.println("Lehrende Dozierende: " + dozierende.size());
        System.out.println("Vorlesungsstunden: " + vorlesungsstunden.size());
        System.out.println("Praktikumsstunden: " + praktikumsstunden.size());
    }
}
public class Studierender {
    private String name;
    private String matrikelnummer;
    private String studiengang;

    public Studierender(String name, String matrikelnummer, String studiengang){
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public void frageStellen(String dozent, String frage){
        System.out.println("Frage von: "+this.name);
        System.out.println("Frage an: "+dozent);
        System.out.println(frage);
    }
}

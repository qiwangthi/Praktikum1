public class Dozierender {

    private String name;
    private String fakultaet;
    private String bueronummer;
    private String feedback;

    public Dozierender(String name, String fakultaet, String bueronummer){
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setFakultaet(String fakultaet){
        this.fakultaet = fakultaet;
    }

    public String getFakultaet(){
        return fakultaet;
    }

    public void setBueronummer(String bueronummer){
        this.bueronummer = bueronummer;
    }

    public String getBueronummer(){
        return bueronummer;
    }

    public void setFeedback(String feedback){
        this.feedback = feedback;
    }

    public String getFeedback(){
        return feedback;
    }

    public void frageBeantworten(Studierender studierender, String antwort){

    }
    ;
}

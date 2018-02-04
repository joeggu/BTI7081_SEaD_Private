package test;

/**
 * Created by dario on 21.06.2017.
 */
public enum Status {
    IN_PROGRESS("In bearbeitung"),
    OPEN("Offen"),
    DONE("Fertig");

    private String desc;

    Status(String desc){
        this.desc = desc;
    }

    public String desc(){
        return this.desc;
    }
}

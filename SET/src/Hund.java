import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fragenmaschine v1
 * Created by tdolfen on 05.07.2017.
 */
public class Hund {


    //Name

    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    //Farbe

    private String farbe;


    public String getFarbe() {
        return this.farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    //Rasse

    private String rasse;

    public String getRasse() {
        return this.rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }

    //Augenfarbe

    private String augenfarbe;

    public String getAugenfarbe() {
        return this.rasse;
    }

    public void setAugenfarbe(String augenfarbe) {
        this.augenfarbe = augenfarbe;
    }

    //Größe

    private Double groesse;

    public Double getGroesse() {
        return this.groesse;
    }

    public void setGroesse(Double groesse) {
        this.groesse = groesse;
    }

    //Gewicht

    private Double gewicht;

    public Double getGewicht() {
        return this.gewicht;
    }

    public void setGewicht(Double gewicht) {
        this.gewicht = gewicht;
    }

    //Alter

    private Double alter;

    public Double getAlter() {
        return this.alter;
    }

    public void setAlter(Double alter) {
        this.alter = alter;
    }

    //Gefahr

    public Boolean gefahr;

    public Boolean getGefahr() {
        return this.gefahr;
    }

    public void setGefahr(Boolean gefahr) {
        this.gefahr = gefahr;
    }

    //Schlappohren

    public Boolean schlapp;

    public Boolean getSchlapp() {
        return this.schlapp;
    }

    public void setSchlapp(Boolean schlapp)
    {
        this.schlapp = schlapp;
    }

}


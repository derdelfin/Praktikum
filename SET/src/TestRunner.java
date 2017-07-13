import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Fragenmaschine v1
 * Created by tdolfen on 05.07.2017.
 */
public class TestRunner
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hund hund = new Hund();
        //Name
        System.out.println("Wie soll der Hund heißen?");
        String name = input.nextLine();
        hund.setName(name);
        hund.getName();
        //Antwort
        System.out.println("Schöner Name!");
        //Farbe
        System.out.println("Welche Farbe soll der Hund haben?");
        String farbe = input.nextLine();
        hund.setFarbe(farbe);
        hund.getFarbe();
        //Antwort
        System.out.println("Okay, der Hund ist " + farbe + ".");
        //Rasse
        System.out.println("Welche Rasse soll der Hund sein?");
        String rasse = input.nextLine();
        hund.setRasse(rasse);
        hund.getRasse();
        //Antwort
        System.out.println("Gut, er ist " + rasse + ".");
        //Augenfarbe
        System.out.println("Welche Augenfarbe soll der Hund haben?");
        String augenfarbe = input.nextLine();
        hund.setAugenfarbe(augenfarbe);
        //Antwort
        System.out.println("Okay, der Hund hat die Augenfarbe " + augenfarbe);
        //Größe
        System.out.println("Wie groß soll der Hund sein? Bitte in Zentimetern angeben!");
        Double groesse = input.nextDouble();
        hund.setGroesse(groesse);
        hund.getGroesse();
        //Antwort
        if (groesse <= 100) {
            System.out.println("Wow! Der Hund ist ziemlich klein!");
        } else if (groesse > 100) {
            System.out.println("Wow! Der Hund ist ziemlich groß!");
        } else {
            System.out.println("Ungültiger Wert!");
            System.exit(0);
        }
        //Gewicht
        System.out.println("Wie schwer soll der Hund sein? Maße bitte in kg!");
        Double gewicht = input.nextDouble();
        hund.setGewicht(gewicht);
        hund.getGewicht();
        //Antwort
        System.out.println("Der Hund wird " + gewicht + "kg wiegen!");
        //Alter
        System.out.println("Wie alt ist der Hund?");
        Double alter = input.nextDouble();
        hund.setAlter(alter);
        //Antwort
        System.out.println("Bald geschafft! Der Hund ist " + alter + "Jahre alt.");
        //Gefahr
        System.out.println("Ist der Hund ein Kampfhund? true/false");
        Boolean gefahr = false;
        try {
            gefahr = input.nextBoolean();
        } catch (Exception InputMismatchException) {
            System.out.println("Es darf leider nur 'true' oder 'false' eingegeben werden");
            System.exit(0);
        }

        hund.setGefahr(gefahr);
        //Antwort
        if (gefahr) {
            System.out.println("Der Hund wird gefährlich sein!");
        } else {
            System.out.println("Es ist ein harmloser Hund!");
        }
        //Schlappohren
        System.out.println("Hat der Hund Schlappohren? true/false");
        Boolean schlapp = input.nextBoolean();
        hund.setSchlapp(schlapp);
        //Antwort
        if (schlapp == true) {
            System.out.println("Wie süß!");
        } else {
            System.out.println("Er wird keine Schlappohren haben.");
        }

        //Vorstellen des Hundes

        System.out.println("Du bist mit den Fragen zum Hund durch. Soll er sich dir vorstellen?");
        String answer = input.nextLine();

        System.out.println(answer);

//        if (answer.toLowerCase().equals("ja"))
//        {
//            System.out.println("Okay,ich rufe den Hund für dich!");
//        }
//        else if (answer.toLowerCase().equals("nein"))
//        {
//            System.out.println("Schade, er wollte doch nur spielen!\nBis dann!");
//            System.exit(0);
//        }
    }
}

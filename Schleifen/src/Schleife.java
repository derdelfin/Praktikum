import java.util.Scanner;
/**
 * Fragenmaschine v1
 * Created by tdolfen on 06.07.2017.
 */
public class Schleife
{

    public static void main(String[] args)
    {
        String käse = new String();
        String wort;
        String anfang;
        Scanner Schleife = new Scanner(System.in);
        int zahl;
        int zaehler = 0;


        System.out.println("Hallo, willst du mit mir ein Wort erraten?");
        wort = Schleife.nextLine();
        if ( wort.toLowerCase().equals("ja") )
        {
            System.out.println("Super! Es geht um ein Lebensmittel!");
        }
        else if ( wort.toLowerCase().equals("nein") )
        {
            System.out.println("Schade, bis dann!");
            System.exit(0);
        }
        else
        {
            System.out.println("Ungültige Eingabe.");
            System.exit(0);
        }


        wort = Schleife.nextLine();

        while (!wort.equals(käse))
        {
            if (wort.equals(käse))
            {
                break;
            }

            System.out.println("Versuch es nochmal :P");
            zaehler = zaehler + 1;
            wort = Schleife.nextLine();

            if (zaehler == 5)
            {
                System.out.println("Tipp: Man kann das Wort in verschiedenen Geschmäckern essen. ;)");
            }
            else if (zaehler == 8)
            {
                System.out.println("Tipp: Das Wort hat 4 Buchstaben");
            }
            else if (zaehler == 10)
            {
                System.out.println("Tipp: Das Produkt, was das Wort beschreibt,\nkommt von einer Kuh!");
            }
        }




        System.out.println("Super! Du hast das Wort erraten!\nDanke für's Spielen!");
        System.exit(0);
    }






}

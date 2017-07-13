/**
 * Fragenmaschine v1
 * Created by tdolfen on 06.07.2017.
 */

import java.util.Scanner;


public class Tannenbaum
{
    public static void main(String[] args)
    {
        int i, j; //i Zeilen, j Spalten
        int hoehe; //Die Höhe des Baumes
        int n = 0;
        hoehe = n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie eine Zahl ein, die die Höhe des Baumes beschreiben soll.");
        hoehe = scanner.nextInt();
         //Höhe 1 hat 1 Stern
         //Höhe 2 hat 3 Sterne
         //Höhe 3 hat 5 Sterne


        if (hoehe>0)
        {
            for (i=1; i<=hoehe; i++)
            {

                for (j=1; j<=hoehe-i; j++)
                    System.out.print(" ");

                for (j=1; j<=(2*i-1); j++)
                    System.out.print("*");


                System.out.println();
            }

            for (i=1; i<hoehe; i++)
            {
                System.out.print(" ");
            }
            System.out.println("I");

        }
        else
        {
            System.out.println("Der Baum muss schon existent sein also gib eine Zahl >0 ein, du Trottel!");
        }
    }

}
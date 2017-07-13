package main.java.com.example.praktikum1;

import java.util.Scanner;

/**
 * Created by tdolfen on 03.07.2017.
 */
public class IfNumberApplication {

    static class ZahlenTester
    {
        public static void main (String[] args)
        {
            Scanner scan = new Scanner( System.in );
            int zahl;

            System.out.println("Geben Sie eine Ganzzahl ein:");
            zahl = scan.nextInt();

            if ( zahl < 0 )
                System.out.println("Die Zahl " +
                        zahl + " ist negativ");
            else
                System.out.println("Die Zahl " +
                        zahl + " ist 0 oder positiv");

            System.out.println("Good-bye fuer jetzt");
        }
    }
}

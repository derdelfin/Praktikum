/**
 * Fragenmaschine v1
 * Created by tdolfen on 06.07.2017.
 */
public class SchleifeEinfach
{
    public static void main (String[] args )
    {
        int zahl;
        int zaehler = 0;
        while ( zaehler <= 12 )
        {
            if (zaehler == 10)
            {
                System.out.println("Die Zahl ist 9");
            }

            System.out.println( "Zaehler ist:" + zaehler );
            zaehler = zaehler + 1;
        }
        System.out.println( "Schleife vollendet" );
    }

}

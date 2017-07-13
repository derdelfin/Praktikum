package main.java.com.example.praktikum1.model.Lambo;

import java.util.Scanner;

/**Fragenmaschine v1
 * Created by tdolfen on 04.07.2017.
 */
public class Fragen {
    public static void main(String[] args)

    {
        Scanner fragenautomat = new Scanner(System.in);

        String start;       //Frage des Programmes zum Starten
        String color;       //1.
        String food;        //2.
        String car;         //3.
        String music;       //4.
        String book;        //5.
        String show;        //6.
        String band;        //7.
        String clothes;     //8.
        String drink;       //9.
        String shoes;       //10.
        int point = 0;

        System.out.println("Hallo. Ich bin ein Fragenautomat und habe ein Quiz vorbereitet, bei dem du durch das Sammeln von Punkten\nfeststellen kannst, wie ähnlich du meinem Programmierer Tobias bist.\nMöchtest du starten?\nJa/Nein");
        start = fragenautomat.nextLine();

            if(start.toLowerCase().equals("ja") || start.toLowerCase().equals("j"))
            {
                System.out.println("Das freut mich!");
            }
            else if (start.equals("Nein") || start.equals("nein") || start.equals("n") || start.equals("N"))
            {
                System.out.println("Schade! Bis zum nächsten Mal!");
                System.exit(0);
            }
            else
            {
                System.out.println("Das ist eine ungültige Antwort. Bis zum nächsten Mal!");
                System.exit(0);
            }

        //1. Frage
                System.out.println("1. Was ist ihre Lieblingsfarbe?\na) Blau\nb) Grün\nc) Schwarz");
                color = fragenautomat.nextLine();

        if (color.equals("a") || color.toLowerCase().equals("blau"))
        {
            System.out.println("Das ist leider nicht meine Lieblingsfarbe!");
        }
        else if (color.equals("b") || color.toLowerCase().equals("gruen"))
        {
            System.out.println("Das ist leider nicht meine Lieblingsfarbe!");
        }
        else if (color.equals("c") || color.toLowerCase().equals("schwarz"))
        {
            System.out.println("Das ist auch meine Lieblingsfarbe!");
            point++;
        }
        else
        {
            System.out.println("Ich habe schon 3 Möglichkeiten, die Antwort zu geben, mit 3 möglichen Schreibweisen, also schreib was richtiges du Pfosten!");
        }

        //2. Frage
                System.out.println("2. Was ist ihr Lieblingsessen?\na) Pizza\nb) Burger\nc) Nudelbox");
                food = fragenautomat.nextLine();

        if (food.equals("a") || food.toLowerCase().equals("pizza"))
        {
            System.out.println("Das ist leider nicht mein Lieblingsessen!");
        }
        else if (food.equals("b") || food.toLowerCase().equals("burger"))
        {
            System.out.println("Das ist auch mein Lieblingsessen!");
            point++;
        }
        else if (food.equals("c") || food.toLowerCase().equals("nudelbox"))
        {
            System.out.println("Das ist leider nicht mein Lieblingsessen!");
        }
        else
        {
            System.out.println("Ich habe schon 3 Möglichkeiten, die Antwort zu geben, mit 3 möglichen Schreibweisen, also schreib was richtiges du Pfosten!");
        }

        //3. Frage
                System.out.println("3. Was ist ihr Lieblingsauto? Vielleicht gibt es eine versteckte Antwort! ;)\na) Audi\nb) Nissan\nc) VW");
                car = fragenautomat.nextLine();

        if (car.equals("a") || car.toLowerCase().equals("audi"))
        {
            System.out.println("Das ist auch mein Lieblingssauto!");
        }
        else if (car.equals("b") || car.toLowerCase().equals("nissan"))
        {
            System.out.println("Das ist leider nicht mein Lieblingssauto!");
        }
        else if (car.equals("c") || car.toLowerCase().equals("vw"))
        {
            point++;
            System.out.println("Das ist leider nicht mein Lieblingssauto!");
        }
        else if (car.equals("d") || car.equals("Motorräder") || car.equals("Motorrad"))
        {
            System.out.println("Absolut richtige Entscheidung!");
            point++;
            point++;
        }
        else
        {
            System.out.println("Ich habe schon 3 Möglichkeiten, die Antwort zu geben, mit 3 möglichen Schreibweisen, also schreib was richtiges du Pfosten!");
        }
        //4. Frage
                System.out.println("4. Was ist ihre Lieblingsmusikrichtung?\na) Rap\nb) House\nc) Pop");
                music = fragenautomat.nextLine();

        if (music.equals("a") || music.toLowerCase().equals("rap"))
        {
            System.out.println("Das ist leider nicht meine Lieblingsmusikrichtung!");
        }
        else if (music.equals("b") || music.toLowerCase().equals("house"))
        {
            System.out.println("Das ist auch meine Lieblingsmusikrichtung!");
            point++;
        }
        else if (music.equals("c") || music.toLowerCase().equals("pop"))
        {
            System.out.println("Das ist leider nicht meine Lieblingsmusikrichtung!");
        }
        else
        {
            System.out.println("Ich habe schon 3 Möglichkeiten, die Antwort zu geben, mit 3 möglichen Schreibweisen, also schreib was richtiges du Pfosten!");
        }
        //5.Frage
                System.out.println("5. Was ist ihr Lieblingsbuch?\na) Harry Potter\nb) Die Bibel\nc) Ich lese nicht.");
                book = fragenautomat.nextLine();

        if (book.equals("a") || book.toLowerCase().equals("harry potter"))
        {
            System.out.println("Das ist leider nicht mein Lieblingsbuch!");
        }
        else if (book.equals("b") || book.toLowerCase().equals("die bibel"))
        {
            System.out.println("Das ist leider nicht mein Lieblingsbuch!");
        }
        else if (book.equals("c") || book.toLowerCase().equals("ich lese nicht."))
        {
            System.out.println("Weise Entscheidung. ;)");
            point++;
        }
        else
        {
            System.out.println("Ich habe schon 3 Möglichkeiten, die Antwort zu geben, mit 3 möglichen Schreibweisen, also schreib was richtiges du Pfosten!");
        }
        //6. Frage
                System.out.println("6. Was ist ihre Lieblingsshow?\na) Die Simpsons\nb) Grey's Anatomy\nc) Family Guy");
                show = fragenautomat.nextLine();

        if (show.equals("a") || show.toLowerCase().equals("die simpsons"))
        {
            System.out.println("Das ist auch meine Lieblingsshow!");
            point++;
        }
        else if (show.equals("b") || show.toLowerCase().equals("grey's anatomy"))
        {
            System.out.println("Das ist leider nicht meine Lieblingsshow!");
        }
        else if (show.equals("c") || show.toLowerCase().equals("family guy"))
        {
            System.out.println("Das ist leider nicht meine Lieblingsshow!.");
        }
        else
        {
            System.out.println("Ich habe schon 3 Möglichkeiten, die Antwort zu geben, mit 3 möglichen Schreibweisen, also schreib was richtiges du Pfosten!");
        }
        //7. Frage
                System.out.println("7. Was ist ihre Lieblingsband?\na) Trailerpark\nb) Rammstein\nc) Imagine Dragons");
                band = fragenautomat.nextLine();

        if (band.equals("a") || band.toLowerCase().equals("trailerpark"))
        {
            System.out.println("Das ist auch meine Lieblingsband!");
            point++;
        }
        else if (band.equals("b") || band.toLowerCase().equals("rammstein"))
        {
            System.out.println("Das ist leider nicht meine Lieblingsband!");
        }
        else if (band.equals("c") || band.toLowerCase().equals("imagine dragons"))
        {
            System.out.println("Das ist leider nicht meine Lieblingsband!.");
        }
        else
        {
            System.out.println("Ich habe schon 3 Möglichkeiten, die Antwort zu geben, mit 3 möglichen Schreibweisen, also schreib was richtiges du Pfosten!");
        }
        //8. Frage
                System.out.println("8. Was ist ihr Lieblingskleidungsstück?\na) Hemd\nb) T-Shirt\nc) Sweatshirt");
                clothes = fragenautomat.nextLine();

        if (clothes.equals("a") || clothes.toLowerCase().equals("hemd"))
        {
            System.out.println("Das ist leider nicht mein Lieblingskleidungsstück!");
        }
        else if (clothes.equals("b") || clothes.toLowerCase().equals("t-shirt"))
        {
            System.out.println("Das ist leider nicht mein Lieblingskleidungsstück!");
        }
        else if (clothes.equals("c") || clothes.toLowerCase().equals("sweatshirt"))
        {
            System.out.println("Das ist auch mein Lieblingskleidungsstück!.");
            point++;
        }
        else
        {
            System.out.println("Ich habe schon 3 Möglichkeiten, die Antwort zu geben, mit 3 möglichen Schreibweisen, also schreib was richtiges du Pfosten!");
        }
        //9. Frage
                System.out.println("9. Was ist ihr Lieblingsgetränk?\na) Kaffee\nb) Energy Drink\nc) Soft Drinks");
                drink = fragenautomat.nextLine();

        if (drink.equals("a") || drink.toLowerCase().equals("kaffee"))
        {
            System.out.println("Das ist leider nicht mein Lieblingsgetränk!");
        }
        else if (drink.equals("b") || drink.toLowerCase().equals("energy drink"))
        {
            System.out.println("Das ist leider nicht mein Lieblingsgetränk!");
        }
        else if (drink.equals("c") || drink.toLowerCase().equals("soft drinks"))
        {
            System.out.println("Das ist auch mein Lieblingsgetränk!");
            point++;
        }
        else
        {
            System.out.println("Ich habe schon 3 Möglichkeiten, die Antwort zu geben, mit 3 möglichen Schreibweisen, also schreib was richtiges du Pfosten!");
        }
        //10. Frage
                System.out.println("10. Was ist ihre Lieblingsschuhmarke?\na) Nike\nb) Adidas\nc) New Balance");
                shoes = fragenautomat.nextLine();

        if (shoes.equals("a") || shoes.toLowerCase().equals("nike"))
        {
            System.out.println("Das ist auch meine Lieblingsschuhmarke!");
            point++;
        }
        else if (shoes.equals("b") || shoes.toLowerCase().equals("adidas"))
        {
            System.out.println("Das ist leider nicht meine Lieblingsschuhmarke!");
        }
        else if (shoes.equals("c") || shoes.toLowerCase().equals("new balance"))
        {
            System.out.println("Das ist leider nicht meine Lieblingsschuhmarke!");
        }
        else
        {
            System.out.println("Ich habe schon 3 Möglichkeiten, die Antwort zu geben, mit 3 möglichen Schreibweisen, also schreib was richtiges du Pfosten!");
        }

        //AUSWERTUNG

    System.out.println("Danke sehr für's Mitmachen! Du hast gut gearbeitet, hier ist dein Ergebnis:\n");

        if (point <= 3)
        {
            System.out.println("Du und mein Programmierer seid euch gar nicht ähnlich, kennt ihr euch überhaupt? Ja/Nein (0-3 Punkte)");
            start = fragenautomat.nextLine();
                if (start.toLowerCase().equals("ja") || start.equals("j"))
                {
                    System.out.println("Peinlich mein Freund!\nBis zum nächsten Mal!");
                    System.exit(0);
                }
                else if (start.toLowerCase().equals("nein") || start.equals("n"))
                {
                    System.out.println("Dann solltest du ihn kennenlernen, er ist super nett! :P\nBis zum nächsten Mal!");
                    System.exit(0);
                }
                else
                {
                System.out.println("Das ist keine gültige Antwort, bis dann!");
                System.exit(0);
            }

        }

        else if (point <= 6)
        {
            System.out.println("Du kennst meinen Programmierer flüchtig, aber bist ihm trotzdem ähnlich, kann das sein? ;) (3-6 Punkte)\nBis zum nächsten Mal!");
            System.exit(0);
        }

        else if (point <=9)
        {
            System.out.println("Du und mein Programmierer scheinen sich ziemlich gut zu kennen und seid sehr gleich! (6-9 Punkte)\nBis zum nächsten Mal!");
            System.exit(0);
        }

        else if (point <= 10)
        {
            System.out.println("Kann es sein, dass du und mein Programmierer verwandt seid? (10 Punkte)\nBis zum nächsten Mal!");
            System.exit(0);
        }







    }
}

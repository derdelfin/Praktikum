package main.java.com.example.praktikum1;

import main.java.com.example.praktikum1.model.Car;

/**
 * Created by tdolfen on 03.07.2017.
 */
public class HelloWorldApplication {
    public static void main ( String[] args )
    {

        Car car = new Car();
        car.setColor("grün");
        car.setWeight(400);
        car.sagWasCooles("Ich bin Knight Rider");
        System.out.println("Hello World Test!") ;
        System.out.println("Die Farbe ist " + car.getColor());
    }
}

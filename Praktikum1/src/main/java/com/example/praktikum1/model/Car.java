package main.java.com.example.praktikum1.model;

/**
 * Created by tdolfen on 03.07.2017.
 */
public class Car {

    private String color;

    private double weight;

    public Car(String color, double weight ) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {}

    public void sagWasCooles(String text) {
        System.out.println(text);

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}

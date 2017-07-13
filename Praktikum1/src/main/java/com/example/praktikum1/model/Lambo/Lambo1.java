package main.java.com.example.praktikum1.model.Lambo;

import java.util.Scanner;

/**
 * Created by tdolfen on 04.07.2017.
 */

public class Lambo1
{

    private String color;
    private double weight;


    public static void main(String[] args)
    {
        Scanner fragenautomat = new Scanner(System.in);
       String color;
       System.out.println("Fragen sie etwas");
       color = fragenautomat.nextLine();
       System.out.println(color);
    }




}

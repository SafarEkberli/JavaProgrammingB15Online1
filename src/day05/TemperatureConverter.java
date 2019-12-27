package day05;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        System.out.println("What is the temperature in F ?");

        double Farenheit = scan.nextDouble();
        double Celsius = (5.0 / 9)* (Farenheit-32);

        System.out.println("Farenheit "+ Farenheit+ " is " + Celsius +" in celsius");

    }
}

package day05;

import java.util.Scanner;

public class WageConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" What  is your hourly wage?");

        double wageInHour = scan.nextDouble();
        double salary = wageInHour * 2080;

        System.out.println("Your yearly salary  based on the hourly wage rate of " + wageInHour+ " is " + salary);
    }
}

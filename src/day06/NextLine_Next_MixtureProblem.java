package day06;

import java.util.Scanner;

public class NextLine_Next_MixtureProblem {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("what is your name ? ");
        String name = blabla.nextLine();
        System.out.println(" Your name is "  + name);

        System.out.println("What is your age? ");
        int age = blabla.nextInt();
        System.out.println("Your age is "+ age);
        blabla.nextLine();

        System.out.println("What is your address? ");
        String address = blabla.nextLine();
        System.out.println("Your address is " + address);

    }
}

package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.println("What is your current speed ?");
        int currentSpeed = scan.nextInt();

        System.out.println("What is  speed limit?");

        int speedlimit = scan.nextInt();

        if(currentSpeed > speedlimit) {

            System.out.println("Get pulled over by the police");
            System.out.println("Given ticket by the police");
            System.out.println("Taken away some points on your license");

        }

        System.out.println("The End");
    }
}

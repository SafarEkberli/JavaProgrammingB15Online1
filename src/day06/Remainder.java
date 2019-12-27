package day06;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
//        System.out.println(5/2);
//        System.out.println(5.0/2);
//        System.out.println(5/2f);
//
//        System.out.println(5%2);
//        System.out.println(99%10);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how minutes you want to convert ");

        int minutes =  scan.nextInt();
        int hours = minutes/60;
        int minutePart = minutes%60;
        System.out.println("The minutes "+ minutes+ " is " + hours+" hours and "+minutePart+ " minutes");

    }
}
package day19;

import java.util.Scanner;

public class SpeedActionScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Starting point is: ");

        int start = scan.nextInt();
        System.out.println("Ending point is: ");
        int end = scan.nextInt();

        System.out.print("you have started at speed-->  ");
        for (int i = start; i<=end; i++){


            System.out.print(i+ " ");

        }

    }
}
package day05;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" How many days?");

        int  day = scan.nextInt();

        System.out.println();

        int minutes = day *1440;

        System.out.println(" There are " +minutes+ " minutes in " + day  + "  days." );



    }
}

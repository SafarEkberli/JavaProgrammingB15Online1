package day10;

import java.util.Scanner;

public class SeasonActionScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey what is the season?");

        String season=scan.next();
        switch (season){

            case "Spring":
                System.out.println("Hike,Easter,Nawruz,Blossom");
            break;

            case "Summer":
                System.out.println("Swim,Vacation,BBQ,Holiday");
                break;

            case "Fall":
                System.out.println("Black Friday, Hiking,Harvest,Hallowen,Shopping");
                break;

            case"Winter":
                System.out.println("Snowboarding,Ski,Christmas,New Year");
                break;

            default:
                System.out.println("There is no this type season");
                break;



        }

    }
}

package day16;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

     //   System.out.println("Give me Five!!");

       int userNumber= 0;
//
//        if(userNumber!=5){
//
//            System.out.println("Hey you did not give me 5!!");
//        }

        while (userNumber!=5){
            System.out.println("Give me five!!");
            userNumber= scan.nextInt();

        }
        System.out.println("End t6he Program");
    }
}

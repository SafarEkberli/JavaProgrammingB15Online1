package day15;

import java.util.Scanner;

public class WarmUpTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scan.next();
        int lengthOfTheName= name.length();
        System.out.println("lengthOfTheName = " + lengthOfTheName);


        if (lengthOfTheName<=3){

            System.out.println("Short name");

        }else if (lengthOfTheName>=11){
            System.out.println("Long name");
        }else {
            System.out.println("Medium name");
        }
        if (name.contains("a") || name.contains("e")){
            System.out.println("name contains a or e");
        }else {
            System.out.println("I do not have both a or e in my name");
        }
    }
}

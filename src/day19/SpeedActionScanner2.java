package day19;

import java.util.Scanner;

public class SpeedActionScanner2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Starting point is: ");

        int start = scan.nextInt();
        System.out.println("Ending point is: ");
        int end = scan.nextInt();

        if(start<end) {

            System.out.print("Increasing speed-->  ");
            for (int i = start; i <= end; i++) {


                System.out.print(i + " ");

            }
        }else if (start>end){
            System.out.print("Decreasing speed-->");
            for (int x =start; x >end;x--){
                System.out.print(x+ ",");
            }
        }else {
            System.out.println("No action needed, same speed");
        }

    }
}
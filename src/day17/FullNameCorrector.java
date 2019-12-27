package day17;

import java.util.Scanner;

public class FullNameCorrector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Full name");
        String fullName = scan.nextLine();
        int indexOfSpace = fullName.indexOf(" ");

        String firstName = fullName.substring(0,4);
        String lastName = fullName.substring(indexOfSpace+1);

        String firstNameCorrected= firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
        String lastNameCorrected = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);
         fullName= firstNameCorrected+ " "+ lastNameCorrected;
        System.out.println(fullName);
    }
}

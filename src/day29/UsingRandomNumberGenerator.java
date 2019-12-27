package day29;

import java.util.Random;

public class UsingRandomNumberGenerator {
    public static void main(String[] args) {
        Random myRd = new Random();

        int randomNumber = myRd.nextInt(10);
        System.out.println(randomNumber);


    }
}

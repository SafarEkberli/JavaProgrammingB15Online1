package day12;

public class FizzBuzzNumber {

    public static void main(String[] args) {

        int num = 15;
     if (num %5 == 0 && num % 3 == 0){



        System.out.println("FizzBuzz Number");

    }else if (num % 5== 0) {

            System.out.println("Fizz number");


        } else if (num %3 == 0) {

            System.out.println("Buzz number");



        }else {

            System.out.println("Invalid number");
        }

    }
}
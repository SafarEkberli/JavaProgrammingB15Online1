package day11;

import javax.jws.soap.SOAPBinding;

public class ScoreChecker {
    public static void main(String[] args) {
        int score  = 23;

        if (score<0 || score>100){
            System.out.println("Invalid Score!!!");
        }if  (score==100){

            System.out.println("Perfect Score!!!");

        }else if (score>=70 && score<100){

            System.out.println("You have passed!!");
        }else{

            System.out.println("You have failed");
        }


    }
}

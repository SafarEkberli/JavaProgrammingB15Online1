package day08;

public class MultiBranchIfSytatement {

    public static void main(String[] args) {

        int currentSpeed = 59;

        if (currentSpeed>70){
            System.out.println("You are speeding more than 70 -- Points Taken!!!");

        }else  if (currentSpeed>60){

            System.out.println("Your speed is less than 70 or equal 70 but more than 60");
        }else {

            System.out.println("Keep driving you are Good!!!");
        }


    }
}

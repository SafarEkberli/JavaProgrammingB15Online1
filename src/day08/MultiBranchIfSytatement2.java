package day08;

public class MultiBranchIfSytatement2 {

    public static void main(String[] args) {

        int currentSpeed = 75;

        if (currentSpeed>90) {

            System.out.println("You are speeding more than 90- Jail Time");

        }else if(currentSpeed>80) {

            System.out.println("Reckless Driver");


        }else if (currentSpeed>70){
            System.out.println("You are speeding more than 70 -- You get Warning!!!");

        }else  if (currentSpeed>60){

            System.out.println("Your speed is less than 70 or equal 70 but more than 60");
        }else {

            System.out.println("Keep driving you are Good!!!");
        }


    }
}

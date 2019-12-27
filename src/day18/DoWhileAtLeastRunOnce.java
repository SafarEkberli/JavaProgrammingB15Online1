package day18;

public class DoWhileAtLeastRunOnce {
    public static void main(String[] args) {
        int x = 100;
        do {
            System.out.println("Keep Going");
        }while (x<5);
        System.out.println("The End");

        while (x<5){

            System.out.println("Keep going in while");
        }
    }
}

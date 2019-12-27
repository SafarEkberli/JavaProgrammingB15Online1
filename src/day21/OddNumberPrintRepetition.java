package day21;

public class OddNumberPrintRepetition {
    public static void main(String[] args) {

        for (int j = 1; j <= 4; j++) {
            System.out.println("Iteration: "+j);


            for (int i = 1; i <= 10; i += 2) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }
}
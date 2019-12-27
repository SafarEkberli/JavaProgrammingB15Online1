package day20;

public class SumOfEvenOddSeparetly {
    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 0) {

                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }

        }
        System.out.println("Sum Of Odd " + sumOdd);
        System.out.println("Sum Of Even " + sumEven);

    }

}
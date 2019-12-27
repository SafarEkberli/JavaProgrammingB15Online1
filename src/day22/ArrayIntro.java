package day22;

public class ArrayIntro {
    public static void main(String[] args) {
        int [] scores = new int[4];

        scores [0] = 95;
        scores [1] = 70;
        scores [2] = 88;
        scores [3] = 100;



        System.out.println(scores [0]);
        System.out.println(scores [1]);
        System.out.println(scores [2]);
        System.out.println(scores [3]);

        int[] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers [1]);
        System.out.println(numbers [2]);

        byte[] digits = new byte[4];
        digits[0]=12;
        digits[1]=45;
        digits[2]=34;
        digits[3]=78;

        System.out.println(digits [0]);
        System.out.println(digits [1]);
        System.out.println(digits [2]);
        System.out.println(digits [3]);

        scores[3]= 55;
        System.out.println(scores[3]);

    }
}

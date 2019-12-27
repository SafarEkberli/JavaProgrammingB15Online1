package day20;

public class SumOfOdd {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 1) {

                sum = sum + i;
            }
            System.out.println(sum);
        }
    }

    public static class FindDogInSentence {
        public static void main(String[] args) {
            String msg = "I like Dog, Dogs are cute, Dogs are friendly";
            int lastCharIndex = msg.length() - 1;
            for (int x = 0; x < lastCharIndex - 2; x++) {
                String current3Chars = msg.substring(x, x + 3);
                // System.out.println(x + " : "+ current3Chars);
                if (current3Chars.equals("Dog")) {
                    System.out.println("Bingo!!!  At " + x);
                }

            }

        }
    }
}
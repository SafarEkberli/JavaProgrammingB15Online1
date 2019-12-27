package day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {
    public static void main(String[] args) {
        String sentence= "I love Java Java Java";
        String[] words = sentence.split(" ",3);
        System.out.println("Words = "+ Arrays.toString(words));
    }
}

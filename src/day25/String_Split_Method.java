package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {
        String sentence = "I love Java";
     
        String[] allWords = sentence.split(" ");

        System.out.println("allWords = " + Arrays.toString(allWords));
        System.out.println("How many word do I have in this sentence? :" + allWords.length);

        System.out.println("last word in this sentence is "+ allWords[allWords.length-1]);
        
        String sentence2 = " Everything is Awesome";
        String[] splitByArray = sentence2.split("e");
        System.out.println("splitByArray = " +Arrays.toString(splitByArray));
        
        
        String[] splitByArray2 = sentence2.split("is");
        System.out.println("Arrays.toString(splitByArray2) = " + Arrays.toString(splitByArray2));
    }
    
}

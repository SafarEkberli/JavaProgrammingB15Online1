package day25;

import java.util.Arrays;

public class FindLongestWord {
    public static void main(String[] args) {
        String sentence = " We are trying to find the longest word";

        String[] allWords = sentence.split(" ");
        System.out.println("allwords= " + Arrays.toString(allWords));

        String longestWord = allWords[0];
        int maxCharCount = 0 ;

        for (String currentWord: allWords) {

            if (currentWord.length()>longestWord.length()){
                longestWord=currentWord;

            }



        }
        System.out.println("longest Word = " + longestWord);

    }
}

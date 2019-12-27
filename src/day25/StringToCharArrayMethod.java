package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {
        String name = "Alesya";
        char [] nameChar = new char[name.length()];
//        nameChar[0]= name.charAt(0);

        for (int x = 0 ; x< nameChar.length; x++){

            nameChar[x]= name.charAt(x);

        }

        System.out.println("nameChar= "+ Arrays.toString(nameChar));
        
        char[] nameChar2 = name.toCharArray();
        
        System.out.println("nameChar2 = "+ Arrays.toString(nameChar2));
        
        
        
        String name2 = "Anastasiya";
        char[] allCharsInName = name2.toCharArray();
        for (char eachChar :  allCharsInName) {
            System.out.println("eachChar = " + eachChar);
            
        }
        
        int count = 0 ;
        for (char eachChar: allCharsInName) {
            
            if (eachChar=='a'){
                
                ++count;

            }
            
        }

        System.out.println("count = " + count);

        Arrays.sort(allCharsInName );

        System.out.println("After Sorting " +Arrays.toString(allCharsInName));
    }
}

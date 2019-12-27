package day24;

import java.util.Arrays;

public class ArrayMethodSorting {
    public static void main(String[] args) {
        int[] scores = {99,44,66,23,19,55};

        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("Forst item value: "+ scores[0]);


        char[] nameChars = {'D','A','G','Z','C','B'};

        System.out.println("nameChars = "+ Arrays.toString(nameChars));
        Arrays.sort(nameChars);

        System.out.println("nameChars = "+ Arrays.toString(nameChars));

        boolean[] fiveSwitchOnOffs = {true,false,true,false,false,true};
        System.out.println( " fiveSwitchOnOffs = "+ Arrays.toString(fiveSwitchOnOffs));

        // sort method does not work for boolean Array.
    }
}

package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] nums= {13,31,8,5,21,2};

        System.out.println("nums = "+ Arrays.toString(nums));
        int numsSize = nums.length;

        int[] numsCopy= new int[numsSize];
//        numsCopy[0]=13;
//        numsCopy[1]=31;
//        numsCopy[2]=8;
//        numsCopy[3]=5;
//        numsCopy[4]=21;
//        numsCopy[5]=2;
//
        Arrays.sort(nums);

        System.out.println("After sort numsw "+ Arrays.toString(nums));
    }
}

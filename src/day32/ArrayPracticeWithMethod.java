package day32;


import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {
        printArrayItems(new int[]{1,2,4,5,7,8});
        int[] scores = {1,2,3,2,34,23};
        printArrayItems(scores);

        findMaxArray(scores);
        printSumOfArray(new int[]{65,23,11,34,22});






    }
    public static void printArrayItems(int[]nums){

        System.out.println("Arrays has items: "+ Arrays.toString(nums));
    }

    public static void findMaxArray(int[]nums){

        int[] scores= {100,90,900,8000,10,20,-1};

        int min = scores[0];

        for (int i = 0; i <scores.length ; i++) {

            if (min > scores[i]){
                min = scores[i];
            }

        }

        System.out.println("min = " + min);
    }
    public static void printSumOfArray(int[]nums){
        int sum =0;
        for (int eachNum :nums){
            sum = sum+ eachNum;
        }
        System.out.println(sum);


    }
}

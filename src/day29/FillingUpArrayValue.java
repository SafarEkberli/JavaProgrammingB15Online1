package day29;

import java.util.Arrays;

public class FillingUpArrayValue {
    public static void main(String[] args) {
        int[] numbers = new int[100];
//        numbers[0]=1;
//        numbers[1]=2;
//        numbers[2]=3;
        for (int i = 0; i <numbers.length ; i++) {

            numbers[i]= i+1;


        }

        System.out.println(Arrays.toString(numbers));
    }
}

package day26;

import java.util.Arrays;

public class ReverseArrayBySwapping {
    public static void main(String[] args) {
        int[] myNumbers = {5,3,21,2,1,13};
        int size = myNumbers.length;
        int lastIndex = size-1;
        int middleIndex = size/2;
        System.out.println(Arrays.toString(myNumbers));




        for (int x = 0; x <middleIndex ; x++) {
            System.out.println(myNumbers[x]+"----"+ myNumbers[lastIndex-x]);
            int temp = myNumbers[x];
            myNumbers[x]= myNumbers[lastIndex-1];
            myNumbers[lastIndex-x]=temp;



        }
        System.out.println(Arrays.toString(myNumbers));
    }
}

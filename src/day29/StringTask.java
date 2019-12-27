package day29;

import java.util.Arrays;

public class StringTask {
    public static void main(String[] args) {

        String[]arrayLove= new String[300];
       String message = "I love Java";

        for (int i = 0; i <arrayLove.length ; i++) {
            arrayLove[i]= i+"."+message ;



        }
        System.out.println(Arrays.toString(arrayLove));
    }
}

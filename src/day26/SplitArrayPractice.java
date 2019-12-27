package day26;

import java.util.Arrays;

public class SplitArrayPractice {
    public static void main(String[] args) {
        String students = "Abbos,Zulyar,Zhibe,Hasan,Muge,Orhan, Susan";

        students=students.replace(" ","");
        String[] allNames = students.split(",");

        System.out.println(Arrays.toString(allNames));

        for (int i = 0; i <students.length() ; i++) {

            System.out.print(students.charAt(i)+ "-");

        }


    }
}

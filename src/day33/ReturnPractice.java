package day33;

import com.sun.org.apache.xpath.internal.operations.VariableSafeAbsRef;

public class ReturnPractice {
    public static void main(String[] args) {

        System.out.println(getSumFrom1ToX(11));

        System.out.println(build_Got_Email("Safar","ekberli"));

    }

    public static int getSumFrom1ToX(int number){

        int sum = 0;

        for (int i = 0; i <=number; i++) {
            sum = sum+i;


        }
        return sum;
    }

    public static String build_Got_Email(String name, String name2){


        String email = name.charAt(0)+ name2+"@nightWatch.com";

        return email;

    }

}

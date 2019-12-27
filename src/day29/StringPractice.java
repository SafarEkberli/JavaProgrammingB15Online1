package day29;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {
        String hero1 = "Superman-Clark J Kent";

        String[] heroSplitted = hero1.split("-");
        System.out.println("Hero splitted = "+ Arrays.toString(heroSplitted));

        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];

        System.out.println("Hero code is "+heroSplitted[0]+"and Identity is "+heroSplitted[1]);
        
        String[] fullnameSplitted = fullName.split(" ");
        System.out.println("FullNameSplitted = "+ Arrays.toString(fullnameSplitted));
        
        String lastName = fullnameSplitted[fullnameSplitted.length-1];
        System.out.println("lastName = " + lastName);
        

    }
}

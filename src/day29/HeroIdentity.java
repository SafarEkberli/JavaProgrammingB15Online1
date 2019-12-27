package day29;

import java.util.Arrays;

public class HeroIdentity {
    public static void main(String[] args) {
        String hero1 ="Superman-Clark J Kent";
        String[] hero1Splitted = hero1.split("-");

        String heroCode = hero1Splitted[0];
        String fullName = hero1Splitted[1];


        System.out.println("hero1Splitted.length = " + hero1Splitted[1]);



        String star = " ";

        for (int i = 0; i <hero1Splitted[1].length() ; i++) {

           star = star+ "*";

        }
//        System.out.println(fullName);
        System.out.println("star = " + star);
//
//        String heroX =  heroCode+"-"+star;

        String heroX = hero1.replace(hero1Splitted[1],star);
        System.out.println("hero1= "+hero1);
        System.out.println("herox= "+heroX);


    }
}

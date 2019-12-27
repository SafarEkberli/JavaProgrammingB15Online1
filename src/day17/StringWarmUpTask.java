package day17;

import java.util.Scanner;

public class StringWarmUpTask {
    public static void main(String[] args) {

        String name = "kHumayra";
//        String nameFix = (name.charAt(0)+ "").toUpperCase();
//        nameFix = nameFix+name.substring(1).toLowerCase();
//        System.out.println(nameFix);

        String nameFix = name.toUpperCase().substring(0,1);
        nameFix+=name.substring(1).toLowerCase();

        System.out.println("Fixedname+ " +nameFix);

    }
}

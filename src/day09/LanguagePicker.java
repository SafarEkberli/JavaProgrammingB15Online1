package day09;

import java.util.SortedMap;

public class LanguagePicker {
    public static void main(String[] args) {
        System.out.println("Wwlcome to Cybertek Call Center");
        System.out.println("Please select your language option from 1-6");
        int language = 4;
        String greeting = "";

        if (language == 1) {
            greeting = "Hello";

        } else if (language == 2) {
            greeting = "Salam";

        }else if (language == 3) {
            greeting = "Hola";

        } else if (language == 4) {

            greeting = "Merhaba";
        }else if (language==5){
            greeting="Bonjour";
        }else {
            System.out.println("Unkonwn Language");
        }
        System.out.println(greeting+" Sdet");





















    }
}

package day09;

public class LanguageCode {
    public static void main(String[] args) {
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
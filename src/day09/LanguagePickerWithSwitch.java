package day09;

public class LanguagePickerWithSwitch {
    public static void main(String[] args) {

        int language = 4;
        switch (language) {


            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hola");
                break;
            case 3:
                System.out.println("Privet");
                break;
            case 4:
                System.out.println("Merhaba");
                break;
            case 5:
                System.out.println("Bonjour");
                break;
            case 6:
                System.out.println("Salam");
                break;
            default:
                System.out.println("Unkown language");


        }
    }
}
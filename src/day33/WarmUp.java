package day33;

public class WarmUp {
    public static void main(String[] args) {
        getSpelledName("Safar");

    }

    public static String getSpelledName(String name) {

        for (int i = 0; i < name.length(); i++) {

            System.out.print(name.charAt(i));
            if (i != name.length() - 1) {

                System.out.print("-");




            }
        }
        return "";

    }
}
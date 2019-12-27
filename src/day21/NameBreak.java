package day21;

public class NameBreak {
    public static void main(String[] args) {

        String name =" Adila";

        int charcount = name.length();

        for (int i = 0; i <=charcount ; i++) {
            char currentChar =  name.charAt(i);
            System.out.println(currentChar);
            if (currentChar=='l'){
                System.out.println("Found it");
                break;
            }

        }
    }
}

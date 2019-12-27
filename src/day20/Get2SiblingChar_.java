package day20;

public class Get2SiblingChar_ {
    public static void main(String[] args) {
        String name = "Ayra";
        int charCount = name.length();


        for (int x = 0; x <= charCount - 2; x++) {
            System.out.println(name.substring(x, x + 2));

        }
        for (int x = 0; x <= charCount - 3; x++) {
            System.out.println(name.substring(x, x + 3));
        }
    }
}
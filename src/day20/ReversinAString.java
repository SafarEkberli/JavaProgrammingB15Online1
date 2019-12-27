package day20;

public class ReversinAString {
    public static void main(String[] args) {
        String name = "John Snow";
        String reversedName = "";
        for (int x = 8; x >= 0; x--) {

            //  System.out.print(x+ " index: ");

            //  char currentChar = name.charAt(x);
            //   System.out.println(name.charAt(x));
            reversedName = reversedName + name.charAt(x);

        }
        System.out.println("reversedName = " + reversedName);
    }
}

package day15;

public class ReverseingString {
    public static void main(String[] args) {

        String name = "Adila";
        System.out.println(   name.charAt(0)+" "+ name.charAt(1)+" "+name.charAt(2)+" "+name.charAt(3)+" "
                +name.charAt(4));
        System.out.println(   name.charAt(4)+" "+ name.charAt(3)+" "+name.charAt(2)+" "+name.charAt(1)+" "
                +name.charAt(0));

        int nameLength = name.length();
        int lastCharIndex = nameLength-1;
        char lastChar = name.charAt(lastCharIndex);
        System.out.println("Last Char is " + lastChar);

        System.out.println("last char in on shot "+ name.charAt(name.length()-1));

    }
}

package day15;

public class StringCaseInsenteviCheck {
    public static void main(String[] args) {
        String name = "Arya Stark";

        System.out.println("name.contains st Result is: "+ name.contains("st"));

        String upperCaseName = name.toUpperCase();
        System.out.println("Name contains ST or not?" +upperCaseName.contains("ST"));
         String lowerCaseName = name.toLowerCase();
        System.out.println("lowercaseName contains st or not? " + lowerCaseName.contains("st"));

        System.out.println(  name.toLowerCase().contains("st"));
    }
}

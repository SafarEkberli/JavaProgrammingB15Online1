package day14;

public class LastIndexOfPractice {
    public static void main(String[] args) {
        String name = "Game of Java";

        System.out.println("Find out the last location of a");
        System.out.println(name.lastIndexOf("a"));

        System.out.println("Find out the last location of the character space shows up");
        System.out.println(name.lastIndexOf(" "));

        System.out.println("Find out the last location of the letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga"));

        System.out.println("Find out the last location of the letter Kawa shows up");
        System.out.println(name.lastIndexOf("Kawa"));

        if (name.indexOf("Kawa")> -1) {
            System.out.println("Kawa Found!!");
        }else {
            System.out.println("No Kawa - No Pumpkin");
        }


    }
}

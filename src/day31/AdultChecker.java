package day31;

public class AdultChecker {
    public static void main(String[] args) {
        adultChecker(33);

    }
    public static void adultChecker(int age){
//        int age = 15;

        if (age>18){
            System.out.println("You are eligible");
        }else {
            System.out.println("You are not eligible");
        }
    }
}

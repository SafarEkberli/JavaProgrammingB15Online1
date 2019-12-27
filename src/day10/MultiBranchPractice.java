package day10;

public class MultiBranchPractice {
    public static void main(String[] args) {

        System.out.println("Welcome to MCDonald, what can I get for you? ");

        String order = "";

        int Menu = 44;
        switch (Menu) {

            case 1:
                System.out.println("You have selected 1");
                order= "Burger";
                break;
            case 5:
                System.out.println("You have selected 5");
                order="French Fry";
                break;
            case 12:
                System.out.println("You ave selected 12");
                order="Icecream";
                break;
            case 44:
                System.out.println("You have selected 44");
                order= "Nuggets";
                System.out.println("YAY,  YUM");

                break;
            default:
                System.out.println("Your order is Invalid");
                order="Uknown";
                break;

        }
        System.out.println("Your order is "+order);
    }
}
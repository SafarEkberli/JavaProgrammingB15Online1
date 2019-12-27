package day32;

public class StringActions {
    public static void main(String[] args) {
//        nameReversing("Safar");
        printStringWithDashInBetween("Adele");
        printStringWithDashInBetween("Safar");
        printStringWithDashInBetween("Arya");


    }


    public static void nameReversing(String name) {


        for (int i = name.length() - 1; i >= 0; i--) {

            System.out.println("My reversed name is: " + name.charAt(i));


        }


        System.out.println();

    }

    public static void printStringWithDashInBetween(String name) {


        for (int i = 0; i < name.length(); i++) {

            System.out.print(name.charAt(i)+" ");
            if (i != name.length() - 1) {
                System.out.print("-");



            }
        }
        System.out.println();
    }
}
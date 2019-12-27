package day13;

public class NestedIf {
    public static void main(String[] args) {
        boolean doYouWantToShop = true;
        String preference = "Online";
        if (doYouWantToShop) {
            if (preference.equals("store")) {
                System.out.println("Going to Store for Shopping");
            } else {
                System.out.println("Going to online for shopping");


            }

        } else {
            System.out.println("good job stay home coding!!!");
        }


    }

}

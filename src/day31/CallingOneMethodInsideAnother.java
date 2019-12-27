package day31;

public class CallingOneMethodInsideAnother {
    public static void main(String[] args) {
        finallyAwake();

    }
    public  static void wakeUp(){

        System.out.println("Open your eyes");
        System.out.println("Close your eyes");
        System.out.println("Hear your alarm");
        System.out.println();

    }
    public static void drinkCoffee(){
        System.out.println("Put coffee in your coffe machine");
        System.out.println("Press the button , make your coffe");
        System.out.println();


    }
    public static void finallyAwake(){
        wakeUp();
        drinkCoffee();
    }
}

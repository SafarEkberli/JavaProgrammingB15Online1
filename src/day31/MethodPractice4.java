package day31;

public class MethodPractice4 {
    public static void main(String[] args) {
        wakeUp();
        drinkCoffee();
        prepareKidsForSchool();
        takeThemToSchool();
        studyJava();
        sayILoveJava300Times();

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
    public static void prepareKidsForSchool(){
        System.out.println("Kiss your kids to wake them up");
        System.out.println("Wake them up for 10 times");
        System.out.println("Prepare their breakfast and lunch");
        System.out.println("Eat with them");
        System.out.println();
    }
    public static void takeThemToSchool(){
        System.out.println("Take them to school bus");
        System.out.println("Say good bye!! ");
        System.out.println();
    }

    public static void studyJava(){
        System.out.println("Think about Java");
        System.out.println("Think about Java always");
        System.out.println("Practice Java");
        System.out.println("Review last Classes");
        System.out.println();
    }
    public static void sayILoveJava300Times(){

        for (int i = 0; i <=300 ; i++) {
            System.out.println("I Love Java");
        }
        System.out.println();
    }
}

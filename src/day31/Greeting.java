package day31;

public class Greeting {
    public static void main(String[] args) {
        sayHello();
        sayHello2("Batch15");
        sayHello2("Kids");

    }

    public static void sayHello2(String name){
        System.out.println("Hello "+ name);

    }
    public static void sayHello(){

        System.out.println("Hello Batch15");
    }

}

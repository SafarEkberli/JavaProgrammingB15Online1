package day32;

public class MethodWithReturnIntro {
    public static void main(String[] args) {
      String name=  giveMeMyName();
        System.out.println("name"+name);

        int myResult = doubleTheNumber(10);
        System.out.println("myResult= " + myResult);
        System.out.println(doubleTheNumber(345));
        System.out.println(addTwoNumbers(33,89));

    }

    public static String giveMeMyName(){
        return "Akbar";


    }

    public static int doubleTheNumber(int num){
        System.out.println("I am going to double the value of "+num);
        int result = num*2;
        return result;
    }
    public static int addTwoNumbers(int num1,int num2){

        int result =  num1+num2;
        return result;
    }


}

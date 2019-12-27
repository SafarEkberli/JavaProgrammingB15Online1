package day31;

public class Calculator_V2 {
    public static void main(String[] args) {
        calculation("*",32,54);
        calculation("-",45,23);


    }

    public static void calculation(String operator,int num1,int num2) {

//        String operator = "+";
//        int num1 = 15;
//        int num2 = 3;

        switch (operator){

            case "+":
                System.out.println("Addition result is "+(num1+num2));
                break;
            case "-":
                System.out.println("Addition result is "+(num1-num2));
                break;
            case "*":
                System.out.println("Addition result is "+(num1*num2));
                break;
            case "/":
                System.out.println("Addition result is "+(num1/num2));
                break;
            default:
                System.out.println("Invalid Operator");

        }
    }
}
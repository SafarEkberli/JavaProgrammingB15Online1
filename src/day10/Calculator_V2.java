package day10;

import javax.jws.soap.SOAPBinding;

public class Calculator_V2 {
    public static void main(String[] args) {

        int num1= 2;
        int num2= 3;

        char operator='/';

        switch (operator){

            case'+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                 break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

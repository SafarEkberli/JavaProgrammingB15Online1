package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {

        System.out.println(5+3);
        System.out.println(5-3);
        System.out.println(5*3);
        System.out.println(5/3);


        System.out.println(5+3.0d);
        System.out.println(5-3.0d);
        System.out.println(5*3.0d);
        System.out.println(5/3.0d);
        System.out.println(5/3.0f);

        int a = 5;
        int b = 3;
        int result1 = a/b;
        int result2 = a-b;
        int result3 = a*b;
        int result4 = a/b;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        double celsius;
        double fahrenheit = 80;
        celsius = (5.0/9)*(fahrenheit-32);

        System.out.println(fahrenheit + "F equels to " + celsius + "C");

    }
}

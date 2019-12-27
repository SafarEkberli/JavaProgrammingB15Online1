package day11;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println("TRUTH Table");
        System.out.println("Result of true && true "+(true && true));
        System.out.println("Result of false && true "+(false && true));
        System.out.println("Result of true && false "+(true && false));
        System.out.println("Result of false && false "+(false && false));



        System.out.println("Result of true || true "+(true || true));
        System.out.println("Result of false || true "+(false || true));
        System.out.println("Result of true || false "+(true || false));
        System.out.println("Result of false || false "+(false || false));

        int num = 60;

        System.out.println(num>10 || num<100);
        System.out.println(num>10 && num<100);

        System.out.println(true||false||false);
        System.out.println(true&&true&&false);


        System.out.println(num==50|| num==51 || num==55);

        System.out.println(num>50&& num!=52 || num==57);
    }

}

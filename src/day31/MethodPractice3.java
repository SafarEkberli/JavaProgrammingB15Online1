package day31;

public class MethodPractice3 {
    public static void main(String[] args) {
        printOddNumbersto100();
        countDownFrom20TillOne();
        spellYourName();

    }

    public static void printOddNumbersto100(){

        for (int i = 0; i <100 ; i++) {

            if (i%2==1){

                System.out.print(i+" ");
            }

        }
        System.out.println();



    }
    public static void countDownFrom20TillOne(){

        for (int i = 20; i >=0; i--) {

            System.out.print(i+" ");

        }
        System.out.println();
    }
    public static void spellYourName(){
        String name = "Adila";
        int nameLength = name.length();
        for (int i = 0; i <nameLength ; i++) {
            System.out.print(name.charAt(i)+ "-");

        }
    }
}

package day32;

public class NumberAction {
    public static void main(String[] args) {
        numberComparision(3,15);
        strToRepeat("Java",4);
        skipCountBy3();
        print1ToX(34);
        countDownByEvenNUmberFrom50to0(44,22);

    }

    public static void numberComparision(int num1,int num2){

//        int num1=1;
//        int num2 = 2;
        if (num1>num2){
            System.out.println("Num1 is more than Num2");
        }else if(num1<num2){

            System.out.println("Num2 is more than Num1");
        }else {
            System.out.println("They are equal");
        }
        System.out.println();

    }
    public static  void strToRepeat (String strToRepeat,int count){

//        String name =" Safar";
//        int count = 3;

        for (int i = 1; i <=count ; i++) {
            System.out.println(strToRepeat+" ");



        }
        System.out.println();
    }

    public static void skipCountBy3(){

        for (int i = 0; i <=50 ; i= i +3) {
            System.out.print(i+" ");


        }
        System.out.println();
    }
    public static void print1ToX(int x){

        for (int i = 1; i <=x ; i++) {
            System.out.print(i+" ");



        }
        System.out.println();

    }
    public static void countDownByEvenNUmberFrom50to0(int x, int y){

        for (int i = x; i >y ; i--) {
            if (i%2==0){
                System.out.print(i +" ");
            }

        }
        System.out.println();

    }
}

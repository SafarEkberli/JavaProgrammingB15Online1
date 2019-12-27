package day21;

public class LoopControlStatement {
    public static void main(String[] args) {
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(i);
//            break;

       // }
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            if (i==5){
                break;
            }
            int sum = 0;
            for (int j = 1; j <= 10 ; j++) {


                if (sum>40){

                   break;

                }

                sum = sum+j;




            }
            System.out.println("sum "+ sum);
        }
    }
}

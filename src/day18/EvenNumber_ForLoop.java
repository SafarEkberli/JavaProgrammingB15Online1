package day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {
        for (int i = 0 ;i<100; i+=2 ){
            System.out.println(i+ " is even Number");
        }
        System.out.println("----------------");

        for (int x = 0; x < 100; x+=3){
            System.out.print(x+" ");
        }
        System.out.println("-----------------");
        for (int i = 0; i <100 ; i++) {

            if (i%2==0){
                System.out.print(i+" ");
            }
//            for (int i = 0; i <100 ; i++) {
//                if (i%5==0 && i%3==0){
//                    System.out.println(i+ " is Fizz Buzz Number");
//                }
//
//            }


        }
    }
}

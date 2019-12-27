package day27;

public class ArrayTask2_MinAndMaxNumber {
    public static void main(String[] args) {
        int[] scores= {100,90,900,8000,10,20,-1};

        int min = scores[0];

        for (int i = 0; i <scores.length ; i++) {

            if (min > scores[i]){
                min = scores[i];
            }

        }

        System.out.println("min = " + min);

        int max = scores[0];
        for (int i = 0; i <scores.length ; i++) {

            if (max < scores[i]){
                max = scores[i];
            }

        }

        System.out.println("max = " + max);

        int secondMin = scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if (scores[i]==min){
                continue;


            }
            if (secondMin>scores[i])
            secondMin = scores[i];

        }

        System.out.println("secondMin = " + secondMin);

        int thirdMin = scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if (scores[i]==min || scores[i]==secondMin){
                continue;
            }
            if (thirdMin>scores[i]){

                thirdMin=scores[i];


            }

        }

        System.out.println("thirdMin = " + thirdMin);
    }
}

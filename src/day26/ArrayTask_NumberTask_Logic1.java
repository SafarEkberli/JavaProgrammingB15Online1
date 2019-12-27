package day26;

public class ArrayTask_NumberTask_Logic1 {
    public static void main(String[] args) {
        int[] scores = {156, 101, 76, 187, 87, 110};
        String FinalResult = "";

        int count = 0;
        for (int eachCount : scores) {

            if(eachCount>100){

                ++count;
            }


        }
        System.out.println("count = " + count);
        if (count==scores.length){

            FinalResult = "Yes";
        }else {
            FinalResult = "No";

        }

        System.out.println("Final Result= "+ FinalResult);
    }

}
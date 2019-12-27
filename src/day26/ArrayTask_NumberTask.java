package day26;

public class ArrayTask_NumberTask {
    public static void main(String[] args) {
        int[] scores = {156,101,76,187,87,110};
        String FinalResult = "";
        
        int count = 0;
        for (int eachCount: scores) {

            if (eachCount <= 100) {

                System.out.println("eachCount = " + eachCount);
                count++;
            }
        }
            System.out.println("count "+count);
        }
        
    }


package day22;

public class LoopingThroughArray {
    public static void main(String[] args) {
        int[] scores = new int[4];

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

//
//        int itemCount = scores.length;
//
//        for (int x = 0; x < itemCount; x++) {
//
//            System.out.println(scores[x]);
//
//        }


        int itemCount = scores.length;

        for (int x =0; x >itemCount; x--) {

            System.out.println(scores[x]);


        }
    }
}
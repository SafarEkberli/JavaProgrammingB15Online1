package day14;

public class StringReview {
    public static void main(String[] args) {
        String str = "I like Pumpkin";

        System.out.println(str.equals("pumpkin"));

        System.out.println(str.contains("Pumpkin"));

        boolean gotPumpkin= str.contains("Pumpkin");
        System.out.println("gotPumpkin = " + gotPumpkin);


        boolean startedWithI= str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);

        boolean endsWithPumpkin= str.endsWith("Pumpkin");
        System.out.println("endsWithPumpkin = " + endsWithPumpkin);





    }
}

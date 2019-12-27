package day19;

public class StrinForLoop {
    public static void main(String[] args) {
        String name = "Esra Fidan";
        int countOfA = 0;
        for (int x = 0; x<name.length();x++){
            System.out.println(name.charAt(x));
            if (name.charAt(x)=='a'){
                System.out.println("Bingo Found it !!");
                ++countOfA;
            }
        }

        System.out.println("countOfA = " +countOfA);
    }
}

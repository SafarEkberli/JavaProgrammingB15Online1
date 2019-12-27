package day12;

public class WarmWakeUp_SeasonFinder {
    public static void main(String[] args) {


        int month = 56;

        if (month>=3 && month<6){
            System.out.println("Spring!!!");
        }else if (month>=6 && month<9){
            System.out.println("Summer!!!");

        }else if (month>8 && month<12){
            System.out.println("Fall!!!");
        }else if (month==12 || month==1|| month==2){

            System.out.println("Winter!!!");
        }else {
            System.out.println("Invalid month!!!");
        }

    }
}
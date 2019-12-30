package day33;

public class MethodWithReturnPractice2 {
    public static void main(String[] args) {



        int [] getDayOfTheWeek={4,2,8,33,2};
        for (int eachDay:getDayOfTheWeek){

            System.out.print("Each day "+convertNumberToDay(eachDay));
        }


    }

    public static  String convertNumberToDay(int day) {

        String dayCode = "";


        switch (day){

            case  1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Funday");
        }
        return dayCode;
    }
}

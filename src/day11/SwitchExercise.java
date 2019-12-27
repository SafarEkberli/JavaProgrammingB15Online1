package day11;

public class SwitchExercise {

    public static void main(String[] args) {
         String targetOption="Ki";


         switch (targetOption){
             case "Bd":
                 System.out.println("You have turned on bedroom light");
                 break;

             case "Ki":
                 System.out.println("You have turned on kitchen light");
                 break;
             case "Ha":
                 System.out.println("You have turned Hallway light");
                 break;
             default:
                 System.out.println("There is no that room at home");
                 break;


         }
    }
}

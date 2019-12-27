package day32;

public class CharacterActions {
    public static void main(String[] args) {
        printAtoZ();
        printZtoA();
        printAlphabetInRange('D','M');

    }

    public static void printAtoZ() {

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void printZtoA() {

        for (char i = 'Z'; i >= 'A'; i--) {

            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void printAlphabetInRange(char beginning,char ending){

        if (beginning<ending) {
            System.out.println("We need to increment from " + beginning + " till " + ending);

            for (char i = beginning; i <=ending ; i++) {
                System.out.println(i + " ");

            }
            System.out.println();
        }else if (beginning>ending){
            System.out.println("We need to decrement from " + beginning + "till" + ending);
            for (char i = ending; i >=beginning ; i--) {
                System.out.println(i + " ");

            }
            System.out.println();

        }else {
            System.out.println("They are same character");
        }
    }
}
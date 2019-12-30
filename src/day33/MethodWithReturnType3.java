package day33;

public class MethodWithReturnType3 {
    public static void main(String[] args) {

        System.out.println(calculateAndReturnAge(1991));

    }

    public static int calculateAndReturnAge(int birthYear){


        if(birthYear<=1900 || birthYear>=2020){
            return 0;
        }
        return 2019-birthYear;
    }
}

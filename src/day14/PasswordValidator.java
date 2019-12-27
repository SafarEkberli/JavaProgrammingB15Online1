package day14;

public class PasswordValidator {
    public static void main(String[] args) {

        String password ="Ab_kjljjuhjhkj";

        boolean min8max16 =  password.length()>=8 && password.length() <=16;
        boolean mustContains_or$= password.contains("_")|| password.contains("$");
        boolean mustNotContainSpace = ! password.contains(" ");
        boolean mustStartWithAb = password.startsWith("Ab");


        if(min8max16 && mustContains_or$ && mustNotContainSpace && mustStartWithAb){
            System.out.println("Valid Password");

        } else{
            System.out.println("Invalid Password");
        }
    }
}

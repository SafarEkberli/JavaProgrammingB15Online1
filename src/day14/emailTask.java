package day14;

public class emailTask {
    public static void main(String[] args) {

        String email = "abcyahoo .com";

        if(!email.contains("@")|| email.contains(" ")){

            System.out.println("Invalid email");

        }else if (email.endsWith("@gmail.com")){
            System.out.println("Google mail");

        }else if (email.endsWith("@yahoo.com")){
            System.out.println("Yahoo mail");

        }else if (email.endsWith("@mail.com")){
            System.out.println("Russian mail");
        }
    }
}

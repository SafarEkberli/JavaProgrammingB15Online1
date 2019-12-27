package day12;

public class LoginTest {
    public static void main(String[] args) {
        String userName = "user123";
        String password = "pass1233";


        if (userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Login Successful");

        } else if (!userName.equals("user123") && password.equals("pass123")) {

            System.out.println("username is not correct");
        } else if (!password.equals("pass123") && userName.equals("user123")) {
            System.out.println("password is not correct");
        } else if (!userName.equals("user123") && !password.equals("pass123")) {
            System.out.println("Username and password are incorrect");


        }
    }
}
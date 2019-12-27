package day07;

public class EmailBuilder {
    public static void main(String[] args) {

        String firstName =  "Adila";
        String lastName = "Ekberli";
        String company = "Java.inc";
        String  email;
        email = firstName+"_"+lastName+"@"+company+".com";

        System.out.println("My name is "+firstName+" " +lastName+" I work for "+company+" and my email is "+email+ ".");


    }
}

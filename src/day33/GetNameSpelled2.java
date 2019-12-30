package day33;

public class GetNameSpelled2 {
    public static void main(String[] args) {

        System.out.println(NameSpeller("irina"));

    }

    public static String NameSpeller(String name) {
        String result = "";
        for (int i = 0; i < name.length() - 1; i++) {

            result += name.charAt(i)+"-";


        }
        return result+name.charAt(name.length()-1);
    }

}

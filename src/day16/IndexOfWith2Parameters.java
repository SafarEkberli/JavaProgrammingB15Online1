package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {
   //                  012345678901234567890123456789012
        String name = "I love Java I Love Java Java Java";
      System.out.println(name.indexOf("Java"));

        System.out.println(name.indexOf("Java",7));
        System.out.println(name.indexOf("Java",8));
        System.out.println(name.indexOf("Java",9));
        System.out.println(name.indexOf("Java",19));
        System.out.println(name.indexOf("Java",20));


        int firstJavaLocation = name.indexOf("Java");
        int startPointToSearchSecondJava = firstJavaLocation+ 1;
        System.out.println("startPointToSearchSecondJava = " + startPointToSearchSecondJava);
        int secondJavaLocation= name.indexOf("Java ",startPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);

        int firstSpace = name.indexOf(" ");
        int secondSpace = name.indexOf(" ",firstSpace+1);
        System.out.println(" Second word in this sentence is "+name.substring(firstSpace+1,secondSpace));
    }
}

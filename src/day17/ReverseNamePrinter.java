package day17;

public class ReverseNamePrinter {
    public static void main(String[] args) {
        int x = 0;
       String name = "Sadrattin";
       int lastCharacterIndex = name.length()-1;

       while (lastCharacterIndex>=0){

           System.out.println("index "+lastCharacterIndex+" : "+name.charAt(lastCharacterIndex));
           --lastCharacterIndex;
       }
    }
}

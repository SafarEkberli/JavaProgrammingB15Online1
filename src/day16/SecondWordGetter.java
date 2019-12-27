package day16;

public class SecondWordGetter {
    public static void main(String[] args) {


        String sentence = "I love Java";
        String secondword;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);
        int lastSpaceIndex = sentence.lastIndexOf(" ");

        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println(sentence.substring(2,6));
        secondword = sentence.substring(firstSpaceIndex+1, lastSpaceIndex);
        System.out.println(secondword);
        
        String firstWord = sentence.substring(0, firstSpaceIndex);

        System.out.println("firstWord = " + firstWord);
        String lastWord = sentence.substring(lastSpaceIndex+1);
        System.out.println("lastWord = " + lastWord);
        

    }
}

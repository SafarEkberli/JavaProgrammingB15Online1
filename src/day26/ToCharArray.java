package day26;

public class ToCharArray {
    public static void main(String[] args) {
        String survey = "Complete B15 Online 1 Month Survey";
        char[]  surveyChars = survey.toCharArray();
        for(char each:surveyChars){

            System.out.println("each char is :" + each);
        }
        int x = 0 ;
        while (x<surveyChars.length){
            System.out.println("each char is "+ surveyChars[x]);
            x++;
        }
    }
}

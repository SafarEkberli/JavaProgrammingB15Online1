package day15;

public class SubstringPractice {
    public static void main(String[] args) {
        
        String movie = "Lord of the Rings";
        String wordOf= movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);
        
        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);

        int startingPoint = movie.indexOf(" ") +1;
        int endingPoint = movie.length();

        System.out.println("second word till last: "+ movie.substring(startingPoint,endingPoint));
        
        String secondWordTillLast = movie.substring(5,17);
        System.out.println("second Word Till Last = " + secondWordTillLast);

        String wordLordOf = movie.substring(0,7);
        System.out.println("word Lord Of = " + wordLordOf);
        
        String secondToLast = movie.substring(5);
        System.out.println("secondToLast = " + secondToLast);

        String wordLord = movie.substring(0,4);
        String wordRing = movie.substring(12,17);
        String wordOfThe= movie.substring(4,12);
        String Java =" Java ";

        System.out.println(wordRing+wordOfThe+Java+wordLord);
        
    }
}

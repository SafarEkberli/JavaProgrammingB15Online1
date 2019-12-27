package day11;

public class LogicalNotOperator {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
        System.out.println(! true);
        System.out.println(! false);

        boolean isRecording = false;
        System.out.println(! isRecording);

        System.out.println( !(7>5) );

        int x = 7;
        System.out.println(   !(x>10)  );
    }
}

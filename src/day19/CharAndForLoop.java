package day19;

public class CharAndForLoop {
    public static void main(String[] args) {
        for (char ichar ='A'; ichar <='Z'; ++ichar){
            System.out.print(ichar+" ");
        }
        for (char kchar = 'Z'; kchar>='A'; --kchar){
            System.out.println(kchar);
        }
    }
}

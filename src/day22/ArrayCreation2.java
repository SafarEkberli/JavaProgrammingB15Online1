package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {

        int[] ages = new int[] {2,5,66,55,33,44};
        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);

        for (int x = 0; x <itemCount ; x++) {

            System.out.println(ages[x]);

        }

        int[] areaCodes = {703,300,954,665};
        for (int x = 0; x < areaCodes.length; x++) {
            System.out.print(areaCodes[x]+ " ");

        }

    }
}

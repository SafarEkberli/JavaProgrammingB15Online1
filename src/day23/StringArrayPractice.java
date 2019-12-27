package day23;

public class StringArrayPractice {
    public static void main(String[] args) {
        String[] shows ={"Orville","Gifted","Game Of Thrones","Flash","Arrow","Super Girl"};
        int showCount = shows.length;
        System.out.println("showCount = " + showCount);

        for (int x = 0; x <showCount ; x++) {
           // System.out.println(shows[x]);

            String currentShow = shows[x];
            System.out.println(shows[x]+ " Has character count : " +currentShow.length());
        }
    }
}

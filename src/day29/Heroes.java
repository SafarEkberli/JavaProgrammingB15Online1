package day29;

public class Heroes {
    public static void main(String[] args) {
        String[] allHeroes = {"Superman-Clark Kent",
                             "Batman-Bruce",
                               "Green Lantern-Hal Jefferson"};

        for (String eachHero:allHeroes){
            String hero1 = eachHero;

            String[] herSplitted = hero1.split("-");
            String heroCode = herSplitted[0];
            String fullName = herSplitted[1];

            String stars = " ";

            for (int i = 1; i <fullName.length() ; i++) {

                stars = stars +"*";

        }

            String heroX = hero1.replace(fullName,stars);
            System.out.println(" hero = "+ hero1);
            System.out.println(" hero x = "+heroX);

        }
    }
}

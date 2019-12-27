package day27;

public class MultiDimensionalArrayPractic2 {
    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testerTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalystTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {developersTeam, testerTeam, businessAnalystTeam};

        int minLength = scrumTeam[0][0].length();
        String shortestString = scrumTeam[0][0];

//        for (String[] eachTeam : scrumTeam) {
//            for (String eachElement : eachTeam) {
//
//                if (minLength > eachElement.length()) {
//                    minLength = eachElement.length();
//
//                }
//            }
//        }
//
//        System.out.println(minLength);
//        for (String[] eachTeam : scrumTeam) {
//            for (String eachElement : eachTeam) {
//
//                if (minLength == eachElement.length()) {
//                    System.out.println(eachElement);
//                }
//            }
//        }

        for (int i = 0; i <scrumTeam.length ; i++) {
            for (int j = 0; j <scrumTeam[i].length ; j++) {
                if(minLength>scrumTeam[i][j].length()){
                    minLength=scrumTeam[i][j].length();

                }

            }

        }
        System.out.println(minLength);
        System.out.println(shortestString);
    }
}
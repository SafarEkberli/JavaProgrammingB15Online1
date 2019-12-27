package day27;

public class MultiDimensionalArrayPractic {
    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testerTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalystTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {developersTeam, testerTeam, businessAnalystTeam};

        int maxLength = scrumTeam[0][0].length();

        for (String[] eachTeam : scrumTeam) {
            for (String eachElement : eachTeam) {

                if (maxLength < eachElement.length()) {
                    maxLength = eachElement.length();

                }
            }
        }

        System.out.println(maxLength);
        for (String[] eachTeam : scrumTeam) {
            for (String eachElement : eachTeam) {

                if (maxLength == eachElement.length()) {
                    System.out.println(eachElement);
                }
            }
        }
    }
}
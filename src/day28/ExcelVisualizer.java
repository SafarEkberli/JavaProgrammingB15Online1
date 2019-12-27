package day28;

public class ExcelVisualizer {
    public static void main(String[] args) {
        int[] row1 = {78,54,100,84};
        int[] row2 = {33,44,77,123};
        int[] row3 = {12,88,52,76};
        int[] row4 = {67,33,98,67};
        int[] row5 = {12,88,52,45};
        int[] row6 = {67,33,98,67};

        int[] [] sheet = { row1 ,row2,row3,row4,row5,row6};
        int[] [] myExcel ={{10,27},{87,99,100},{90,45}};

        System.out.println(sheet.length);
        System.out.println(sheet[3].length);


        for (int i = 0; i <sheet.length ; i++) {
            for (int j = 0; j <sheet[i].length ; j++) {

                System.out.print(sheet[i][j]+" ");


            }

        }


    }
}

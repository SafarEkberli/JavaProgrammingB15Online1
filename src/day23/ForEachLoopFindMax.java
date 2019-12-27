package day23;

public class ForEachLoopFindMax {
    public static void main(String[] args) {
        long[] salaries = {37836786, 31332213, 32322323, 54534532, 2424442};

        long maxSalary = salaries[0];

        for (long v : salaries) {

            if (v > maxSalary) {

                System.out.println("v = " + v);

             
            }
        }

      
        
    }
}
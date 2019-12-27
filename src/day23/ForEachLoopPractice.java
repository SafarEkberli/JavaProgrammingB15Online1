package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        long[] salaries ={67836786,31332213,32322323,54534532,2424442};
        
        for (long v :salaries){

            System.out.println("v = " + v);
        }
        for (long salary:salaries){
            
            if (salary>50000000){
                System.out.println("salary = " + salary);
            }
        }
        
    }
}

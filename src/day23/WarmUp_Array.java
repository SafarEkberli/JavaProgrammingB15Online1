package day23;

public class WarmUp_Array {
    public static void main(String[] args) {
        int[] numbers = {5,15,25,22,33,44,55};

        int arraySize = numbers.length;
        
        int lastItem = numbers.length-1;

        for (int x = numbers.length-1; x >=0; x--) {
            System.out.println(numbers[x]+" ");
            
            

        }

        System.out.println("lastItem = " + lastItem);
        
        int lastItemValue = numbers[lastItem];
        System.out.println("lastItemValue = " + lastItemValue);

        int middleItemValue = arraySize/2;
        System.out.println("middleItemValue = " + middleItemValue);


        int sum = 0;
        for (int x = 0; x < arraySize; x++) {
            int currentItem = numbers[x];
//            sum = sum + currentItem;
            sum = sum+ numbers[x];


        }
        System.out.println("sum = "+ sum);
    }
}

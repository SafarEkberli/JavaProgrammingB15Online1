package day24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClassMethod {
    public static void main(String[] args) {

        String[] superHeroes = {"Superman"," Batman","Wonder Woman", "Aquaman","Cyborg","Flash"};

        System.out.println(Arrays.toString(superHeroes));

        String savingSuperHeroesAsString = Arrays.toString(superHeroes);

        System.out.println(savingSuperHeroesAsString);

        System.out.println(savingSuperHeroesAsString.charAt(0));

        int[] numbers = {10,44,55,3,78};
        System.out.println(Arrays.toString(numbers));

        double[] prices ={22.2,33.3,44.4};
        String indexPrices =Arrays.toString(prices);

        for (int i = 0; i <indexPrices.length() ; i++) {

            System.out.println("Character at index "+i+" is : "+indexPrices.charAt(i));



        }



        
    }
}

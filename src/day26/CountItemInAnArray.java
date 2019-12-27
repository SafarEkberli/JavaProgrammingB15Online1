package day26;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {
        String[] marvelHeroes={"Iron Man","Captain America", "Spider Man",
                "Black Panter","Hulk","Black Widow","Wanda","Captain Marvel",
                "Captain America", "Spider Man","Hulk","Black Widow","Wanda"};

        System.out.println("marvelHeroes = " + Arrays.toString(marvelHeroes));
        int sizeOfArray = marvelHeroes.length;

        String itemToSearch= "Black";
        int countOfItem = 0;

        for (String eachHeroes: marvelHeroes) {
          if (eachHeroes.contains(itemToSearch)) {
              countOfItem++;
          }
        }
        System.out.println("Count of item "+countOfItem);
    }

}

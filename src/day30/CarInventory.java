package day30;

import java.util.Arrays;

public class CarInventory {
    public static void main(String[] args) {
        String[] cars= {"Acura-NSX",
                       "Chevrolet-Corvette",
                       "Chevrolet-Cavalier",
                       "BMW-3 Series",
                       "Pontiac-LeMans",
                       "BMW-7 Series",
                       "Oldsmobile-Achieva",
                       "Honda-Civic"};

      int chevyCnt = 0;
      int civic = 0;

//        for (String eachCar: cars){
//            if (eachCar.startsWith("Chevrolet")){
//                ChevyCnt++;
//            }
//            if (eachCar.contains("Civic")){
//                civic++;
//            }
//        }
//        System.out.println("ChevyCnt = " + chevyCnt);
//
//        System.out.println("civic = " + civic);

        for (int i = 0; i <cars.length ; i++) {

          if (cars[i].contains("Chevrolet")){
              chevyCnt++;

          }

        }
        System.out.println("chevyCnt = " + chevyCnt);

        for (int i = 0; i <cars.length ; i++) {
//            if (cars[i].contains("Civic")){
            if (cars[i].equals("Honda-Civic")) {
                System.out.println("Civic found at location: " + i);

                for (String eachCar : cars) {

                    if (eachCar.startsWith("Honda")) {

                        System.out.println("eachCar = " + eachCar);
                    }
                }
            }

        }

        Arrays.sort(cars);
        System.out.println("Cars = "+ Arrays.toString(cars));
    }
}

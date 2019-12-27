package day12;

public class CarShopping {
    public static void main(String[] args) {
        String carBrand="Corolla";
        int budget =60000;
        int carPrice = 30000;


//        if (carBrand.equals("Corolla") || carBrand.equals("Tesla") &&carPrice<=budget ){
//
//            System.out.println("Car Acquired");
//
//        }else {
//            System.out.println("Not What I am looking for");
//        }

        if (carBrand.equals("Corolla")){
            System.out.println("Car aquired");
        }else if (carBrand.equals("Tesla") && carPrice<=budget){
            System.out.println("Car acquired");
        }else {
            System.out.println("Not what I am looking for");
        }

    }
}


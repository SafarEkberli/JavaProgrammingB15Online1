package day12;

public class WakeUpTask {
    public static void main(String[] args) {
        String weather = "snowy";

        if (weather.equals("rainy")) {

            System.out.println("Weather is rainy");

        } else if (weather.equals("cloudy")) {
            System.out.println("Weather is cloudy");

        }else if (weather.equals("snowy")){
            System.out.println("Weather is snowy");
        }else {
            System.out.println("Rain or shine keep coding anyway");
        }
    }
}
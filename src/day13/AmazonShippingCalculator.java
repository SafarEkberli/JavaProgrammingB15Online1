package day13;

public class AmazonShippingCalculator {
    public static void main(String[] args) {
        String member="prime member";
        double amount= 55.5;
        int shippingFee= 0;

        if (member.equalsIgnoreCase("prime member")){
            System.out.println("You get 1 day free shipping");

            System.out.println("Your final price is "+amount);
        }else if(! member.equalsIgnoreCase("prime member")&& amount>25){

            System.out.println("Not a prime member but your amount is more than 25$");
            System.out.println("You got free shipping on Amount "+amount);
        }else {

            System.out.println("Do you want to sign up for prime membership?");
            shippingFee=5;
            amount =amount+shippingFee;

            System.out.println("Your Final Amount is "+amount);

        }

    }
}

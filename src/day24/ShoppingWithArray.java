package day24;

public class ShoppingWithArray {
    public static void main(String[] args) {
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        for (String eachItem : groceryItems) {

//            System.out.print(eachItem + " ---> ");
        }

            int itemCount = groceryItems.length;
            int lastItemIndex = itemCount-1;

            String lastFruit = groceryItems[lastItemIndex];
            for (String eachFruit:groceryItems) {
                System.out.print(eachFruit);

                if (!eachFruit.equals(lastFruit)){

                    System.out.print("---->");
                }

            }
        }
    }



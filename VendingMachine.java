import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] items = {"Lays", "Doritos", "Pop Tarts", "Twinkies", "Coke", "Pepsi", "Gatorade", "Water"};
        int[] prices = {2, 2, 3, 2, 3, 3, 2, 1};

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " $" + prices[i]);
        }
        
        System.out.println("What snack would you want to buy?");
        String snack = in.next();

        for (int i = 0; i < items.length; i++) {
            if (snack.equals(items[i])) {
                System.out.println("Insert only 1$ bills.  How many would you like to insert?");
                int dollars = in.nextInt();

                if (dollars < prices[i]) {
                    System.out.println("Not enough money");
                }
                else {
                    System.out.println("Here is your " + items[i]);
                    System.out.println("Here is you change: $" + (dollars-prices[i]));
                }
            }
        }
    
        
       
        String chosenFood = in.next();
    }
}

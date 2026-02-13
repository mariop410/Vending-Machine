import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] items = {"Lays", "Doritos", "Pop Tarts", "Twinkies", "Coke", "Pepsi", "Gatorade", "Water"};
        int[] prices = {2, 2, 3, 2, 3, 3, 2, 1};

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " $" + prices[i]);
        }
        
        System.out.println("Hello, enter an item you want to buy. Only $1 bills are accepted.");
        System.out.println("What snack would you want to buy?");
        String chosenFood = in.next();
    }
}

public class VendingMachine {
    public static void main(String[] args) {
        String[] items = {"Lays", "Doritos", "Pop Tarts", "Twinkies", "Coke", "Pepsi", "Gatorade", "Water"};
        int[] prices = {2, 2, 3, 2, 3, 3, 2, 1};

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " $" + prices[i]);
        }
        
    }
}

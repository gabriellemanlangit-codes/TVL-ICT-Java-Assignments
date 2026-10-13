import java.util.Scanner;

public class GroceryPurchase {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Item Name: ");
        String itemName = input.nextLine();

        System.out.print("Enter Price per Kilogram: ");
        double price = input.nextDouble();

        System.out.print("Enter Quantity(kg): ");
        int quantity = input.nextInt();

        double totalAmount = price *quantity;
            System.out.println("\n=====GROCERY PURCHASE RECEIPT=====");
        System.out.println("Item: " + itemName);
        System.out.println("Price per Kilogram: P" + price);
        System.out.println("Quantity: " + quantity + "kg");
        System.out.println("----------------------------------");
        System.out.printf("Total Amount: P" + totalAmount);   
        
            input.close();
    }    
}

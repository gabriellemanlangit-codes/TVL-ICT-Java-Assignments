import java.util.Scanner;

public class TotalPayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        double total = quantity *price;
        System.out.println("Total payment: " + total);
    }
}

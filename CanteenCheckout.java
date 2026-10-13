import java.util.Scanner;

public class CanteenCheckout {
    public static void main(String[] args) {
       
       // Constant
       final double DISCOUNT_RATE = 0.10;
        
       // Scanner for user input
       Scanner input = new Scanner(System.in);

       // Variable declarations
        String learnerName;
        String learnerType;
        double mealPrice, cash, subTotal, discount, totalDue;
        int quantity;
        
        //========================
        // INPUT SECTION
        //========================
        System.out.println("=== SCHOOL CANTEEN SMART CHECKOUT ===");

        System.out.print("Enter learner name: ");
        learnerName = input.nextLine();

        System.out.print("Enter learner type (REGULAR/SCHOLAR): ");
        learnerType = input.nextLine().toUpperCase();

        System.out.print("Enter meal price: ");
        mealPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        System.out.print("Enter cash payment: ");
        cash = input.nextDouble();

        //========================
        // VALIDATION SECTION
        //========================
        if (mealPrice <= 0 || mealPrice > 500) {
            System.out.println("Invalid price; no billing computation.");
        } 
        else if  (quantity < 1 || quantity > 10) {
            System.out.println("Invalid quantity; no billing computation.");
        }
        else if (!learnerType.equals("REGULAR") && !learnerType.equals("SCHOLAR")) {
            System.out.println("Invalid learner type; no billing computation.");
        }
        else if (cash < 0) {
            System.out.println("Invalid cash payment; no billing computation.");
        }
        else {

            //========================
            // COMPUTATION SECTION
            //========================
            subTotal = mealPrice *quantity;
            discount = 0;

            if (learnerType.equals("SCHOLAR") && subTotal >= 100) {
                discount = subTotal * DISCOUNT_RATE;
            }

            totalDue = subTotal - discount;
            
            //========================
            // OUTPUT SECTION
            //========================
            System.out.println();
            System.out.println("===== TRANSACTION SUMMARY =====");
            System.out.println("Learner: " + learnerName);
            System.out.println("Type: " + learnerType);
            System.out.printf("Meal Price: PHP %.2f%n", mealPrice);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Subtotal: PHP %.2f%n", subTotal);

            if (discount > 0) {
                System.out.println("Promo: APPLIED (10%)");
            }
            else {
                System.out.println("Promo: NOT APPLIED");
            }

            System.out.printf("Discount: PHP %.2f%n", discount);
            System.out.printf("Total Due: PHP %.2f%n", totalDue);
            System.out.printf("Cash: PHP %.2f%n", cash);

            if (cash >= totalDue) {
                System.out.println("Status: APPROVED");
                System.out.printf("Change: PHP %.2f%n", (cash - totalDue));
            }
            else {
                System.out.println("Status: NOT APPROVED");
                System.out.printf("Shortage: PHP %.2f%n", (totalDue - cash));
            }
            
            System.out.println("Thank you!");

        }

        // Close Scanner
        input.close();

    }
}
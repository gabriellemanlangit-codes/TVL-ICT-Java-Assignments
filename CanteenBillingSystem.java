public class CanteenBillingSystem {
    public static void main(String[] args) {
        String studentName = "Gabrielle Manlangit";
        String item1 = "Rice meal";
        double item1Price = 35.00;
        int item1Quantity = 1;
        double subTotal1 = 35.00;
        String item2 = "Bottled water";
        double item2Price = 15.00;
        int item2Quantity = 2;
        double subTotal2 = 30.00;
        double finalTotalCost = subTotal1 +subTotal2;
        double amountPaid = 100.00;
        double change = amountPaid -finalTotalCost;

    System.out.println("=================================");
    System.out.println("     SCHOOL CANTEEN BILLING    ");
    System.out.println("=================================");
    System.out.println("Student Name: " + studentName);
    System.out.println("Grade/Section: 11" + " -" + " Hawking");
    System.out.println("---------------------------------");
    System.out.println("Item: " + item1);
    System.out.println("Quantity: " + item1Quantity);
    System.out.println("Price: " + item1Price);
    System.out.println("Subtotal: " + subTotal1);
    System.out.println("---------------------------------");
    System.out.println("Item: " + item2);
    System.out.println("Quantity: " + item2Quantity);
    System.out.println("Price: " + item2Price);
    System.out.println("Subtotal: " + subTotal2);
    System.out.println("---------------------------------");
    System.out.println("Total Cost: " + finalTotalCost);
    System.out.println("Amount paid: " + amountPaid);
    System.out.println("Change: " + change);
    System.out.println("=================================");
        System.out.print("Thank you " + "for buying " + "at the school canteen!");
    }
}
import java.util.Scanner;

public class SchoolCanteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Enter number of sandwiches: ");
    int quantity = input.nextInt();

    double total = quantity *35.0;
    System.out.println("Total Amount: P" + total);
    
    input.close();
    }
}
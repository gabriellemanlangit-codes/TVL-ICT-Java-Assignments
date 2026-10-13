import java.util.Scanner;

public class Computation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            char choice;
            do {
            
        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Choose an operator (+, -, *, /, %, ^): ");
        char op = input.next().charAt(0);

        int result;

        if (op == '+') {
            result = a + b;
            System.out.println("Result: " + result);
        
        } else if (op == '-') {
            result = a - b;
            System.out.println("Result: " + result);
        
        } else if (op == '*') {
            result = a * b;
            System.out.println("Result: " + result);
        
        } else if (op == '/') {
            
            if (b != 0) {
                result = a / b;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error! Cannot divide by zero.");
            }
        
        } else if (op == '%') {
            result = a % b;
            System.out.println("Result: " + result);

        } else if (op == '^') {
            result = (int) Math.pow(a, b);
            System.out.println("Result: " + result);
    
        } else {
            System.out.println("Invalid operator!");
        }
          
            System.out.print("\nDo you want to perform another calculation? (Y/N): ");
            
            choice = input.next().charAt(0);
        
        } while (choice == 'Y' || choice == 'y');
        
        System.out.println("Thank you for using the calculator!");
        input.close();
    }
}

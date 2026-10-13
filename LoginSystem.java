import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "admin";
        String password = "12345";

        System.out.print("Enter Username: ");
        String user = input.nextLine();
        
        System.out.print("Enter Password: ");
        String pass = input.nextLine();

            if (user.equals(username) && pass.equals(password)) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Invalid Username or Password!");
            }
            
            input.close();
    }
}

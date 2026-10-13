import java.util.Scanner;

public class LibraryChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Enter student name: ");
    String name = input.nextLine();

    System.out.print("Number of books borrowed: ");
    int books = input.nextInt();

        if (books <= 3){
            System.out.println(name + " can borrow another book.");
        }  else {
            System.out.println(name + " has reached the borrowing limit.");
        }
        input.close();
    }
}

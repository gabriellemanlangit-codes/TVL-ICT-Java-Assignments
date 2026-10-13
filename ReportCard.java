import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //Student Information
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Grade Level: " );
        int gradeLevel = input.nextInt();

        System.out.print("Enter Section: ");
        String section = input.nextLine();
        input.nextLine();
        
        //Grades
        System.out.print("Enter Grade for 1st Grading: ");
        double grade1 = input.nextDouble();

        System.out.print("Enter Grade for 2nd Grading: ");
        double grade2 = input.nextDouble();

        System.out.print("Enter Grade for 3rd Grading: ");
        double grade3 = input.nextDouble();

        //Compute Average
        double average = (grade1 + grade2 + grade3) /3;

        //Display Result
        System.out.println("\n----- REPORT CARD -----");
        System.out.println("Student Name: " + name);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("Section: " + section);
        System.out.println("Average: " + average);

        if (average >= 75){
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
        input.close();
    }
}

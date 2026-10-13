public class GradeCalculator {
    public static void main(String[] args) {
        
        String studentName = "John";
        int math = 85;
        int science = 90;
        int english = 88;

        int total = math + science + english;
        double average = total / 3;

        System.out.println("Student Name: " + studentName); 
        System.out.println("Total Grade: " + total);
        System.out.println("Average Grade: " + average);

        if (average >= 75)
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
}
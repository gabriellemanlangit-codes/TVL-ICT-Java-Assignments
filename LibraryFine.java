public class LibraryFine {
    public static void main(String[] args) {
        
        String studentName = "John Dela Cruz";
        int overdueDays = 6;
        double finePerDay = 15.00;

        double totalFine = overdueDays +finePerDay;

            System.out.println("===SCHOOL LIBRARY===");
            System.out.println("Student Name: " + studentName);
            System.out.println("Days Late: " + overdueDays);
            System.out.println("Fine Per Day: ₱" + finePerDay);
            System.out.println("Total Fine: ₱" + totalFine);
    }
}

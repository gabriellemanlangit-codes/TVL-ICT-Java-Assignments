public class LibraryBookingSystem {
    public static void main(String[] args) {
        String studentName = "Juan Dela Cruz";
        String bookTitle = "Java Programming";
        int daysBorrowed = 5;

        double feePerDay = 10.00;
        double totalFee = daysBorrowed *feePerDay;
        System.out.println("Library Booking Information");
        System.out.println("--------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Days Borrowed: " + daysBorrowed);
        System.out.println("Total Fee: " + totalFee);
    
    if (daysBorrowed>7){
        System.out.println("Reminder: Please return the book immediately");
     }
     else {
        System.out.println("Book is within the allowed borrowing period.");
     }
   
    }
}

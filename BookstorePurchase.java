public class BookstorePurchase {
    public static void main(String[] args) {
        String studentName = "Angela Cruz";
        int notebooks = 4;
        int pens = 3;
        double notebookPrice = 45.0;
        double penPrice = 18.0;

        double notebookTotal = notebooks *notebookPrice;
        double penTotal = pens *penPrice;
        double grandTotal = notebookTotal +penTotal;

    System.out.println("===SCHOOL BOOKSTORE RECEIPT===");
      System.out.println("Student: " + studentName);
      System.out.println("Notebook Cost: P" + notebookTotal);
      System.out.println("Pen Cost: P" + penTotal);
      System.out.println("Grand Total: P" + grandTotal);
    }
}

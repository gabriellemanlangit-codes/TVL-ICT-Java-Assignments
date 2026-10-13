public class remainingAllowance {
    public static void main(String[] args) {
        String studentName = "Glen";
        double dailyAllowance = 150.00;
        double weeklyAllowance = dailyAllowance *5;
        double worthofExpenses = 388.56;
        double remainingAllowance = weeklyAllowance -worthofExpenses;

    System.out.println("Student: " + studentName);
        System.out.println("Total Weekly Allowance: P" + weeklyAllowance);
    System.out.println("Weekly Expenses: P" + worthofExpenses);
    System.out.println("Total Remaining Allowance: P" + remainingAllowance);
    }
}

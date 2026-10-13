public class StudentAttendanceSystem {
    public static void main(String[] args) {
        String studentname = "Pedro Reyes";
        int presentdays = 20;
        int absentdays = 2;
        int dayspresent = 18;
    double attendance = 90.90;
    int finalAttendance = (int) attendance; // remove decimal, become 90
    System.out.println(finalAttendance + "0%"); //90.0%
    boolean hascompletedrequirements = true;

    System.out.println("Student Name:" + studentname);
    System.out.println("Present Days:" + presentdays);
    System.out.println("Absent Days:" + absentdays);
    System.out.println("Days Present:" + dayspresent);
    System.out.println("Attendance:" + attendance);
    System.out.println("Final Attendance:" + finalAttendance);
    System.out.println("Completed Requirements:" + hascompletedrequirements);
    }
}

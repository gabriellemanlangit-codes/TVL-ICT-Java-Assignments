import java.util.Scanner;

public class studentgradeEvaluator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String studentName;
        int wwScore, wwTotal;
        int ptScore, ptTotal;
        int examScore, examTotal;
        int ww, pt, exam, average;

        System.out.print("Student Name: ");
        studentName = input.nextLine();

        System.out.print("Written Works Score: ");
        wwScore = input.nextInt();

        System.out.print("Written Works Total Score: ");
        wwTotal = input.nextInt();

        System.out.print("Performance Task Score: ");
        ptScore = input.nextInt();

        System.out.print("Performance Task Total Score: ");
        ptTotal = input.nextInt();

        System.out.print("Examination Score: ");
        examScore = input.nextInt();

        System.out.print("Examination Total Score: ");
        examTotal = input.nextInt();

            ww = (wwScore *50 /wwTotal) +50;
            pt = (ptScore *50 /ptTotal) +50;
            exam = (examScore *50 /examTotal) +50;

            average = (ww + pt + exam) /3;

                 System.out.println();
                 System.out.println("===== STUDENT GRADE EVALUATOR =====");
                 System.out.println("Student Name: " + studentName);
                 System.out.println("Written Work: " + ww);
                 System.out.println("Performance Task: " + pt);
                 System.out.println("Examination: " + exam);
                 System.out.println("Average: " + average);

              if (average >= 90) {
                System.out.println("Remark: Excellent");
              
            } else if (average >= 75) {
                System.out.println("Remark: Passed");
              
            } else {
                System.out.println("Remark: Failed"); 
            }
            input.close();
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
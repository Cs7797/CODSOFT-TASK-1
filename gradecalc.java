import java.util.Scanner;

public class gradecalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int totalMarks = 0;
        double percentage;
        String grade;
        System.out.println("Enter marks for five subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            // Internship project by chetan seth.
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Please enter a value between 0 and 100.");
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }
            totalMarks += marks[i];
        }  
        percentage = (double) totalMarks / 5;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        
    }
}
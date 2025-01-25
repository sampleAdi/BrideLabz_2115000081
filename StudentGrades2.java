import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Number of subjects
        int numSubjects = 3;  // Physics, Chemistry, Maths

        // Create a 2D array to store the marks of students in physics, chemistry, and maths
        int[][] marks = new int[numStudents][numSubjects];

        // Get marks for each student in all subjects
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = scanner.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = scanner.nextInt();
        }

        // Calculate the percentage and grade for each student
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            // Calculate the total marks for the student
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            // Calculate the percentage
            double percentage = (totalMarks / 300.0) * 100;

            // Determine the grade based on the percentage
            String grade = "";
            if (percentage >= 90) {
                grade = "A";
            } else if (percentage >= 75) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Display the results
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Total Marks: " + totalMarks + " out of 300");
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade + "\n");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        System.out.println("Enter the ages of 10 students:");

        // Taking input for student ages
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Checking voting eligibility
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i];
            if (age < 0) {
                System.out.println("Invalid age entered for student " + (i + 1) + ".");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        scanner.close();
    }
}

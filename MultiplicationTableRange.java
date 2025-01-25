import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number to generate its multiplication table (from 6 to 9): ");
        int number = scanner.nextInt();

        // Define an array to store the multiplication results
        int[] multiplicationResult = new int[4];

        // Calculate the multiplication table for the range 6 to 9
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 6); // Store results for 6, 7, 8, and 9
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table for " + number + " (from 6 to 9):");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        scanner.close();
    }
}

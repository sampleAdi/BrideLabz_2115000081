import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for the number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store the results
        int[] multiplicationTable = new int[10];

        // Generate the multiplication table
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = number * (i + 1); // Store the result in the array
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array of 10 elements and a variable for the total sum
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0; // To track the number of inputs

        System.out.println("Enter up to 10 numbers (enter 0 or a negative number to stop):");

        // Infinite loop to take input from the user
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();

            // Check if the user entered 0 or a negative number
            if (input <= 0) {
                break;
            }

            // Store the input in the array and increment the index
            numbers[index] = input;
            index++;

            // Break if the maximum size of the array is reached
            if (index == 10) {
                break;
            }
        }

        // Calculate the total and display all entered numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i]; // Add to total
        }

        // Display the total sum
        System.out.println("\nThe total sum of the numbers is: " + total);

        scanner.close();
    }
}

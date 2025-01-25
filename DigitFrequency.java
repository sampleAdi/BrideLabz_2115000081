import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Convert the number to a string to count the digits
        String numberStr = String.valueOf(number);

        // Create an array to store the frequency of digits (0-9)
        int[] frequency = new int[10];

        // Loop through the digits in the number string
        for (int i = 0; i < numberStr.length(); i++) {
            // Get the digit at the current position and update its frequency
            int digit = Character.getNumericValue(numberStr.charAt(i));
            frequency[digit]++;
        }

        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}

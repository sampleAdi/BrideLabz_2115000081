import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the base number and power from the user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize the result variable to 1
        int result = 1;

        // Calculate the power using a for loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
